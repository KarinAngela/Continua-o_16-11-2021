<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <!--CONFIGURAÇÃO DA PAGINA JSP-->

<!DOCTYPE html> <!--É UMA DECLARAÇÃO PARA INFORMAR AO NAVEGADOR QUAL A VERSÃO DO HTML UTILIZADA-->
<html>  <!-- INCIA O CORPO DO DOCUMENTO HTML-->
    <head> <!-- INICIA A TAG HEAD-->
        <meta charset="utf-8" /> <!-- DEFINE A CODIFICAÇÃO COMO UTF-8-->
        <title>Novo Livro</title> <!-- DEFINE O TÍTULO DO DOCUMENTO-->
    </head> <!-- FINALIZA A TAG HEAD-->
    <body> <!-- FINALIZA O CORPO DO DOCUMENTO-->
       <h1>Novo Livro/h1> <!-- EXIBE UM TITULO-->
           <hr>  <!-- MOSTRA UMA LINHA HORIZONTAL-->
           <form action="insert" method="post"> <!-- DECLARA UM FORMULÁRIO COM MÉTODO POST-->
               <label for="titulo">titulo</label> <!-- CRIA LEGENDA PARA UM ITEM EM UMA INTERFACE DE USUÁRIO, FOR ELEMENTO ID DE UM FORMULÁRIO RELACIONADO COM LABELABLE NO MESMO DOCUMENTO COMO ELEMENTO LABEL-->
               <input type="test" name="titulo"/> <!-- CRIA UM CONTROLE DE FORMULÁRIO NA TELA-->
               <a href="/livro/list">Voltar</a>  <!-- ESTABELECE ESTILIZADA BOOTSTRAP -->
               input type="submit" value+"Salvar"/> <!-- CRIA UM CONTROLE DE FORMULÁRIO NA TELA-->
           </form> <!-- FINALIZA O FORMULARIO-->

        <h1>Lista de livros. Karin Angela/h1> <!-- EXIBE UM TITULO-->
    </body> <!-- FINALIZA O CORPO DO DOCUMENTO-->
</html>  <!-- FINALIZA O DOCUMENTO HTML-->

