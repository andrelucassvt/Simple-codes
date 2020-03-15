
package UFC;

import java.util.Random;


public class Luta {
    //atributos
    private Lutadores desafiado;
    private Lutadores desafiante;
    private int rounds;
    private boolean aprovado;
    
    
    
    //metodos
    
    public void marcarLuta(Lutadores l1,Lutadores l2){
        if(l1.getCategoria().equalsIgnoreCase(l2.getCategoria()) && l1 != l2){
            this.aprovado = true;
            this.desafiado =l1;
            this.desafiante = l2;
        }else{
            this.aprovado = false;
            this.desafiado =null;
            this.desafiante = null;
        }
       
    }
    
    public void Lutar(){
        if(this.aprovado == true){
            System.out.println("###Desafiado###");
            this.desafiado.apresentar();
            System.out.println("###Desafiante###");
            this.desafiante.apresentar();
            
            //Gerar valor
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            
            switch(vencedor){
                
                case 0: System.out.println("=========Empate==========");
                        this.desafiado.empatarLuta();
                        this.desafiante.empatarLuta();
                        break;
                        
                case 1: System.out.println("===========Desafiante ganhou======");
                    System.out.println(this.desafiante.getNome());
                        this.desafiante.ganharLuta();
                        this.desafiado.perderLuta();
                        break;
                       
                case 2: System.out.println("=============Desafiado ganhou========");
                        System.out.println(this.desafiado.getNome());
                        this.desafiado.ganharLuta();
                        this.desafiante.perderLuta();
                        break;
                
                
                
            }
            
            
            
        }else{
            System.out.println("Luta não pode acontecer");
        }
        
        
        
    }
    
    
    
    //Gett e Sett

    public Lutadores getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutadores desafiado) {
        this.desafiado = desafiado;
    }

    public Lutadores getDesafiando() {
        return  desafiante;
    }

    public void setDesafiando(Lutadores desafiando) {
        this.desafiante = desafiando;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
}
