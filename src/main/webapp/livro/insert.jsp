<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <!--CONFIGURAÇÃO DA PAGINA JSP-->

<!DOCTYPE html>  <!--É UMA DECLARAÇÃO PARA INFORMAR AO NAVEGADOR QUAL A VERSÃO DO HTML UTILIZADA-->
<html> <!-- INICIA O DOCUMENTO HTML-->
    <head> <!-- INICIA A TAG HEAD-->
        <meta charset="utf-8" /> <!-- DEFINE A CODIFICAÇÃO COMO UTF-8-->
        <title>Novo Livro</title> <!-- DEFINE O TÍTULO DO DOCUMENTO-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous"> <!--É USADO PARA CONFIGURAR O BOOTSTRAP NO DOCUMENTO JSP-->

    </head> <!-- FINALIZA A TAG HEAD-->
    <body> <!-- DEFINE O CORPO DO DOCUMENTO-->
       <h1>Novo Livro</h1> <!-- EXIBE UM TITULO-->
           <hr>  <!-- MOSTRA UMA LINHA HORIZONTAL-->
           <form action="insert" method="post"> <!-- DECLARA UM FORMULÁRIO COM MÉTODO POST-->
               <label for="titulo">titulo</label>  <!-- CRIA LEGENDA PARA UM ITEM EM UMA INTERFACE DE USUÁRIO, FOR ELEMENTO ID DE UM FORMULÁRIO RELACIONADO COM LABELABLE NO MESMO DOCUMENTO COMO ELEMENTO LABEL-->
               <input type="text" name="titulo"/> <!-- CRIA UM CONTROLE DE FORMULÁRIO NA TELA-->
               <a href="/livro/list" class="btn btn-secondary">Voltar</a> <!-- ESTABELECE ESTILIZADA BOOTSTRAP -->
               <input type="submit" value="Salvar" class="btn btn-warning"/> <!-- ESTABELECE ESTRILIZADA BOOTSTRAP-->
           </form> <!-- FINALIZA O FORMULARIO-->

  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script> <!--DECLARA O SEPARATE-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script> <!--DECLARA O SEPARATE-->

    </body> <!-- FINALIZA O CORPO DO DOCUMENTO-->
</html>  <!-- FINALIZA O DOCUMENTO HTML-->