<%-- 
    Document   : login
    Created on : 22/10/2019, 21:23:01
    Author     : usuaio
--%>

<%@include file="includes/cabecalho.html" %>
<!DOCTYPE html>

<div class="row">
    <div class="col align-self-center p-3">
        <h3 class="text-center" style="border: black 1px">Gestão Hospitalar</h3>
        <div class="row">
            <div class="col-6 offset-3 bg-info p-1">
                <div class="card d-flex">
                    <div class="card-body">
                       <form action="/validaForm" method="POST">			
                            <div class="form-group">
                                <label>Login</label>
                                <input type="text" class="form-control" placeholder="Login" name="login">
                            </div>
                            <div class="form-group">
                                <label>Senha</label>
                                    <input type="text" class="form-control" placeholder="Senha" name="senha">
                            </div>
                           <div class="d-flex">
                               <input type="submit" value="Entrar" class="btn btn-success" style="width: 80px">
                               <input type="submit" value="Cadastrar" class="btn btn-link" style="width: 80px">
                           </div>
                            </form>
                    </div>    
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file="includes/rodape.html" %>
