
package Ventilador;

public interface ComandoVentilador {
    
    
    public abstract void LigarTomada();
    public abstract void DesligarTomada();
    public abstract void Velocidade1();
    public abstract void Velocidade2();
    public abstract void Velocidade3();
    public abstract void Girar();
    public abstract void PararGirar();
}
