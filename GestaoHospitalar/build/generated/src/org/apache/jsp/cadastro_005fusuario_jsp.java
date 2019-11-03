package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.gestao_hospitalar.DAO.UsuarioDAO;
import br.com.gestao_hospitalar.entidade.Usuario;
import java.util.ArrayList;

public final class cadastro_005fusuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"pt-br\" xml:lang=\"pt-br\">\n");
      out.write("    <head>\n");
      out.write("        <title>GestÃ£o Hospitalar</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html;\" charset=\"utf-8\"/>\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container p-3\">\n");
      out.write("            <main role=\"main\"> \n");
      out.write("                \n");
      out.write("                 ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-6 offset-3 bg-info p-1\">\n");
      out.write("        <div class=\"card d-flex\">\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <h2 class=\"text-center\">Cadastrar Usuário</h2>\n");
      out.write("                <form action=\"cadastro\" method=\"POST\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Nome</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Nome\" name=\"nome\" v>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>E-mail</label>\n");
      out.write("                        <input type=\"email\" class=\"form-control\" placeholder=\"E-mail\" name=\"email\" v>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Username</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Username\" name=\"username\" v>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Senha</label>\n");
      out.write("                        <input type=\"password\" class=\"form-control\" placeholder=\"Senha\" name=\"senha\" v>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("\n");

      out.write("                        ");


                            String tpUsuario_id = "";
                            String tpUsuario_nome = "";

                            UsuarioDAO listarTipos = new UsuarioDAO();
                            Usuario u = new Usuario();

                            ArrayList<Usuario> tpUsuarioList = listarTipos.getTiposUsuario();

                            for (int i = 0; i < tpUsuarioList.size(); i++) {

                                u = tpUsuarioList.get(i);

                                tpUsuario_id = String.valueOf(u.getTpUsuarioId());
                                tpUsuario_nome = String.valueOf(u.getTpUsuarioNome());


                        
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"form-check form-check-inline\">\r\n");

      
      out.write("                            <input class=\"form-check-input\" type=\"radio\" name=\"tipo_usuario\" id=\"");
      out.print( tpUsuario_id);
      out.write("\" value=\"");
      out.print( tpUsuario_id);

      out.write("\">\r\n");
      out.write("                            <label class=\"form-check-label\" for=\"");
      out.print( tpUsuario_id);
      out.write('"');
      out.write('>');
      out.print(tpUsuario_nome);

      out.write("</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        ");

                            }
                        

      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"d-flex py-2\">\r\n");
      out.write("                        <input type=\"submit\" name=\"Cadastrar\" value=\"Cadastrar\" class=\"btn btn-success btn-block\">\r\n");
      out.write("                        <!-- <input type=\"submit\" value=\"Cadastrar\" class=\"btn btn-link\" style=\"width: 80px\"> -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>    \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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

      out.write("\r\n");
      out.write("\r\n");
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
