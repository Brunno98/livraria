# livraria
Trabalho da disciplina de Programação Orientada a objetos em Java, onde o aluno deve criar uma página que realize um CRUD para algum produto.
<hr>

<b>Trabalho:</b>
Faça um programa em Java seguindo as orientações abaixo:
<ul>
  <li>Faça o protótipo da aplicação utilizando o site https://start.spring.io/;</li>
  <li>Ao fazer protótipo, certifique-se de utilizar as opções:</li>
  <ul>
    <li>Project: Maven Project</li>
    <li>Language: Java</li>
    <li>Spring Boot: 2.5.0</li>
    <li>Project Metadata (Group): br.com        </li>
    <li>Project Metadata (Artifact): <nome da sua aplicação> (colocar em letras minúsculas)</li>
    <li>Project Metadata (Name): mesmo que o item anterior</li>
    <li>Project Metadata (Description): Escrever a descrição do projeto. Texto Livre.</li>
    <li>Project Metadata (Package name): automaticamente preenchido</li>
    <li>Packaging: Jar</li>
    <li>Java: 8</li>
    <li>Dependencies: Adicionar as dependências, clicando no botão ADD DEPENDENCIES... Adicione as seguintes dependências: Spring Web, Thymeleaf, Spring Data JPA, H2 Database</li>
  </ul>
  <li>Clique no botão GENERATE. O download do protótipo será feito automaticamente.</li>
  <li>Importe o protótipo no NetBeans, utilizando a opção: FILE-> Import Project-> From Zip</li>
  <li>Crie uma estrutura de pacotes conforme ensinado na aula. Tenha em mente que sua aplicação deve ter o pacote “controller”, o pacote “model”, o pacote “repository”. A figura mostra uma estrutura de pacotes na aplicação “exemplo”.</li>

![Imagem](https://user-images.githubusercontent.com/63423435/120255638-ce615180-c262-11eb-8da4-c011fcbe1dfb.png)

 
  <li>Crie um arquivo chamado index.html na pasta Other Sources- > src/main/resources->templates. Vc pode criar o arquivo clicando com o botão direito nessa pasta e selecionando: new-> Other. Selecione a pasta Other e HTML File.</li>
  <li>Dentro do index.html, coloque o nome e a matrícula dos integrantes do grupo.</li>
  <li>Execute o projeto. Abra o navegador e verifique se o sistema está rodando. Acesse: http://localhost:8080.</li>
  <li>Volte ao projeto. Interrompa a execução. Agora, dentro do pacote “model”, crie uma classe de Modelo da sua preferência, com seus respectivos atributos, mas diferente da utilizada em sala de aula (ou seja, não pode ser a classe Produto).  Não esqueça de fazer os getters e setters.</li>
  <li>Dentro do pacote “repository”, faça o respectivo repositório da classe de Modelo criada, com o seguinte nome: <NomeClasseModelo>Repository. Para criar o repositório, crie uma interface, estendendo CRUDRepository, conforme ensinado em sala de aula.</li>
  <li>Dentro do pacote “controller”, faça o controlador com o seguinte nome: <NomeClasseModelo>Controller. Para facilitar, você pode copiar o código de exemplo do controlador feito em sala de aula. Não esqueça de alterar os endereços e nomes de arquivos dentro de cada método.</li>
  <li>Faça as telas. Para facilitar, você pode copiar os arquivos de exemplo da sala de aula para dentro de Other Sources- > src/main/resources->templates. Não esqueça de alterar esses arquivos para a sua aplicação.</li>
  <li>Antes de entregar: Execute o programa. Verifique se os endereços estão respondendo corretamente nos endereços descritos no controlador.  Verifique também se as operações CRUD estão funcionando.</li>
  <li>Entregue o projeto em formato zip, exportando-o a partir do NetBeans. Anexe-o no Teams. Não esqueça que cada integrante do grupo deve anexar o projeto também.</li>

<li>Ganhe um ponto extra: coloque o código no gitub e suba o projeto para o heroku. Me mande o link!</li>
</ul>
