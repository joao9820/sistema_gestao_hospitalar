/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestao_hospitalar.entidade;

import java.util.Date;

/**
 *
 * @author usuaio
 */
public class Usuario {
    
    private int id;
    private int tipoUsuario;
    private int tpUsuarioId;
    private String tpUsuarioNome;
    private String nome;
    private String userName;
    private String senha;
    private Date dataRegistro;

    public Usuario() {
        
    }

    public int getTpUsuarioId() {
        return tpUsuarioId;
    }

    public void setTpUsuarioId(int tpUsuarioId) {
        this.tpUsuarioId = tpUsuarioId;
    }

    public String getTpUsuarioNome() {
        return tpUsuarioNome;
    }

    public void setTpUsuarioNome(String tpUsuarioNome) {
        this.tpUsuarioNome = tpUsuarioNome;
    }


    public Usuario(int id, String nome, String username, String email, String senha) {
        
        this.id = id;
        this.nome = nome;
        this.userName = username;
        this.email = email;
        this.senha = senha;
        
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    private String email;
    
    
     @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }  
    
}
