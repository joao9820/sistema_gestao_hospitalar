/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestao_hospitalar.DAO;

import br.com.gestao_hopitalar.entidade.Medicamento;
import br.com.gestao_hospitalar.util.FabricaConexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matheus.louzeiro
 */
public class MedicamentoDAO {
        public void inserir(Medicamento mdc) throws Exception {
        try {
            
            Connection conexao = (Connection) FabricaConexao.getConexao();
            
            PreparedStatement pst = null;
            
            String query = "INSERT INTO medicamentos (id,forma_farmaceutica_id,status_id, nome , "
                    + "descricao, quantidade,valor,estoque_min, data_criacao) "
                    + "values(null,?,?,?,?,?,?,?,?)"; 
            
            pst = conexao.prepareCall(query);
            
            //pst = (PreparedStatement) con.prepareStatement(query); 
            pst.setInt(1, mdc.getForma_farmaceutica_id());
            pst.setInt(2, mdc.getStatus_id());
            pst.setString(3, mdc.getNome()); //Vetor da posição do campo da tabela
            pst.setString(4, mdc.getDescricao());
            pst.setInt(5, mdc.getQuantidade());
            pst.setFloat(6, mdc.getValor());
            pst.setInt(7, mdc.getEstoque_min());
            pst.setDate(8, new Date(mdc.getData_criacao().getTime()));
            //pst.setString(9, (String) mdc.getData_modificacao());
            
            pst.execute();
            FabricaConexao.fecharConexao();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }     
}
