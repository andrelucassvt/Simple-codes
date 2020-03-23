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
public class Livros implements Publicacao{
    private String titulo;
    private String autor;
    private int TotalDePaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Construtor
    public Livros(){
       this.pagAtual = 0;
       this.aberto = false;
    }
    
    
    
    
    
    
    
    public void detalhes(){
        if(this.aberto == true){
        System.out.println("Titulo do livro: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de paginas: " + this.getTotalDePaginas());
        System.out.println("========================================");
        this.leitor.Apresentar();
        System.out.println("Pagina atual: " + this.getPagAtual());
        }else{
            
        }
    }
    
    //Metodos
    @Override
    public void abrir(){
        if(this.aberto == false)
        this.aberto = true;
        else{
            System.err.println("Livro já está aberto");
        }
            
    }

    @Override
    public void fechar(){
        if(this.aberto == true){
        this.aberto = false;
        }else{
            System.err.println("Não tem como fechar, se já está fechado");
        }
    }

    @Override
    public void avancarPag(){
        if(this.aberto == true && this.pagAtual < this.TotalDePaginas){
            this.pagAtual = this.pagAtual + 1;
            System.out.println("Proxima pagina");
        }else{
            System.err.println("Não tem como avançar");
        }
    }

    @Override
    public void voltarPag(){
       if(this.aberto == true && this.pagAtual == 0){
           System.err.println("Não tem como voltar");
       } else if(this.aberto == true && this.pagAtual !=0){
           this.pagAtual = this.pagAtual -1;
           System.out.println("Voltando uma pagina");
       }else{
           System.err.println("Não tem como voltar");
       }
    }
    
    
    
    
    //Gett e Sett
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo){
        if(titulo.length()>5){
        this.titulo = titulo;
        }else{
            System.err.println("Nome inválido");
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor){
        if(autor.length()>5){
        this.autor = autor;
        }else{
            System.err.println("Nome inválido");
        }
    }

    public int getTotalDePaginas() {
        return TotalDePaginas;
    }

    public void setTotalDePaginas(int TotalDePaginas){
        if(TotalDePaginas <=0){
            System.err.println("Inválido");
        }else{
        this.TotalDePaginas = TotalDePaginas;
        }
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual){
        if(pagAtual<0){
            System.err.println("Inválido");
        }else{
        this.pagAtual = pagAtual;
        }
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    
    
    
    
    
}
