/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UFC;

public class Lutadores implements Metodos {
    //Atributos
    private String nome;
    private String Nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Construtor
    
     Lutadores(String nome, String Nacionalidade, int idade, double altura,double peso
    ,int vitorias, int derrotas, int empates){
     this.nome = nome;
     this.Nacionalidade = Nacionalidade;
     this.idade = idade;
     this.altura = altura;
     this.setPeso(peso);
     this.vitorias = vitorias;
     this.derrotas = derrotas;
     this.empates = empates;
     
    }
    ////////////////////////////////////////fim-construtor        
            
    
    //Metodos
   
     @Override
     public void apresentar() {
    	 // TODO Auto-generated method stub
    	 System.out.println("==================================================");
    	 System.out.println("CHEGOU A HORA! Apresentamos o lutador "+ this.getNome());
    	 System.out.println("Diretamente de " + this.getNacionalidade());
    	 System.out.println("Pesando " + this.getPeso());
    	 System.out.println("Com " + this.getIdade() + " Anos e "+ this.getAltura() + " de altura");
    	 System.out.println("Com " + this.getVitorias() + " vitorias");
    	 System.out.println("" + this.getDerrotas() + " derrotas e "+ this.getEmpates() + " empates");
    	 
     }
     @Override
     public void status() {
    	 // TODO Auto-generated method stub
    	 System.out.println(this.getNome() + " peso " + this.getCategoria());
    	 System.out.println("Ganhou "+ this.getDerrotas()+ " vezes");
    	 System.out.println("Perdeu " + this.getDerrotas() + " vezes");
    	 System.out.println("Empatou " + this.getEmpates() + " vezes");
     }
     @Override
     public void ganharLuta() {
    	 // TODO Auto-generated method stub
    	 this.setVitorias(this.getVitorias() + 1);
     }
     @Override
     public void perderLuta() {
    	 // TODO Auto-generated method stub
    	 this.setDerrotas(this.getDerrotas() + 1);
     }
     @Override
     public void empatarLuta() {
    	 // TODO Auto-generated method stub
    	 this.setEmpates(this.getEmpates() + 1);
     }
    
    
    
    
    
    
    
        
    
    //Gett e Sett
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return Nacionalidade;
    }

    public void setNacionalidade(String Nacionalidade) {
        this.Nacionalidade = Nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
        
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
    	
        if(peso<52.2){
            this.categoria = "Invalido";
        }else if(peso <=73.2){
            this.categoria = "Peso leve";
        }else if(peso <= 83.9){
            this.categoria = "Peso medio";
        }else if( peso <= 120.2){
            this.categoria = "Peso pesado";
        }else {
        	this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
    
    
    
    
    
            
    
}
