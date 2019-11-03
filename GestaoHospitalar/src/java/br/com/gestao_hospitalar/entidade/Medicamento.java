/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestao_hopitalar.entidade;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author matheus.louzeiro
 */
public class Medicamento {
    private Integer id;
    private Integer forma_farmaceutica_id;
    private Integer status_id;
    private String nome;
    private String descricao;
    private Integer quantidade;
    private Float valor;
    private Integer estoque_min;
    private Date data_criacao;
    private String data_modificacao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getForma_farmaceutica_id() {
        return forma_farmaceutica_id;
    }

    public void setForma_farmaceutica_id(Integer forma_farmaceutica_id) {
        this.forma_farmaceutica_id = forma_farmaceutica_id;
    }

    public Integer getStatus_id() {
        return status_id;
    }

    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Integer getEstoque_min() {
        return estoque_min;
    }

    public void setEstoque_min(Integer estoque_min) {
        this.estoque_min = estoque_min;
    }

    public Date getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(Date data_criacao) {
        this.data_criacao = data_criacao;
    }

    public String getData_modificacao() {
        return data_modificacao;
    }

    public void setData_modificacao(String data_modificacao) {
        this.data_modificacao = data_modificacao;
    }

   

    
}
