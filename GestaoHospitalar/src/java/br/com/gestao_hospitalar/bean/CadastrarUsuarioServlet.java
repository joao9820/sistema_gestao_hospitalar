/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestao_hospitalar.bean;

import br.com.gestao_hospitalar.DAO.UsuarioDAO;
import br.com.gestao_hospitalar.entidade.Usuario;
import br.com.gestao_hospitalar.util.Mensagem;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.*;
import java.math.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author usuaio
 */
public class CadastrarUsuarioServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, NoSuchAlgorithmException, ClassNotFoundException, SQLException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String nome = "";
            String email = "";
            String username = "";
            String senha = "";
            Integer tpUsuario = 0;

            tpUsuario = Integer.valueOf(request.getParameter("tipo_usuario"));
            nome = request.getParameter("nome");
            email = request.getParameter("email");
            username = request.getParameter("username");
            senha = request.getParameter("senha");

            Date dt = new Date();

            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(senha.getBytes(), 0, senha.length());
            //"MD5: "+new BigInteger(1,m.digest()).toString(16)
            String pass = new BigInteger(1, m.digest()).toString(16);

            UsuarioDAO userDao = new UsuarioDAO();
            Usuario userEnt = new Usuario();

            userEnt.setTpUsuarioId(tpUsuario);
            userEnt.setNome(nome);
            userEnt.setEmail(email);
            userEnt.setUserName(username);
            userEnt.setSenha(pass);
            userEnt.setDataRegistro(dt);

            String msg = "";
            Mensagem alert = new Mensagem();
            try {

                if(userDao.inserir(userEnt)){
                    msg = "Usuário cadastrado com sucesso!";
                    alert.setAlerta(msg, "success");
                }else{
                    msg = "Nao foi possível cadastrar o usuário";
                    alert.setAlerta(msg, "danger");
                }

            } catch (Exception e) {

                msg = "Nao foi possível cadastrar o usuário";
                alert.setAlerta(msg, "danger");
            }
            
            
            request.getSession().setAttribute("msg", alert.getAlerta());

            String URL = "login.jsp";
            //RequestDispatcher rd = request.getRequestDispatcher(URL);
            //rd.forward(request, response);
            
            response.sendRedirect(URL); //Necessário redirecionar para a home para não cair nessa condição novamente, tirar o paramêtro login
            return;

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(CadastrarUsuarioServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadastrarUsuarioServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarUsuarioServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CadastrarUsuarioServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(CadastrarUsuarioServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadastrarUsuarioServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarUsuarioServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CadastrarUsuarioServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
