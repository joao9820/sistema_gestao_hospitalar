<%-- 
    Document   : sucesso_medicamentos
    Created on : 02/11/2019, 16:56:15
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="includes/cabecalho.html" %> 
<%@include file="/includes/menu_header.jsp" %>
<%
    String nome = (String) request.getAttribute("nome");
%>
<div>
    <div class="alert alert-success" role="alert">
        <p><h3>O cadastro do medicamento <b><%=nome%></b> foi executada com sucesso!</h3></p></div>
</div>
<div>
    <a href="cadastro_medicamentos.jsp" ><button type="button" class="btn btn-success">Voltar</button></a>
    <a href="listar_medicamentos.jsp" ><button type="button"  class="btn btn-info" >Listar</button></a>
</div>

<%@include file="includes/rodape.html" %> 
