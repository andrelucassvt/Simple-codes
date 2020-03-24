/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisao;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ControleRemoto c1 = new ControleRemoto();
        
        int numeroDoCanal;
        boolean variavelAuxiliar = true;
        int op;
        
        while(variavelAuxiliar == true){
            c1.InterfaceTV();
            System.out.println("=======BEM VINDO AO CONTROLE REMOTO=========");
            System.out.println("Botões do controle: ");
            System.out.println("1 - Ligar televisoo");
            System.out.println("2 - Desligar televisao");
            System.out.println("3 - Aumentar volume");
            System.out.println("4 - Diminuir volume");
            System.out.println("5 - Mudar de canal +1");
            System.out.println("6 - Mudar de canal -1");
            System.out.println("7 - Para digitar o canal especifico");
            op = teclado.nextInt();
            
            switch (op) {
                case 1:
                    c1.ligar();
                    c1.InterfaceTV();
                    break;
                case 2:
                    c1.desligar();
                    c1.InterfaceTV();
                    break;
                case 3:
                    c1.aumentarVolume();
                    c1.InterfaceTV();
                    break;
                case 4:
                    c1.diminuirVolume();
                    c1.InterfaceTV();
                    break;
                case 5:
                    c1.mudarCanal();
                    c1.InterfaceTV();
                    break;
                case 6:
                    c1.diminuirCanal();
                    c1.InterfaceTV();
                    break;
                case 7:
                    System.out.print("Digite o numero do canal: ");
                    numeroDoCanal = teclado.nextInt();
                    c1.canalEspecifico(numeroDoCanal);
                    c1.InterfaceTV();
                    break;
                default:
                    break;
            }
            
            
            
            
        }
        
        
        
    }
    
}
