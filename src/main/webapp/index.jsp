<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt">

<head>
   <meta charset="utf-8">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <title>Project Web - Home</title>

   <link rel="stylesheet" href="css/style.css">

</head>

<body>

   <main>
      <nav class="navbar">
         <div class="titleNav">
            <a href="index.jsp">Project Web</a>
         </div>
         
         <div class="navbar-btn">
            <a href="html/cliente.jsp" class="btn-nav">Clientes</a>
            <a href="html/produto.jsp" class="btn-nav">Produtos</a>
            <a href="html/venda.jsp" class="btn-nav">Vendas</a>
         </div>
      </nav>
      
      <section class="sectionCards">
         <div class="card">
            <a href="html/cliente.jsp">
               <img src="assets/clienteCard.png" alt="Imagem de cadastro de clientes">
               <div class="textCard">
                  <h3>Clientes</h3>
               </div>
            </a>
         </div>
         <div class="card">
            <a href="html/produto.jsp">
               <img src="assets/produtosCard.png" alt="Imagem de cadastro de clientes">
               <div class="textCard">
                  <h3>Produtos</h3>
               </div>
            </a>
         </div>
         <div class="card">
            <a href="html/venda.jsp">
               <img src="assets/vendasCard.png" alt="Imagem de cadastro de clientes">
               <div class="textCard">
                  <h3>Vendas</h3>
               </div>
            </a>
         </div>
      </section>

      <footer>
         <div>
            <p><a href="https://github.com/WhiteArct1c">Matheus Bispo </a>& Jackson © 2022</p>
         </div>
      </footer>

   </main>
</body>

</html>