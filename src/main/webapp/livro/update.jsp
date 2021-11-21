<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <!--CONFIGURAÇÃO DA PAGINA JSP-->

<!DOCTYPE html> <!--É UMA DECLARAÇÃO PARA INFORMAR AO NAVEGADOR QUAL A VERSÃO DO HTML UTILIZADA-->
<html>  <!-- FINALIZA O DOCUMENTO HTML-->
    <head> <!-- FINALIZA A TAG HEAD-->
        <meta charset="utf-8" /> <!-- DEFINE A CODIFICAÇÃO COMO UTF-8-->
        <title>Editar Livro</title> <!-- DEFINE O TÍTULO DO DOCUMENTO-->
    </head> <!-- FINALIZA A TAG HEAD-->
    <body> <!-- DEFINE O CORPO DO DOCUMENTO-->
       <h1>Editar Livro</h1> <!-- EXIBE UM TITULO-->
           <hr>  <!-- MOSTRA UMA LINHA HORIZONTAL-->
           <form action= "/livro/update" method="post"> <!-- DECLARA UM FORMULÁRIO COM MÉTODO POST-->
            <input type="hidden" name="id" value="${livro.id}"/> <!-- CRIA UM CAMPO DE TEXTE OCULTO QUE AUTOMATICAMENTE,  RECEBE O VALOR (ID) DO LIVRO -->
               <label for="titulo">titulo</label> <!-- CRIA LEGENDA PARA UM ITEM EM UMA INTERFACE DE USUÁRIO, FOR ELEMENTO ID DE UM FORMULÁRIO RELACIONADO COM LABELABLE NO MESMO DOCUMENTO COMO ELEMENTO LABEL-->

               <input type="text" name="titulo" value="${livro.titulo}"/>  <!-- CRIA UM CAMPO DE TEXTE OCULTO QUE AUTOMATICAMENTE,  RECEBE O VALOR (ID) DO LIVRO -->
               <input type="submit" value="Salvar"/> <!-- CRIA UM CAMPO DE TEXTE OCULTO QUE AUTOMATICAMENTE  RECEBE O VALOR SALVAR-->
           </form> <!-- FINALIZA O FORMULARIO-->

        
    </body> <!-- DEFINE O CORPO DO DOCUMENTO-->
</html>  <!-- FINALIZA O DOCUMENTO HTML-->