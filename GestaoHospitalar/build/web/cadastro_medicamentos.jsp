<%-- 
    Document   : cadastro_medicamentos
    Created on : 23/10/2019, 18:50:54
    Author     : matheus.louzeiro
--%>
<!DOCTYPE html>
<%@include file="includes/cabecalho.html" %>
   
<div class="col-md-6 offset-md-3">  
    <form action='Ghospitalar' method="POST">
       <h2 class="text-center">Cadastro de Medicamentos</h2>

        <div class="form-group" >
          Nome: <input type='text' class='form-control' name='nome' />                     
        </div>
        <div class="form-group" >
          Descricão: <input type='text' class='form-control' name='descricao' />                     
        </div>
        <div class="form-group" >
          Quantidade: <input type='number' class='form-control' name='quantidade' />                     
        </div>
        <div class="form-group" >
          Valor: <input type='text' class='form-control' name='valor' />                     
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
    
       <%@include file="includes/rodape.html" %>
