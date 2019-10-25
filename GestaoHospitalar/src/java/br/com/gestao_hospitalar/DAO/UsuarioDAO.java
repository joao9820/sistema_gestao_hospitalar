/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestao_hospitalar.DAO;

import br.com.gestao_hospitalar.util.FabricaConexao;
import br.com.gestao_hospitalar.entidade.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author usuaio
 */
public class UsuarioDAO {
    
     public void inserir(Usuario usuario) throws ClassNotFoundException, SQLException, ParseException {
        try {
            Connection conexao = (Connection) FabricaConexao.getConexao();
            PreparedStatement pst = null;
           
            pst = conexao.prepareCall("INSERT INTO usuarios (id, tp_usuario_id, nome ,username, email, senha, data_criacao)"
                        + " values(null,?,?,?,?,?)");
           
              
            pst.setInt(1, usuario.getTipoUsuario());
            pst.setString(2, usuario.getNome());
            pst.setString(3, usuario.getUserName());
            pst.setString(4, usuario.getEmail());
            pst.setString(5, usuario.getSenha());
            pst.setDate(6,new Date(usuario.getDataRegistro().getTime()));
            pst.execute();
            
            FabricaConexao.fecharConexao();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     public Usuario getSingle(String login) throws ClassNotFoundException {
        Connection conexao = (Connection) FabricaConexao.getConexao();
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            pst = conexao.prepareCall("id, tp_usuario_id, nome ,username, email, senha, data_criacao "
                    + "from usuarios where username = ?");
            pst.setString(1, login);
            
            rs = pst.executeQuery();
            if (rs.next()) {
                return new Usuario(rs.getInt("id"), 
                rs.getString("nome"), 
                rs.getString("username"), 
                rs.getString("senha")); 
                //rs.getBoolean("usu_adm"));
            }
            FabricaConexao.fecharConexao();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return null;
    }
  
    
     /*
    public List<Agenda> selecionarTudo() throws ClassNotFoundException, SQLException {
        try {
            Connection conexao = (Connection) FabricaConexao.getConexao();
            PreparedStatement pst = conexao.prepareCall("SELECT * FROM agenda");
            ResultSet rs = pst.executeQuery();
            List<Agenda> lista = new ArrayList<>();
            while (rs.next()) {
                Agenda agd = new Agenda();
                agd.setCodigo(rs.getInt("id"));
                agd.setEvento(rs.getString("evento"));
    
                agd.setDataEvento(rs.getDate("data_evento")); //Seta no método que recebe string (polimorfismo)
                agd.setStatus(rs.getString("status"));
                lista.add(agd);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void deletar(Agenda agenda) throws ClassNotFoundException, SQLException {
        try {
            Connection conexao = (Connection) FabricaConexao.getConexao();
            PreparedStatement pst; 
            
            if(agenda.getCodigo()> 0){
                pst = conexao.prepareCall("DELETE FROM agenda WHERE id=?");
                pst.setInt(1, agenda.getCodigo()); //parâmetro 1 pois o 0 seria o próprio código da tabela
                pst.execute();
            } else {
            }
           
            FabricaConexao.fecharConexao();
            
        } catch (SQLException ex) {
            Logger.getLogger(AgendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
*/
    
}
