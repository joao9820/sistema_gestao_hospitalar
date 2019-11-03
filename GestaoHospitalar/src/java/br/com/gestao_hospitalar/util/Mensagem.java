/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gestao_hospitalar.util;

/**
 *
 * @author usuaio
 */
public class Mensagem {
    
    private String alert;
   
    public void setAlerta(String msg, String cor){
        this.alert = "<div class='alert alert-" + cor +" text-center'>"+ msg +"</div>";
    }
    
    public String getAlerta(){
        return this.alert;
    }
    
}
