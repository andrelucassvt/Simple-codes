/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudos;

/**
 *
 * @author andre
 */
public class Ler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("André Lucas");
        p1.setSexo("Masculino");
        p1.setidade(18);
        
        Livros l1 = new Livros();
        l1.setAutor("Viana Silva");
        l1.setLeitor(p1);
        l1.setTitulo("Meu amor");
        l1.setTotalDePaginas(100);
        
        
        l1.abrir();
        l1.avancarPag();
        l1.avancarPag();
        l1.voltarPag();
        l1.detalhes();
        
        
    }
    
}
