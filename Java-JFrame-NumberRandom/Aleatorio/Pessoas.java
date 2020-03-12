/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aleatorio;

/**
 *
 * @author andre
 */
public class Pessoas {
    
    private String nome [] = new String[30];
    
    
    public String lista(int x){
        this.nome[0] = "Jorhan Chagas";
        this.nome[1] = "Erick Lima";
        this.nome[2] = "Andrei Victor";
        this.nome[3] = "Tayna Silva";
        
        return this.nome[x];
        
    }

 
    
    
    
}
