
package controle;


public class Controle implements Controlador{
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //construtor
    Controle(){
        volume = 50;
        ligado = false;
        tocando = false;
    }
   //gett e sett

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    //metodos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar(){
        if(this.getLigado() == true) this.setLigado(false);
        else
            System.out.println("Impossivel desligar"); 
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado() == true){
        System.out.println("-------MENU--------");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print("|");
        }
        } else{
            System.out.println("Impossivel abrir menu");
        }
    }

    @Override
    public void fecharMenu(){
        System.out.println("Fechando menu...");
    }

    @Override
    public void aumentarVolume() {
        if(this.getLigado() == true){
            this.setVolume(this.getVolume() + 5);
        }else{
            System.out.println("Impossivel aumentar o valume");
        }
    }

    @Override
    public void diminuirVolume() {
        if(this.getLigado() ==  false){
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("Impossivel diminuir volume");
        }
    }

    @Override
    public void LigarMudo() {
        if(this.getLigado() == true && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void DesligarMudo() {
        if(this.getLigado() == true && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() == true && this.getTocando() == false){
            this.setTocando(true);
        }
    }

    @Override 
    public void pause() {
        if(this.getLigado() == true && this.getTocando() == true){
            this.setTocando(false);
        }
    }
    

  
    
    
    
    
    
    
}
