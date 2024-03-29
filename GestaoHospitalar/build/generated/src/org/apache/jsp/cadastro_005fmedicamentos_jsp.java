package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.gestao_hospitalar.DAO.FormaFarmaceuticaDAO;
import br.com.gestao_hospitalar.entidade.FormaFarmaceutica;
import java.util.ArrayList;

public final class cadastro_005fmedicamentos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/includes/cabecalho.html");
    _jspx_dependants.add("/includes/rodape.html");
  }

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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"pt-br\" xml:lang=\"pt-br\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>GestÃ£o Hospitalar</title>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html;\" charset=\"utf-8\"/>\r\n");
      out.write("\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">       \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"container p-3\">\r\n");
      out.write("            <main role=\"main\"> \r\n");
      out.write("                \r\n");
      out.write("                 ");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("<div class=\"col-md-6 offset-md-3\">  \r\n");
      out.write("    <form action='Ghospitalar' method=\"POST\">\r\n");
      out.write("       <h2 class=\"text-center\">Cadastro de Medicamentos</h2>\r\n");
      out.write("        <p>Olá ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.usuarioLogado.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("        <div class=\"form-group\" >\r\n");
      out.write("          Nome: <input type='text' class='form-control' name='nome' />                     \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-group\" >\r\n");
      out.write("          Descricão: <input type='text' class='form-control' name='descricao' />                     \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-group\" >\r\n");
      out.write("          Quantidade: <input type='number' class='form-control' name='quantidade' />                     \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-group\" >\r\n");
      out.write("          Valor: <input type=\"text\" class='form-control' name='valor' />                     \r\n");
      out.write("        </div>\r\n");
      out.write("       <div class=\"col-md-4 pl-0\">\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"exampleFormControlSelect1\">Forma farmaceutica</label>   \r\n");
      out.write("        <select name=\"forma_farmaceutica\" class=\"form-control\" id=\"exampleFormControlSelect2\">\r\n");
      out.write("       ");
 
       
            String forma_id = "";
            String forma_nome = "";
            
            FormaFarmaceuticaDAO listarFormas = new FormaFarmaceuticaDAO();
            FormaFarmaceutica f = new FormaFarmaceutica();
            
            ArrayList<FormaFarmaceutica> formaList = listarFormas.pesquisarTudo();
            
            for(int  i = 0; i < formaList.size(); i++){
                
            f = formaList.get(i);
            
            forma_id = String.valueOf(f.getId());
            forma_nome = String.valueOf(f.getNome());
           
       
       
      out.write("\r\n");
      out.write("      \r\n");
      out.write("           <option value=\"");
      out.print(forma_id);
      out.write('"');
      out.write('>');
      out.print(forma_nome);
      out.write("</option>\r\n");
      out.write("       \r\n");
      out.write("       ");
 
        }
       
      out.write("\r\n");
      out.write("       \r\n");
      out.write("        </select>\r\n");
      out.write("        </div>\r\n");
      out.write("       </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form-group\" >\r\n");
      out.write("          Estoque Mínimo <input type='number' class='form-control' name='estoque' />                     \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("       <div class=\"form-group\">\r\n");
      out.write("           <button class=\"btn btn-primary\" value='enviar' type=\"submit\">Enviar</button>&nbsp;&nbsp;\r\n");
      out.write("           <button class=\"btn btn-danger\" value='Limpar' type=\"reset\">Limpar</button>\r\n");
      out.write("       </div>\r\n");
      out.write("   </form>\r\n");
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write("       ");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("\n");
      out.write("            </main>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write('\r');
      out.write('\n');
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
