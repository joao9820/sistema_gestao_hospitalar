<%-- 
    Document   : menu.jsp
    Created on : 27/10/2019, 22:36:33
    Author     : usuaio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@include file="/includes/cabecalho.html" %>
<%@include file="/includes/menu_header.jsp" %>
        <h1>Menu do Sistema</h1>
        
        <p>Olá ${sessionScope.usuarioLogado.nome}</p>
        <p>${sessionScope.usuarioLogado.email}</p>
        <ul>
            <li>
                <a href="/GestaoHospitalar/cadastro_medicamentos.jsp">Cadastrar Medicamentos</a>
                <a href="${pageContext.request.contextPath}/logout.jsp?login=0">Sair</a>
                
                <!-- Logout tem referencia a Servlet @WebServlet(name = "Index", urlPatterns = {"/index.jsp", "/logout.jsp"}) -->
            </li>
        </ul>
    
<%@include file="/includes/rodape.html" %>