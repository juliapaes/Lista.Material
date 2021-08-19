public class Fabricante {
    private String nome;
    private String endereco;
    private String estado;

    public Fabricante(String nome, String endereco, String estado){
        this.nome = nome;
        this.endereco = endereco;
        this.estado = estado;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
}
