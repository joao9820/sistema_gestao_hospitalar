<%-- 
    Document   : cadastro_medicamentos
    Created on : 23/10/2019, 18:50:54
    Author     : matheus.louzeiro
--%>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
  
    
            <div class='container col-md-3' >
   
    
    <form action='Ghospitalar' method="POST">
       <h1>Cadastro de Medicamentos</h1>    <form action='G_hospitalar_Servlet.java' method="POST">

             <div class="form-group" >
               Nome: <input type='text' class='form-control' name='nome' />                     
             </div>
             <div class="form-group" >
               Descricão: <input type='text' class='form-control' name='descricao' />                     
             </div>
                     <div class="form-group" >
               Quantidade: <input type='text' class='form-control' name='quantidade' />                     
             </div>
                     <div class="form-group" >
               Valor: <input type='text' class='form-control' name='valor' />                     
             </div>
                     <div class="form-group" >
               Estoque Min <input type='text' class='form-control' name='estoque' />                     
             </div>
             <div class="form-group" >
               Data de Criação: <input type='text' class='form-control' name='data_criacao' />                     
             </div>
             <div class="form-group" >
               Data de Modificação: <input type='text' class='form-control' name='data_mod' />                     
             </div>

            <div class="form-group">
                <button class="btn btn-primary" value='enviar' type="submit">Enviar</button>&nbsp;&nbsp;
                <button class="btn btn-danger" value='Limpar' type="reset">Limpar</button>
            </div>
        </form>
    </div>
        
        
    </body>
</html>
