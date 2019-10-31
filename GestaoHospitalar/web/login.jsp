<%-- 
    Document   : login
    Created on : 22/10/2019, 21:23:01
    Author     : usuaio
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="includes/cabecalho.html" %>
<!DOCTYPE html>

<div class="row">
    <div class="col align-self-center p-3">
        <h3 class="text-center" style="border: black 1px">Gestão Hospitalar</h3>
        <div class="row">
            <div class="col-6 offset-3">
            <c:if test="${mensagens.existeErros}">
                <div class="alert alert-danger">
                    <ul>
                        <c:forEach var="erro" items="${mensagens.erros}">
                            <li> ${erro} </li>
                            </c:forEach>
                    </ul>
                </div>
            </c:if>
            <c:if test="${sessionScope.msg != null}">
                 <div class="alert alert-danger">
                    <p>${sessionScope.msg}</p>
                    <% session.removeAttribute("msg"); %> <!-- remove a msg da sessão não trazendo-a novamente -->
                </div>
            </c:if>
            <c:if test="${login_msg != null}">
                
                <% 
                    String login_alert = (String) request.getAttribute("login_msg").toString(); %>
                    
                        
                <div class="alert alert-info">
                    <p><%= login_alert %></p>
                </div>
                    
                
            </c:if>    
            </div>
            <div class="col-6 offset-3 bg-info p-1">
                <div class="card d-flex">
                    <div class="card-body">
                        <form action="index" method="POST">			
                            <div class="form-group">
                                <label>Login</label>
                                <input type="text" class="form-control" placeholder="Login" name="login" v>
                            </div>
                            <div class="form-group">
                                <label>Senha</label>
                                <input type="password" class="form-control" placeholder="Senha" name="senha">
                            </div>
                            <div class="d-flex">
                                <input type="submit" name="entrar" value="Entrar" class="btn btn-success" style="width: 80px">
                                <!-- <input type="submit" value="Cadastrar" class="btn btn-link" style="width: 80px"> -->
                            </div>
                        </form>
                    </div>    
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file="includes/rodape.html" %>
