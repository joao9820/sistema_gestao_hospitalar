package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.sql.Date;
import br.com.gestao_hospitalar.DAO.ListarMedicamentoDAO;
import br.com.gestao_hopitalar.entidade.Medicamento;
import java.util.ArrayList;

public final class listar_005fmedicamentos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n");
      out.write("        <title>Medicamentos Cadastrados</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <center>\r\n");
      out.write("        <h1> Medicamentos cadastrados </h1>\r\n");
      out.write(" <div class=\"table-responsive\" >\r\n");
      out.write("        <table  class=\"table table-striped\">\r\n");
      out.write("              <tr > \r\n");
      out.write("                  <th >ID</th>\r\n");
      out.write("                  <th >Forma Farmaceutica</th>\r\n");
      out.write("                  <th>Status</th>\r\n");
      out.write("                  <th>Nome</th>\r\n");
      out.write("                  <th>Descricao</th>\r\n");
      out.write("                  <th>Quantidade</th>\r\n");
      out.write("                  <th>Valor</th>\r\n");
      out.write("                  <th>Estoque Min</th>\r\n");
      out.write("                  <th>Data de Criação</th>\r\n");
      out.write("              </tr>\r\n");
      out.write("              \r\n");
      out.write("        ");

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
     

               
      out.write("\r\n");
      out.write("              \r\n");
      out.write(" \r\n");
      out.write("                  \r\n");
      out.write("                  <tr>\r\n");
      out.write("                        <td >");
      out.print(vid);
      out.write("</td>\r\n");
      out.write("                        <td >");
      out.print(vforma_farmaceutica_id);
      out.write("</td>\r\n");
      out.write("                        <td >");
      out.print(vstatus_id);
      out.write("</td>\r\n");
      out.write("                        <td >");
      out.print(vnome);
      out.write("</td>\r\n");
      out.write("                        <td >");
      out.print(vdescricao);
      out.write("</td>\r\n");
      out.write("                        <td >");
      out.print(vquantidade);
      out.write("</td>\r\n");
      out.write("                        <td >");
      out.print(vvalor);
      out.write("</td>\r\n");
      out.write("                        <td >");
      out.print(vestoque_min);
      out.write("</td>\r\n");
      out.write("                        <td >");
      out.print(vdata_criacao);
      out.write("</td>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("                  <td>\r\n");
      out.write("                      <a href=\"alter?codigo=");
      out.print(vid);
      out.write("\" ><img src=\"icones/editar.png\" width=\"25px\" alt=\"alterar\"/></a>\r\n");
      out.write("                      \r\n");
      out.write("                      <a href=\"alter?codigo=");
      out.print(vid);
      out.write("\" ><iAlterar</a>\r\n");
      out.write("                  </td>\r\n");
      out.write("                  <td>\r\n");
      out.write("                   <a href=\"del?codigo=");
      out.print(vid);
      out.write("\" onclick=\"return confirm('Confirma exclusão do registro ");
      out.print(vnome);
      out.write("?')\">\r\n");
      out.write("                       <img src=\"icones/excluir.ico\" width=\"20px\" alt=\"excluir\"/></a>\r\n");
      out.write("                   </a>   \r\n");
      out.write("                  </td>\r\n");
      out.write("                                \r\n");
      out.write("              </tr>\r\n");
      out.write("            ");
} 
        
      out.write("\r\n");
      out.write("         \r\n");
      out.write("        </table>\r\n");
      out.write(" </div>\r\n");
      out.write("      </center>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
