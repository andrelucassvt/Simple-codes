package UFC;

public class Ringue {

    
    public static void main(String[] args) {
    	
    	//tornando a classe Lutadores um vetor
        Lutadores l1 [] = new Lutadores[4];
       
        //cadastrando os lutadores
        l1[0] = new Lutadores("Andre Lucas","Brasil",18,1.67,54.0,5,3,1);
        l1[1] = new Lutadores("Andrei Victor","Brasil",20,1.70,68.0,7,4,3);
        l1[2] = new Lutadores("Igor Leal","Americano",23,1.56,79.0,10,6,2);
        l1[3] = new Lutadores("Joao Gabriel","Japones",33,1.78,69.0,7,3,1);
        
        //Marcando uma luta
        
        Luta ufc = new Luta();
        
        ufc.marcarLuta(l1[0], l1[1]);
        ufc.Lutar();
        
        
        
        
        
    }
}
