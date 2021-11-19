<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html> <!--É UMA DECLARAÇÃO PARA INFORMAR AO NAVEGADOR QUAL A VERSÃO DO HTML UTILIZADA-->
<html> <!-- FINALIZA O DOCUMENTO HTML-->
    <head> <!-- FINALIZA A TAG HEAD-->
        <meta charset="utf-8" />
        <title>Deletar um Livro</title> <!-- DEFINE O TÍTULO DO DOCUMENTO-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous"
    </head> <!-- FINALIZA A TAG HEAD-->
<body> <!--DEFINE O CORPO DO DOCUMENTO-->
        <main class="container"> <!-- INICIA A TAG MAIN DO CONTEÚDO PRINCIPAL DE DOCUMENTO-->
       <h1>Deletar um livro</h1> <!-- EXIBE UM TITULO-->
           <hr> <!-- MOSTRA UMA LINHA HORIZONTAL-->
<p>tem certeza que deseja deletar o livro<em>"${livro.titulo}"</em>?</p> <!-- EXIBE UM PARÁGRAFO COM O NOME DO LIVRO PERGUNTANDO SE DESEJA DELETAR-->
           <form action="/livro/delete" method="post"> <!-- DECLARA UM FORMULÁRIO COM MÉTODO POST-->
            <input type="hidden" name="id"value="${livro.id}"/> <!-- CRIA UM CAMPO DE TEXTE OCULTO QUE AUTOMATICAMENTE -->
               
              
               <a href="/livro/list" class="btn btn-primary">Voltar</a> <!-- ESTABELECE ESTILIZADA BOOTSTRAP -->
               <input type="submit" value="Deletar" class="btn btn-secondary"></button> <!--  DEFINE UM VALOR FIXO PARA ENTRADA DE DADOS-->
           </form> <!-- FINALIZA O FORMULARIO-->

        </main> <!--DEFINE O CONTEUDO PRINCIPAL-->
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    
   </body> <!-- DEFINE O CORPO DO DOCUMENTO-->
</html> <!-- FINALIZA  O DOCUMENTO HTML-->

