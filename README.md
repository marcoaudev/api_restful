<h1>Projeto API RESTful - CRUD</h1>

<h2>Descrição do Projeto</h2>
<p>
    Este projeto é uma API RESTful desenvolvida com o framework Play, utilizando Scala e projetada para operações de CRUD (Create, Read, Update, Delete). 
    A API é adequada para qualquer aplicação que necessite de uma interface para manipulação de dados com endpoints de fácil integração. 
    Com uma arquitetura robusta, ela segue os princípios REST, oferecendo recursos escaláveis para operações em entidades de dados. Não foi feito nenhuma interface, pois a aplicação é um trabalho
    da faculdade para apenas ser testada via Postman.
</p>

<h2>Tecnologias Utilizadas</h2>
<ul>
    <li><strong>Scala</strong>: Linguagem de programação funcional e orientada a objetos utilizada para a lógica de negócios.</li>
    <li><strong>Play Framework 3.0.5</strong>: Framework web assíncrono que permite criar APIs de alto desempenho com suporte para Scala.</li>
    <li><strong>sbt (Simple Build Tool) 1.10.3</strong>: Ferramenta de construção e dependência para gerenciar o build do projeto.</li>
    <li><strong>Java 17.0.13</strong>: Ambiente de execução para o compilador Scala e para o framework Play.</li>
</ul>

<h2>Configuração do Projeto</h2>
<p>Certifique-se de ter as versões corretas das tecnologias listadas abaixo:</p>
<ul>
    <li><strong>Scala</strong>: 2.13.15</li>
    <li><strong>sbt</strong>: 1.10.3</li>
    <li><strong>Java</strong>: 17.0.13</li>
    <li><strong>Play Framework</strong>: 3.0.5</li>
</ul>

<h3>Pré-requisitos</h3>
<ol>
    <li>Instale o JDK 17: <a href="https://www.oracle.com/java/technologies/javase-jdk17-downloads.html" target="_blank">Oracle JDK 17</a> ou <a href="https://openjdk.java.net/projects/jdk/17/" target="_blank">OpenJDK 17</a>.</li>
    <li>Instale o Scala: Certifique-se de que a versão seja 2.13.15. Para instalar, consulte <a href="https://www.scala-lang.org/download/" target="_blank">Scala Setup Guide</a>.</li>
    <li>Instale o sbt: Versão 1.10.3. Consulte <a href="https://www.scala-sbt.org/download.html" target="_blank">sbt download page</a> para obter instruções de instalação.</li>
    <li>Instale o Play Framework: A instalação do Play é gerenciada pelo sbt e será configurada automaticamente durante o build.</li>
</ol>

<h3>Como Executar o Projeto</h3>
<p>Após configurar o ambiente, siga os passos abaixo para executar o projeto:</p>

<ol>
    <li>Clone o repositório:
        <pre><code>git clone https://github.com/usuario/nome-do-repositorio.git
cd nome-do-repositorio</code></pre>
    </li>
    <li>Execute o comando para iniciar o Play Framework:
        <pre><code>sbt run</code></pre>
    </li>
    <li>Acesse a API em: <a href="http://localhost:9000" target="_blank">http://localhost:9000</a></li>
</ol>

<h2>Estrutura de Endpoints</h2>
<p>A API fornece os seguintes endpoints:</p>
<ul>
    <li><code>GET /entidade</code>: Retorna uma lista de entidades.</li>
    <li><code>POST /entidade</code>: Cria uma nova entidade.</li>
    <li><code>GET /entidade/{id}</code>: Retorna detalhes de uma entidade específica.</li>
    <li><code>PUT /entidade/{id}</code>: Atualiza uma entidade existente.</li>
    <li><code>DELETE /entidade/{id}</code>: Remove uma entidade.</li>
</ul>
