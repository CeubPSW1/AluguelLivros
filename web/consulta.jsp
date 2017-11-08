<%-- 
    Document   : index
    Created on : 08/11/2017, 19:37:38
    Author     : Alexandre.Torres
--%>

<%@page import="java.util.List"%>
<%@page import="model.Livro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <% 
        List<Livro> livros = (List)request.getAttribute("livros");
    %>
    <body>
        <div class="container">
            <table>
                <tr>
                    <th>Titulo</th>
                    <th>Páginas</th>
                    <th>Tipo</th>
                    <th>Disponivel</th>
                </tr>
                <% for (Livro livro:livros){%>
                <tr>
                    <td><%= livro.getTitulo() %></td>
                    <td><%= livro.getPaginas() %></td>
                    <td><%= livro.getTipo() %></td>
                    <td><%= livro.isDisponivel() %></td>
                </tr>
                <% }%>
            </table>
        </div>
    </body>
</html>
