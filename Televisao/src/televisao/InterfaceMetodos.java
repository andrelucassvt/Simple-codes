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
public interface InterfaceMetodos {
 
    public abstract void ligar();
    public abstract void desligar();
    public abstract void aumentarVolume();
    public abstract void diminuirVolume();
    public abstract void mudarCanal();
    public abstract void diminuirCanal();
    public abstract void canalEspecifico(int canal);
    
    
}
