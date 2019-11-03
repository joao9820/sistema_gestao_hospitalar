/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestao_hospitalar.DAO;

import br.com.gestao_hopitalar.entidade.Medicamento;
import br.com.gestao_hospitalar.util.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Matheus
 */
public class ListarMedicamentoDAO extends FabricaConexao{
            public void listar() throws Exception {
        try {
            
            Connection conexao = (Connection) FabricaConexao.getConexao();
            
            PreparedStatement pst = null;
            
            String query = "SELECT id,forma_farmaceutica_id,status_id, nome , "
                    + "descricao, quantidade,valor,estoque_min, data_criacao FROM medicamentos ORDER BY id "; 
            pst = conexao.prepareCall(query);
            pst.execute();
            
            FabricaConexao.fecharConexao();
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());

        }
    }public ArrayList<Medicamento> pesquisarTudo () throws Exception {
       ArrayList<Medicamento> listamdt = new ArrayList<Medicamento>();
         try{
          Connection conexao = (Connection) FabricaConexao.getConexao();
        PreparedStatement pst = null;
        
         String query = "select * FROM medicamentos order by(id)desc limit 0,10";
         pst = conexao.prepareCall(query);
         
         ResultSet rs = pst.executeQuery();
         Medicamento mdtben ;
         while (rs.next()){ 
           mdtben = new Medicamento();
           mdtben.setId(rs.getInt("id"));
           mdtben.setForma_farmaceutica_id(rs.getInt("forma_farmaceutica_id"));
           mdtben.setStatus_id(rs.getInt("status_id"));
           mdtben.setNome(rs.getString("nome"));
           mdtben.setDescricao(rs.getString("descricao"));
           mdtben.setQuantidade(rs.getInt("quantidade"));
           mdtben.setValor(rs.getFloat("valor"));
           mdtben.setEstoque_min(rs.getInt("estoque_min"));
           mdtben.setData_criacao(rs.getDate("data_criacao"));
           mdtben.setData_modificacao(rs.getString("data_modificacao"));
           listamdt.add(mdtben); 
         } 
        
       }catch (Exception e){
           System.out.println("Erro " + e.getMessage());
     } 
       return listamdt;
     }
            
            
            
            
            
            
}
