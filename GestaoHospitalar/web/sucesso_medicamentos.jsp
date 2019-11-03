<%-- 
    Document   : sucesso_medicamentos
    Created on : 02/11/2019, 16:56:15
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="includes/cabecalho.html" %> 
       
        <%
          String nome = (String)request.getAttribute("nome");
     %>
        <div>
            <div class="alert alert-success" role="alert">
                <p><h3>O cadastro do medicamento <b><%=nome%></b> foi executada com sucesso!</h3></p></div>
       </div>
       <div>
           <a href="cadastro_medicamentos.jsp" ><button type="button" class="btn btn-success">Voltar</button></a>
               <a href="listar_medicamentos.jsp" ><button type="button"  class="btn btn-info" >Listar</button></a>
       </div>
       
       
    </body>
</html>
