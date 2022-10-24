<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"  %>


<!DOCTYPE html>
<html lang="pt">

<head>
   <meta charset="utf-8">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <title>Project Web - Cliente</title>

   <link rel="stylesheet" href="../css/style.css">

</head>

<body>

   <main>
        <nav class="navbar">
            <div class="titleNav">
                <a href="../index.jsp">Project Web</a>
            </div>
         
            <div class="navbar-btn">
                <a href="./cliente.jsp" class="btn-nav">Clientes</a>
                <a href="./produto.jsp"class="btn-nav">Produtos</a>
                <a href="./venda.jsp" class="btn-nav">Vendas</a>
            </div>
        </nav>

        <section class="sectionCliente">
            <h1>Listagem de Clientes</h1>
            <table>
                <tr class="titleTable">
                    <th>Codigo</th>
                    <th>Nome</th>
                    <th>E-mail</th>
                    <th>Telefone</th>
                </tr>
                <c:forEach var="item" items="${lista}" >
                    <tr class="itensTable">
                        <td><c:out value="${item.codigo}" /> </td>
                        <td><c:out value="${item.nome}"/></td>
                        <td><c:out value="${item.email}"/></td>
                        <td><c:out value="${item.telefone}"/></td>
                        <td><a href="ClienteDelete?id=<c:out value="${item.codigo}" />">Deletar</a></td>
                        <td><a href="ClienteEdit?id=<c:out value="${item.codigo}" />">Editar</a></td>
                    </tr>
                </c:forEach>
        </section>

        <footer>
            <div>
                <p><a href="https://github.com/WhiteArct1c">Matheus Bispo </a>& Jackson © 2022</p>
            </div>
        </footer>

   </main>

</body>

</html>