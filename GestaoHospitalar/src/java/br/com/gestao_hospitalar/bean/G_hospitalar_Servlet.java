/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestao_hospitalar.bean;

import br.com.gestao_hopitalar.entidade.Medicamento;
import br.com.gestao_hospitalar.DAO.MedicamentoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author matheus.louzeiro
 */
public class G_hospitalar_Servlet extends HttpServlet {

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
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
             
     Integer forma_farmaceutica_id;
     Integer status_id;
     String nome;
     String descricao;
     Integer quantidade;
     Float valor;
     Integer estoque_min;
     Date data_criacao;
     Date data_modificacao;
     
     Date dt = new Date();
     
     //DateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
     //String dateFormated = formatDate.format(dt);
     //String dt2 = formatDate.format(dt);
            status_id = 1;
            
            nome = request.getParameter("nome");
            descricao = request.getParameter("descricao");
            quantidade = Integer.valueOf(request.getParameter("quantidade"));       
            valor = Float.valueOf(request.getParameter("valor"));
            estoque_min = Integer.valueOf(request.getParameter("estoque"));
            forma_farmaceutica_id = Integer.valueOf(request.getParameter("forma_farmaceutica"));
            data_criacao = dt;
            //data_modificacao = request.getParameter("data_mod");
            Medicamento med = new Medicamento();
            MedicamentoDAO med_dao = new MedicamentoDAO();
            
            med.setForma_farmaceutica_id(forma_farmaceutica_id);
            med.setStatus_id(status_id);
            med.setNome(nome);
            med.setDescricao(descricao);
            med.setQuantidade(quantidade);
            med.setValor(valor);
            med.setEstoque_min(estoque_min);
            med.setData_criacao(dt); 
            //out.println(med.getDescricao());
     
                 
            try {
                med_dao.inserir(med);

                
                request.setAttribute("nome", med.getNome());
                request.setAttribute("descricao", med.getDescricao());
                request.setAttribute("quantidade", med.getQuantidade());
                request.setAttribute("valor", med.getValor());
                request.setAttribute("estoque", med.getEstoque_min());
                request.setAttribute("forma_farmaceutica", med.getForma_farmaceutica_id());
                request.setAttribute("",med.getData_criacao());
                
                RequestDispatcher rd = 
                request.getRequestDispatcher("sucesso_medicamentos.jsp");
                rd.forward(request, response);

                //lcd.listar();
                
                //out.println("testando");
                //out.println(lcd.getResultado());
            }catch (Exception e) {
                Logger.getLogger(G_hospitalar_Servlet.class.getName()).log(Level.SEVERE, null, e);
            }
              

                
            
     

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
        } catch (ParseException ex) {
            Logger.getLogger(G_hospitalar_Servlet.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (ParseException ex) {
            Logger.getLogger(G_hospitalar_Servlet.class.getName()).log(Level.SEVERE, null, ex);
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
