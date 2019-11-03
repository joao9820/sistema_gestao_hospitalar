<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page import="br.com.gestao_hospitalar.DAO.ListarMedicamentoDAO"%>
<%@page import="br.com.gestao_hopitalar.entidade.Medicamento"%>
<%@page import="java.util.ArrayList"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <title>Medicamentos Cadastrados</title>
    </head>
    <body>
        
        
        <center>
        <h1> Medicamentos cadastrados </h1>
 <div class="table-responsive" >
        <table  class="table table-striped">
              <tr > 
                  <th >ID</th>
                  <th >Forma Farmaceutica</th>
                  <th>Status</th>
                  <th>Nome</th>
                  <th>Descricao</th>
                  <th>Quantidade</th>
                  <th>Valor</th>
                  <th>Estoque Min</th>
                  <th>Data de Criação</th>
              </tr>
              
        <%
          String vid="";
          String vforma_farmaceutica_id="";
          String vstatus_id="";
          String vnome="";
          String vdescricao="";
          String vquantidade="";
          String vvalor="";
          String vestoque_min="";
          String vdata_criacao="";
          
          
         
         // String ac = (String) request.getAttribute("relatorio");
         
         ListarMedicamentoDAO lmdt = new ListarMedicamentoDAO(); 
             Medicamento m =  new Medicamento();
            
             ArrayList<Medicamento> mdt = lmdt.pesquisarTudo();  
             
            for (int i = 0; i < mdt.size(); i++) {                
                m = mdt.get(i);
                
              vid= String.valueOf(m.getId());
              vforma_farmaceutica_id= String.valueOf(m.getForma_farmaceutica_id());
              vstatus_id= String.valueOf(m.getStatus_id());
              vnome= String.valueOf(m.getNome());
              vdescricao= String.valueOf(m.getDescricao());
              vquantidade= String.valueOf(m.getQuantidade());
              vestoque_min=String.valueOf(m.getEstoque_min());
              vvalor= String.valueOf(m.getValor());
     

               %>
              
 
                  
                  <tr>
                        <td ><%=vid%></td>
                        <td ><%=vforma_farmaceutica_id%></td>
                        <td ><%=vstatus_id%></td>
                        <td ><%=vnome%></td>
                        <td ><%=vdescricao%></td>
                        <td ><%=vquantidade%></td>
                        <td ><%=vvalor%></td>
                        <td ><%=vestoque_min%></td>
                        <td ><%=vdata_criacao%></td>
                        
                        
                        
                        
                  
                  
                  
                  
                  
                  <td>
                      <a href="alter?codigo=<%=vid%>" ><img src="icones/editar.png" width="25px" alt="alterar"/></a>
                      
                      <a href="alter?codigo=<%=vid%>" ><iAlterar</a>
                  </td>
                  <td>
                   <a href="del?codigo=<%=vid%>" onclick="return confirm('Confirma exclusão do registro <%=vnome%>?')">
                       <img src="icones/excluir.ico" width="20px" alt="excluir"/></a>
                   </a>   
                  </td>
                                
              </tr>
            <%} 
        %>
         
        </table>
 </div>
      </center>
        
        
    </body>
</html>
