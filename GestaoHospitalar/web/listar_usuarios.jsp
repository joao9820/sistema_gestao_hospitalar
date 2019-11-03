<%-- 
    Document   : listarUsuarios
    Created on : 03/11/2019, 14:39:02
    Author     : usuaio
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="br.com.gestao_hospitalar.DAO.UsuarioDAO"%>
<%@page import="br.com.gestao_hospitalar.entidade.Usuario"%>
<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="includes/cabecalho.html" %>


<div class="row">

    <table  class="table table-bordered table-hover">
        <thead class="thead-light">
            <tr>
                <th>Código</th>
                <th>Tipo de Usuário</th>
                <th>Nome</th>
                <th>Username</th>
                <th>E-mail</th>
                <th>Data Registro</th>
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
                    
                    if(!data_reg.isEmpty()){
                         SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                         Date dataD = formato.parse(data_reg);
                         formato.applyPattern("dd/MM/yyyy"); 
                         data = formato.format(dataD);
                        
                    }
                    

            %>
            <tr>
            <td><%= id %></td>
            <td><%= tipo_usuario %></td>
            <td><%= nome %></td>
            <td><%= username %></td>
            <td><%= email %></td>
            <td><%= data %></td>
            </tr>
            <% }%>
            
        </tbody>
    </table>
</div>


<%@include file="includes/rodape.html" %>
