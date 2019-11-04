<%-- 
    Document   : listarUsuarios
    Created on : 03/11/2019, 14:39:02
    Author     : usuaio
--%>

<%@page import="br.com.gestao_hospitalar.util.Mensagem"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="br.com.gestao_hospitalar.DAO.UsuarioDAO"%>
<%@page import="br.com.gestao_hospitalar.entidade.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="includes/cabecalho.html" %>
<%@include file="/includes/menu_header.jsp" %>
<c:choose>
    <c:when test="${(sessionScope.usuarioLogado.id) != null}">
        <div class="row">

            <div class="col p-3">
                <h3 class="text-center">Usuários</h3>
                <table  class="table table-bordered table-hover">
                    <thead class="thead-light">
                        <tr>
                            <th>Código</th>
                            <th>Tipo de Usuário</th>
                            <th>Nome</th>
                            <th>Username</th>
                            <th>E-mail</th>
                            <th>Data Registro</th>
                            <th>Ações</th>
                        </tr>
                    </thead>
                    <tbody>

                        <%

                            String id = "";
                            String tipo_usuario = "";
                            String nome = "";
                            String username = "";
                            String email = "";
                            String data_registro = "";
                            String data_reg = "";

                            UsuarioDAO listarUsers = new UsuarioDAO();
                            Usuario u = new Usuario();

                            ArrayList<Usuario> userList = listarUsers.getAll();

                            for (int i = 0; i < userList.size(); i++) {

                                u = userList.get(i);

                                id = String.valueOf(u.getId());
                                tipo_usuario = String.valueOf(u.getTpUsuarioNome());
                                nome = String.valueOf(u.getNome());
                                username = String.valueOf(u.getUserName());
                                email = String.valueOf(u.getEmail());
                                data_registro = String.valueOf(u.getDataRegistro());

                                data_reg = data_registro == "null" ? "" : data_registro;

                                String data = "";

                                if (!data_reg.isEmpty()) {
                                    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                                    Date dataD = formato.parse(data_reg);
                                    formato.applyPattern("dd/MM/yyyy");
                                    data = formato.format(dataD);

                                }


                        %>
                        <tr>
                            <td><%= id%></td>
                            <td><%= tipo_usuario%></td>
                            <td><%= nome%></td>
                            <td><%= username%></td>
                            <td><%= email%></td>
                            <td><%= data%></td>
                            <td>
                                <a href="editarUser?id=<%=id%>"><img src="icones/editar.png" width="25px" alt="alterar"/></a>
                                <a href="deletarUser?id=<%=id%>" onclick="return confirm('Confirma exclusão do registro <%=nome%>?')">
                                    <img src="icones/excluir.ico" width="20px" alt="excluir"/></a>
                                </a> 

                            </td>
                        </tr>
                        <% }%>

                    </tbody>
                </table>
            </div>
        </div>
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
