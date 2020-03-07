
package Ventilador;


public class Comandos implements ComandoVentilador {
    //Atributos
    private boolean ligadoNaTomada;
    private String velocidade;
    private boolean girar;
    
    //
    //construtor
    Comandos(){
        this.ligadoNaTomada = false;
    }
    //
    
    //status
    public void status(){
        System.out.println("Está ligado? " + this.getLigadoNaTomada());
        System.out.println("Está girando ? " + this.getGirar());
        System.out.println("Qual a velocidade ? " + this.getVelocidade());
        
    }

            
    
    
    //gett and sett
    public boolean getLigadoNaTomada() {
        return ligadoNaTomada;
    }

    public void setLigadoNaTomada(boolean ligadoNaTomada) {
        this.ligadoNaTomada = ligadoNaTomada;
    }

    public boolean getGirar() {
        return girar;
    }

    public void setGirar(boolean girar) {
        this.girar = girar;
    }
    
    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }
   // 
    
    
    
    
    
    //Metodos
    @Override
    public void LigarTomada(){
        if(this.getLigadoNaTomada() == false){
            this.setLigadoNaTomada(true);
        }
    }

    @Override
    public void DesligarTomada(){
        if(this.getLigadoNaTomada() == true){
            this.setLigadoNaTomada(false);
        }else{
            System.out.println("Não tem como desligar se não estiver ligado!!!!!!!");
        }
    }

   
    @Override
    public void Velocidade1(){
        if(this.getLigadoNaTomada() == true){
            this.setVelocidade("Velocidade 1 ligada");
        }else{
            System.err.println("Não tem como ligar");
        }
    }

    @Override
    public void Velocidade2() {
        if(this.getLigadoNaTomada() == true){
            this.setVelocidade("Velocidade 2 ligada");
        }else{
            System.err.println("Não tem como ligar");
        }
    }

    @Override
    public void Velocidade3(){
        if(this.getLigadoNaTomada() == true){
            this.setVelocidade("Velocidade 3 ligada");
        }else{
            System.err.println("Não tem como ligar");
        }
    }

    @Override
    public void Girar(){
        if(this.getLigadoNaTomada() == true){
            this.setGirar(true);
            System.out.println("Ventilador está giranto");
        }else{
            System.out.println("Não tem como ativar");
        }
    }

    @Override
    public void PararGirar(){
        if(this.getLigadoNaTomada() == true && this.getGirar() == true){
            this.setGirar(false);
            System.out.println("Parando de girar");
        }else{
            System.out.println("Não tem como ativar");
        }
    }
    
    
    
}
