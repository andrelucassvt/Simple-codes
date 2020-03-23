/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudos;

public class Pessoa{
    //Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    
    public void Apresentar(){
        System.out.println("Nome do leitor: " + this.nome);
        System.out.println("Idade do leitor: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
    }
   
    
    //Gett e Sett
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        if(nome.length() < 5){
            System.err.println("Digite um nome válido");
        }else{
        this.nome = nome;
        }
    }

    public int getidade() {
        return idade;
    }

    public void setidade(int idade){
        if(idade <=0){
            System.err.println("Digite uma idade válida");
        }else{    
        this.idade = idade;
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    
    
    
    
    
    
}
