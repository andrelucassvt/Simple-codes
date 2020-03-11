
package test;


public class Elevador {
    //atributos
    private int terreo;
    private int andares;
    private int andarAtual;
    private int capacidade;
    private int atualcapac;
    
    //construtor
    
    public Elevador(int cap, int and){
        this.terreo = 0;
        this.capacidade = cap;
        this.andares = and;
        this.atualcapac = 0;
        this.andarAtual = this.terreo;
    }
    
    //metodos
    public void acrescentarPessoa(){
        if(this.capacidade > this.atualcapac){
            this.setAtualcapac(+1);
            System.out.println("Pessoa adicionada");
        }else{
            System.err.println("Elevador lotado!!");
        }
       
    }
    
    public void tirarpessoas(){
        if(this.capacidade > this.atualcapac){
            this.setAtualcapac(-1);
            System.out.println("Saiu uma pessoa");
        }else if(this.atualcapac == 0){
            System.err.println("Não tem pessoa para retirar");
        }
       
    }
    
    public void subir(){
        if(this.andares > this.andarAtual){
            this.setAndarAtual(+1);
            System.out.println("Subindo");
        }else{
            System.err.println("Não podemos mais subir");
        }
    }
    
    public void descer(){
        if(this.andares > this.andarAtual){
            this.setAndarAtual(-1);
            System.out.println("DESCENDO");
        }else if(this.andarAtual == this.terreo){
            System.out.println("Estamos no terreo");
        }
    }
    
    
    
    
    
    
    //get e set
    public int getTerreo() {
        return terreo;
    }

    public void setTerreo(int terreo) {
        this.terreo = terreo;
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares){
        if(andares <0){
            System.err.println("ERRO!!");
        }else{
            
        this.andares = andares;
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        if(andarAtual <0){
            System.err.println("ERRO!!");
        }else{
        this.andarAtual = andarAtual;
        }
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade){
        if(capacidade <0){
            System.err.println("ERRO!!");
        }else{
        this.capacidade = capacidade;
        }
    }

    public int getAtualcapac() {
        return atualcapac;
    }

    public void setAtualcapac(int atual) {
        if(atual <0){
            System.err.println("ERRO!!");
        }else{
        this.atualcapac = atual;
        }
    }
    
    
    
    
    
    
    
    
    
}
