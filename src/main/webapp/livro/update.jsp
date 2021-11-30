<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <!--Indica características CONFIGURAÇÃO DA PAGINA JSP-->

<!DOCTYPE html> <!--É UMA DECLARAÇÃO PARA INFORMAR AO NAVEGADOR QUAL A VERSÃO DO HTML UTILIZADA-->
<html>  <!-- FINALIZA O DOCUMENTO HTML-->
    <head> <!-- FINALIZA A TAG HEAD-->
        <meta charset="utf-8" /> <!-- DEFINE A CODIFICAÇÃO COMO UTF-8-->
        <title>Editar Livro</title> <!-- DEFINE O TÍTULO DO DOCUMENTO-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head> <!-- FINALIZA A TAG HEAD-->
    <body> <!-- DEFINE O CORPO DO DOCUMENTO-->
       <h1>Editar Livro</h1> <!-- EXIBE UM TITULO-->
           <hr>  <!-- MOSTRA UMA LINHA HORIZONTAL-->
           <form action= "/livro/update" method="post"> <!-- DECLARA UM FORMULÁRIO COM MÉTODO POST-->
            <input type="hidden" name="id" value="${livro.id}"/> <!-- CRIA UM CAMPO DE TEXTE OCULTO QUE AUTOMATICAMENTE,  RECEBE O VALOR (ID) DO LIVRO -->
               <label for="titulo">titulo</label> <!-- CRIA LEGENDA PARA UM ITEM EM UMA INTERFACE DE USUÁRIO, FOR ELEMENTO ID DE UM FORMULÁRIO RELACIONADO COM LABELABLE NO MESMO DOCUMENTO COMO ELEMENTO LABEL-->

               <input type="text" name="titulo" value="${livro.titulo}"/>  <!-- CRIA UM CAMPO DE TEXTE OCULTO QUE AUTOMATICAMENTE,  RECEBE O VALOR (ID) DO LIVRO -->
               <a href="/livro/list" class="btn btn-warning">Voltar</a>
               <input type="submit" value="Salvar"/> <!-- CRIA UM CAMPO DE TEXTE OCULTO QUE AUTOMATICAMENTE  RECEBE O VALOR SALVAR-->

           </form> <!-- FINALIZA O FORMULARIO-->
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
            integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
            crossorigin="anonymous"></script>   <!-- Declara o separate -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
            integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
            crossorigin="anonymous"></script>   <!-- Declara o separate -->
    </body> <!-- DEFINE O CORPO DO DOCUMENTO-->
</html>  <!-- FINALIZA O DOCUMENTO HTML-->