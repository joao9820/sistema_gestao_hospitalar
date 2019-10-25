/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestao_hospitalar.DAO;

import br.com.gestao_hopitalar.entidade.Medicamento;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Calendar;

/**
 *
 * @author matheus.louzeiro
 */
public class MedicamentoDAO extends DAO{
        public void inserir(Medicamento mdc) throws Exception {
        try {
            abrirBanco();
            String query = "INSERT INTO medicamentos (id,forma_farmaceutica_id,status_id, nome , "
                    + "descricao, quantidade,valor,estoque_min,data_criacao,data_modificacao) "
                    + "values(null,null,null,?,?,?,?,?,?,?)"; 
            pst = (PreparedStatement) con.prepareStatement(query); 
            pst.setString(3, mdc.getNome()); //Vetor da posição do campo da tabela
            pst.setString(4, mdc.getDescricao());
            pst.setInt(5, mdc.getQuantidade());
            pst.setFloat(6, mdc.getValor());
            pst.setInt(7, mdc.getEstoque_min());
            pst.setString(8, (String) mdc.getData_criacao());
            pst.setString(9, (String) mdc.getData_modificacao());
            
            pst.execute();
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());

        }
        
    }
}
