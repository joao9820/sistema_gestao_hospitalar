/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestao_hospitalar.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import br.com.gestao_hospitalar.util.FabricaConexao;
import br.com.gestao_hospitalar.entidade.FormaFarmaceutica;
import java.sql.Connection;

/**
 *
 * @author usuaio
 */
public class FormaFarmaceuticaDAO {
    
        public void listar() throws Exception {
        try {
            
            Connection conexao = (Connection) FabricaConexao.getConexao();
            
            PreparedStatement pst = null;
            
            String query = "SELECT id, nome FROM formas_farmaceuticas ORDER BY id "; 
            pst = conexao.prepareCall(query);
            pst.execute();
            
            FabricaConexao.fecharConexao();
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());

        }
    }
        
    public ArrayList<FormaFarmaceutica> pesquisarTudo () throws Exception {
       
        ArrayList<FormaFarmaceutica> listFormaF = new ArrayList<FormaFarmaceutica>(); //Array list do tipo noticias, para retorno na View (Páginas Web)
         try{
         Connection conexao = (Connection) FabricaConexao.getConexao();
        PreparedStatement pst = null;
         
         String query = "SELECT * FROM formas_farmaceuticas ORDER BY id limit 0,10";
         pst = conexao.prepareCall(query);
         
         ResultSet rs = pst.executeQuery();
         
         FormaFarmaceutica formaBean ;
         while (rs.next()){ //Passando os valores para os métodos da classe Noticias
           formaBean = new FormaFarmaceutica();
           formaBean.setId(rs.getInt("id"));
           formaBean.setNome(rs.getString("nome"));
           listFormaF.add(formaBean); //adicionando todos os valores do objeto para a classe ArrayList<Noticias>
         } 
         FabricaConexao.fecharConexao();
          return listFormaF;
       }catch (Exception e){
           System.out.println("Erro " + e.getMessage());
     } 
       return null;
     }
}
