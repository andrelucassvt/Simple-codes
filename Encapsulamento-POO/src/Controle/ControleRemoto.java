
package controle;


public class ControleRemoto {

    
    public static void main(String[] args) {
        
        Controle c1 = new Controle();
        c1.ligar();
        c1.aumentarVolume();
        c1.aumentarVolume();
        c1.LigarMudo();
        c1.DesligarMudo();
        c1.diminuirVolume();
        c1.abrirMenu();
    }
    
}
