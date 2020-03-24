/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisao;

/**
 *
 * @author andre
 */
public class ControleRemoto extends Televisao implements InterfaceMetodos{
    
    @Override
    public void ligar(){
        if(this.getPower() == false){
            this.setPower(true);
        /*"Mostrar" serve para mostrar no meio da tela da tv no metodo
            "InterfaceTV" a informação*/
            this.setMostrar("Ligada");
        }else{
            this.setMostrar("Já está ligada");
        }
    }

    @Override
    public void desligar(){
        if(this.getPower() == true){
            this.setPower(false);
        /*"Mostrar" serve para mostrar no meio da tela da tv no metodo
            "InterfaceTV" a informação*/
            this.setMostrar("Desligada");
        }else{
            this.setMostrar("TV já está desligada");
        }
    }

    @Override
    public void aumentarVolume(){
        //So aumentar o volume se a tv estiver ligada
        if(this.getPower() == true){
            if(this.getVolumeAtual() < this.getVolumeMax()){
                this.volumeAtual++;
                this.setMostrar("Volume: " + this.getVolumeAtual() + "%");
            }else{
                this.setMostrar("Volume no máximo");
            }
        }else{
            this.setMostrar("Ligue a TV");
        }
    }

    @Override
    public void diminuirVolume(){
       if(this.getPower() == true){ 
            if(this.getVolumeAtual() == 0){
                this.setMostrar("Volume no mudo");
            }else{
                this.volumeAtual--;
                this.setMostrar("Volume: " + this.getVolumeAtual() + "%");
            }
       }else{
           this.setMostrar("Ligue a TV");
       }
    }

    @Override
    public void mudarCanal(){
        if(this.getPower() == true){
            if(this.canalAtual < this.quantidadeDeCanais){
                this.canalAtual++;
                this.setMostrar("Canal " + this.canalAtual);
            }else{
                this.setMostrar("Ultimo canal");
            }
        }else{
            this.setMostrar("Ligue a TV");
        }
    }

    @Override
    public void diminuirCanal(){
        if(this.getPower() == true){
            if(this.canalAtual == 0){
                this.setMostrar("Canal do cliente!!");   
            }else{
                this.canalAtual--;
                this.setMostrar("Canal " + this.canalAtual);
            }
        }else{
            this.setMostrar("Ligue a TV");
        }    
    }
    @Override
    public void canalEspecifico(int canal){
            if(this.power == true){
                if(canal > this.quantidadeDeCanais || canal < 0){
                    this.setMostrar("Canal invalido");
                }else{
                    this.canalAtual = canal;
                    this.setMostrar("Canal " + this.canalAtual);
                }
            }else{
                this.setMostrar("Ligue a TV");
            }
       
    }

    
    
    
    public void InterfaceTV(){
     System.out.println("==========================================");
     System.out.println("||                                      ||");
     System.out.println("||                                      ||");   
     System.out.println("||              "+this.getMostrar());   
     System.out.println("||                                      ||");
     System.out.println("||                                      ||");
     System.out.println("==========================================");
     System.out.println("                   /  \\                 ");   
        
    }
    
    
    
    
    
}
