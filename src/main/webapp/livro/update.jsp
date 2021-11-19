<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html> <!--É UMA DECLARAÇÃO PARA INFORMAR AO NAVEGADOR QUAL A VERSÃO DO HTML UTILIZADA-->
<html>  <!-- FINALIZA O DOCUMENTO HTML-->
    <head> <!-- FINALIZA A TAG HEAD-->
        <meta charset="utf-8" />
        <title>Editar Livro</title> <!-- DEFINE O TÍTULO DO DOCUMENTO-->
    </head> <!-- FINALIZA A TAG HEAD-->
    <body> <!-- DEFINE O CORPO DO DOCUMENTO-->
       <h1>Editar Livro</h1>
           <hr>  <!-- MOSTRA UMA LINHA HORIZONTAL-->
           <form action= "/livro/update" method="post">
            <input type="hidden" name="id" value="${livro.id}"/>
               <label for="titulo">titulo</label>

               <input type="text" name="titulo" value="${livro.titulo}"/>
               <a href="/livro/list">Voltar</a>
               <input type="submit" value="Salvar"/>
           </form> <!-- FINALIZA O FORMULARIO-->

        
    </body> <!-- DEFINE O CORPO DO DOCUMENTO-->
</html>  <!-- FINALIZA O DOCUMENTO HTML-->