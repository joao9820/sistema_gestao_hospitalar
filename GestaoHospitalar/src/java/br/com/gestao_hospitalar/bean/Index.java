/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestao_hospitalar.bean;

import java.io.IOException;
import java.io.PrintWriter;
import br.com.gestao_hospitalar.util.Erro;
import br.com.gestao_hospitalar.DAO.UsuarioDAO;
import br.com.gestao_hospitalar.entidade.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author usuaio
 */

 @WebServlet(name = "Index", urlPatterns = {"/logout.jsp"})

public class Index extends HttpServlet {

  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        Erro erros = new Erro();
        
        if (request.getParameter("entrar") != null) { //Utiliza também para o logout
            String login = request.getParameter("login");
            String senha = request.getParameter("senha");
            if (login == null || login.isEmpty()) {
                erros.add("Login não informado!");
            }
            if (senha == null || senha.isEmpty()) {
                erros.add("Senha não informada!");
            }
            if (!erros.isExisteErros()) {
                
                UsuarioDAO dao = new UsuarioDAO();
                Usuario user = dao.getSingle(login);
                
                if (user != null) {
                    if (user.getSenha().equalsIgnoreCase(senha)) {
                        request.getSession().setAttribute("usuarioLogado", user);
                        response.sendRedirect("View/logado/menu.jsp");
                        return;
                    } else {
                        erros.add("Senha inválida!");
                    }
                } else {
                    erros.add("Usuário não encontrado!");
                }
            }
  
        }else if(request.getParameter("login") != null){
            
            String msg = "Sessão Encerrada";
            request.getSession().invalidate();
            request.setAttribute("login_msg", msg);
            
            
        }
        //request.getSession().invalidate();
                
        request.setAttribute("mensagens", erros);
         
        String URL = "login.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(URL);
        rd.forward(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      try {
          processRequest(request, response);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      try {
          processRequest(request, response);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

}
