<%-- 
    Document   : index.jsp
    Created on : 27/10/2019, 22:35:32
    Author     : usuaio
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="/includes/cabecalho.html" %>

<style>
    #erro {
    width: 50%;
    margin: 0 auto;
    border: 1px solid red;
    background-color: beige;
}
</style>
        <h1>Autenticação de Usuário</h1>
        <c:if test="${mensagens.existeErros}">
            <div id="erro">
                <ul>
                    <c:forEach var="erro" items="${mensagens.erros}">
                        <li> ${erro} </li>
                        </c:forEach>
                </ul>
            </div>
        </c:if>
        <form method="post" action="index">
            <table>
                <tr>
                    <th>Login: </th>
                    <td><input type="text" name="login"
                               value="${param.login}"/></td>
                </tr>
                <tr>
                    <th>Senha: </th>
                    <td><input type="password" name="senha" /></td>
                </tr>
                <tr>
                    <td colspan="2"> 
                        <input type="submit" name="entrar" value="Entrar"/>
                    </td>
                </tr>
            </table>
        </form>
<%@include file="/includes/rodape.html" %>