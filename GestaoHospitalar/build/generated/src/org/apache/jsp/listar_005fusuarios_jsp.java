package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.gestao_hospitalar.DAO.UsuarioDAO;
import br.com.gestao_hospitalar.entidade.Usuario;
import java.util.ArrayList;

public final class listar_005fusuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("\n");
      out.write("    <table>\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>Código</th>\n");
      out.write("                <th>Tipo Usuário</th>\n");
      out.write("                <th>Nome</th>\n");
      out.write("                <th>Username</th>\n");
      out.write("                <th>E-mail</th>\n");
      out.write("                <th>Data Registro</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("            \n");
      out.write("            ");


                String id = "";
                String tipo_usuario = "";
                String nome = "";
                String username = "";
                String email = "";
                String data_registro = "";

                UsuarioDAO listarUsers = new UsuarioDAO();
                Usuario u = new Usuario();

                ArrayList<Usuario> userList = listarUsers.getAll();

                for (int i = 0; i < userList.size(); i++) {

                    u = userList.get(i);

                    id = String.valueOf(u.getId());
                    tipo_usuario = String.valueOf(u.getTipoUsuario());
                    nome = String.valueOf(u.getNome());
                    username = String.valueOf(u.getUserName());
                    email = String.valueOf(u.getEmail());
                    data_registro = String.valueOf(u.getDataRegistro());


            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("            <td>");
      out.print( id );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( tipo_usuario );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( nome );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( username );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( email );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( data_registro );
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("            \n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
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
