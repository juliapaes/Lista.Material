public class Livro extends MaterialEscolar {
    private String autoria;
    private int ano;
    private int edicao;
    

    public Livro(String descricao, double preco, String autoria, int ano, int edicao){
        super(descricao, preco);
        this.autoria = autoria;
        this.edicao = edicao;
        this.ano = ano;
    }
    public String getAutoria(){
        return autoria;
    }
    public void setAutoria(String autoria){
        this.autoria = autoria;
    }
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getEdicao(){
        return edicao;
    }
    public void setEdicao(int edicao){
        this.edicao = edicao;
    }
    public void exibeInfo(){
        System.out.println("LIVRO:");
        System.out.println("Descrição: " + descricao);
        System.out.println("Autores: " + autoria);
        System.out.println(ano + " " + edicao + " ed.");
        System.out.println("Fabricante: " + f.getNome());
    }


}
