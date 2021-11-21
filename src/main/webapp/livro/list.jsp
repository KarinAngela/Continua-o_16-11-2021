<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <!--CONFIGURAÇÃO DA PAGINA JSP-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html> <!--É UMA DECLARAÇÃO PARA INFORMAR AO NAVEGADOR QUAL A VERSÃO DO HTML UTILIZADA-->
<html>  <!-- FINALIZA O DOCUMENTO HTML-->
    <head> <!-- FINALIZA A TAG HEAD-->
        <meta charset="utf-8" /> <!-- DEFINE A CODIFICAÇÃO COMO UTF-8-->
        <title>Livros</title> <!-- DEFINE O TÍTULO DO DOCUMENTO-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    </head> <!-- FINALIZA A TAG HEAD-->
    <body> <!-- DEFINE O CORPO DO DOCUMENTO-->
        <main class="container">
            <h1>Livros</h1> <!-- EXIBE UM TITULO-->
            <a href="/livro/insert" class="btn btn-primary">Novo livro</a>
        <table> <!--DEFINE UMA TABELA-->
            <tr> <!-- COLOCA DENTRO DE UM TABLE PARA DEFINIR UMA LINHA DA TABELA-->
                <th>ID</th>
                <th>Título</th>
            </tr> <!-- COLOCA DENTRO DE UM TABLE PARA DEFINIR UMA LINHA DA TABELA -->
            <c:forEach var="l" items="${livros}">
                <tr> <!-- COLOCA DENTRO DE UM TABLE PARA DEFINIR UMA LINHA DA TABELA-->
                    <td>${l.id}</td>
                    <td>${l.titulo}</td>
                    <td> <!-- COLOCA DENTRO DE UM TR PARA DEFINIR UMA CÉLULA-->
                        <a href="/livro/update/${l.id}" class="btn btn-primary">Atualizar livro</a>
                    </td> <!-- FINALIZA O QUE ESTÁ DO  TR PARA DEFINIR UMA CÉLULA-->
                    <td> <a href="/livro/delete/${l.id}" class="btn btn-danger">Deletar livro</a></td>

                </tr> <!-- FINALIZA  O TABLE  QUE ESTA  DEFINIDO NA  LINHA DA TABELA-->

            </c:forEach>
        </table> <!--FINALIZA A  TABELA-->

        <h1>Lista de livros. Luciana Martessi</h1> <!-- EXIBE UM TITULO-->

        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script> <!--DECLARA O SEPARATE-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script> <!--DECLARA O SEPARATE-->
    </main></body>
</html>  <!-- FINALIZA O DOCUMENTO HTML-->
