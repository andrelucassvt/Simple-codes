
package televisao;


public class Televisao{
    //atributos
    protected boolean power;
    protected int volumeMax;
    protected int volumeAtual;
    protected int quantidadeDeCanais;
    protected int canalAtual;
    
    //Atributo só para uma mini televisao que vou montar
    protected String mostrar; 
    
    
    //construtor
    public Televisao(){
        this.power = false;
        this.quantidadeDeCanais = 100;   
        this.canalAtual = 1;
        this.volumeAtual = 50;
        this.volumeMax = 100;
        this.mostrar = "Desligada";
    }  
    
    //Gett and Sett
    public boolean getPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public int getVolumeAtual() {
        return volumeAtual;
    }

    public void setVolumeAtual(int volumeAtual) {
        this.volumeAtual = volumeAtual;
    }

    public int getQuantidadeDeCanais() {
        return quantidadeDeCanais;
    }

    public void setQuantidadeDeCanais(int quantidadeDeCanais) {
        this.quantidadeDeCanais = quantidadeDeCanais;
    }

    public int getCanalAtual() {
        return canalAtual;
    }

    public void setCanalAtual(int canalAtual) {
        this.canalAtual = canalAtual;
    }

    public int getVolumeMax() {
        return volumeMax;
    }

    public String getMostrar() {
        return mostrar;
    }

    public void setMostrar(String mostrarPower) {
        this.mostrar = mostrarPower;
    }
    
    
}
