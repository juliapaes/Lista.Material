public class MaterialEscolar{
    protected String descricao;
    protected double preco;
    protected Fabricante f;

public MaterialEscolar(String descricao, double preco){
    this.descricao = descricao;
    this.preco = preco;
}
public String getDescricao(){
    return descricao;
}
public void setDescricao( String descricao){
    this.descricao = descricao;
}
public double getPreco(){
    return preco;
}
public void setPreco(double preco){
    this.preco = preco;
}
public Fabricante getF(){
    return f;
}
public void setF(Fabricante f){
    this.f = f;
}

}