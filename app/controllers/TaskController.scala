package controllers

import javax.inject._
import play.api.mvc._
import play.api.libs.json._
import models.TaskModel

@Singleton
class TaskController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  
  // Simulação de um banco de dados em memória
  private var tasks = List(
    TaskModel(1, "Learn Play Framework", completed = false),
    TaskModel(2, "Build a REST API", completed = true)
  )

  // Definindo o formato JSON para o modelo
  implicit val taskFormat: OFormat[TaskModel] = Json.format[TaskModel]

  // Endpoint para listar todas as tarefas
  def listTasks: Action[AnyContent] = Action {
    Ok(Json.toJson(tasks))
  }

  // Endpoint para obter uma tarefa pelo ID
  def getTask(id: Long): Action[AnyContent] = Action {
    tasks.find(_.id == id) match {
      case Some(task) => Ok(Json.toJson(task))
      case None       => NotFound(Json.obj("error" -> "Task not found"))
    }
  }

  // Endpoint para criar uma nova tarefa
  def createTask: Action[JsValue] = Action(parse.json) { request =>
    request.body.validate[TaskModel].fold(
      errors => BadRequest(Json.obj("error" -> JsError.toJson(errors))),
      task => {
        tasks = tasks :+ task
        Created(Json.toJson(task))
      }
    )
  }

  // Endpoint para atualizar uma tarefa existente (PUT)
  def updateTask(id: Long): Action[JsValue] = Action(parse.json) { request =>
    request.body.validate[TaskModel].fold(
      errors => BadRequest(Json.obj("error" -> JsError.toJson(errors))),
      updatedTask => {
        tasks.indexWhere(_.id == id) match {
          case -1 => NotFound(Json.obj("error" -> "Task not found"))
          case index =>
            tasks = tasks.updated(index, updatedTask.copy(id = id))
            Ok(Json.toJson(updatedTask))
        }
      }
    )
  }

  // Endpoint para deletar uma tarefa pelo ID (DELETE)
  def deleteTask(id: Long): Action[AnyContent] = Action {
    tasks.indexWhere(_.id == id) match {
      case -1 => NotFound(Json.obj("error" -> "Task not found"))
      case index =>
        tasks = tasks.patch(index, Nil, 1)
        NoContent
    }
  }
}

