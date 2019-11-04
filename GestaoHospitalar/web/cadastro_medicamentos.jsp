<%-- 
    Document   : cadastro_medicamentos
    Created on : 23/10/2019, 18:50:54
    Author     : matheus.louzeiro
--%>
<%@page import="br.com.gestao_hospitalar.util.Mensagem"%>
<%@page import="br.com.gestao_hospitalar.DAO.FormaFarmaceuticaDAO"%>
<%@page import="br.com.gestao_hospitalar.entidade.FormaFarmaceutica"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@include file="includes/cabecalho.html" %>
<%@include file="/includes/menu_header.jsp" %>
<c:choose>
    <c:when test="${(sessionScope.usuarioLogado.id) != null}">

        <div class="col-md-6 offset-md-3">  
            <form action='Ghospitalar' method="POST">
                <h2 class="text-center">Cadastro de Medicamentos</h2>

                <div class="form-group" >
                    Nome: <input type='text' class='form-control' name='nome' />                     
                </div>
                <div class="form-group" >
                    Descrição: <input type='text' class='form-control' name='descricao' />                     
                </div>
                <div class="form-group" >
                    Quantidade: <input type='number' class='form-control' name='quantidade' />                     
                </div>
                <div class="form-group" >
                    Valor: <input type="text" class='form-control' name='valor' />                     
                </div>
                <div class="col-md-4 pl-0">
                    <div class="form-group">
                        <label for="exampleFormControlSelect1">Forma farmaceutica</label>   
                        <select name="forma_farmaceutica" class="form-control" id="exampleFormControlSelect2">
                            <%

                                String forma_id = "";
                                String forma_nome = "";

                                FormaFarmaceuticaDAO listarFormas = new FormaFarmaceuticaDAO();
                                FormaFarmaceutica f = new FormaFarmaceutica();

                                ArrayList<FormaFarmaceutica> formaList = listarFormas.pesquisarTudo();

                                for (int i = 0; i < formaList.size(); i++) {

                                    f = formaList.get(i);

                                    forma_id = String.valueOf(f.getId());
                                    forma_nome = String.valueOf(f.getNome());


                            %>

                            <option value="<%=forma_id%>"><%=forma_nome%></option>

                            <%
                                }
                            %>

                        </select>
                    </div>
                </div>

                <div class="form-group" >
                    Estoque Mínimo <input type='number' class='form-control' name='estoque' />                     
                </div>

                <div class="form-group">
                    <button class="btn btn-primary" value='enviar' type="submit">Enviar</button>&nbsp;&nbsp;
                    <button class="btn btn-danger" value='Limpar' type="reset">Limpar</button>
                </div>
            </form>

        </div>
        <!-- response.sendRedirect("http://localhost:8080/PortalCCO"); -->
    </c:when>
    <c:otherwise>
        
        <% 
                       
            Mensagem alert = new Mensagem();
            
            alert.setAlerta("Realize o login!", "info");
            request.getSession().setAttribute("msg", alert.getAlerta());
            response.sendRedirect("/GestaoHospitalar/login.jsp"); 
        %>
    </c:otherwise>
</c:choose>
    <%@include file="includes/rodape.html" %>

