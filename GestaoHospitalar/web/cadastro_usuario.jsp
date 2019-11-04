<%-- 
    Document   : cadastro_medicamentos
    Created on : 23/10/2019, 18:50:54
    Author     : joao.victor
--%>
<%@page import="br.com.gestao_hospitalar.DAO.UsuarioDAO"%>
<%@page import="br.com.gestao_hospitalar.entidade.Usuario"%>
<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="includes/cabecalho.html" %>

<div class="row">
    <div class="col-6 offset-3 bg-info p-1">
        <div class="card d-flex">
            <div class="card-body">
                <h2 class="text-center">Cadastrar Usuário</h2>
                <form action="CadastrarUsuario" method="POST">
                    <div class="form-group">
                        <label>Nome</label>
                        <input type="text" class="form-control" placeholder="Nome" name="nome" v>
                    </div>
                    <div class="form-group">
                        <label>E-mail</label>
                        <input type="email" class="form-control" placeholder="E-mail" name="email" v>
                    </div>
                    <div class="form-group">
                        <label>Username</label>
                        <input type="text" class="form-control" placeholder="Username" name="username" v>
                    </div>
                    <div class="form-group">
                        <label>Senha</label>
                        <input type="password" class="form-control" placeholder="Senha" name="senha" v>
                    </div>

                    <div class="form-group">

                        <%

                            String tpUsuario_id = "";
                            String tpUsuario_nome = "";

                            UsuarioDAO listarTipos = new UsuarioDAO();
                            Usuario u = new Usuario();

                            ArrayList<Usuario> tpUsuarioList = listarTipos.getTiposUsuario();

                            for (int i = 0; i < tpUsuarioList.size(); i++) {

                                u = tpUsuarioList.get(i);

                                tpUsuario_id = String.valueOf(u.getTpUsuarioId());
                                tpUsuario_nome = String.valueOf(u.getTpUsuarioNome());


                        %>

                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="tipo_usuario" id="<%= tpUsuario_id%>" value="<%= tpUsuario_id%>">
                            <label class="form-check-label" for="<%= tpUsuario_id%>"><%=tpUsuario_nome%></label>
                        </div>

                        <%
                            }
                        %>

                    </div>

                    <div class="d-flex py-2">
                        <input type="submit" name="Cadastrar" value="Cadastrar" class="btn btn-success btn-block">
                        <!-- <input type="submit" value="Cadastrar" class="btn btn-link" style="width: 80px"> -->
                    </div>
                </form>
            </div>    
        </div>
    </div>
</div>

<%@include file="includes/rodape.html" %>

