<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html> <!--É UMA DECLARAÇÃO PARA INFORMAR AO NAVEGADOR QUAL A VERSÃO DO HTML UTILIZADA-->
<html>  <!-- FINALIZA O DOCUMENTO HTML-->
    <head> <!-- FINALIZA A TAG HEAD-->
        <meta charset="utf-8" />
        <title>Novo Livro</title> <!-- DEFINE O TÍTULO DO DOCUMENTO-->
    </head> <!-- FINALIZA A TAG HEAD-->
    <body> <!-- DEFINE O CORPO DO DOCUMENTO-->
       <h1>Novo Livro/h1> <!-- EXIBE UM TITULO-->
           <hr>  <!-- MOSTRA UMA LINHA HORIZONTAL-->
           <form action="insert" method="post">
               <label for="titulo">titulo</label>
               <input type="test" name="titulo"/> <!-- CRIA UM CONTROLE DE FORMULÁRIO NA TELA-->
               <a href="/livro/list">Voltar</a> 
               input type="submit" value+"Salvar"/> <!-- CRIA UM CONTROLE DE FORMULÁRIO NA TELA-->
           </form> <!-- FINALIZA O FORMULARIO-->

        <h1>Lista de livros. Luciana Martessi</h1>
    </body> <!-- DEFINE O CORPO DO DOCUMENTO-->
</html>  <!-- FINALIZA O DOCUMENTO HTML-->

