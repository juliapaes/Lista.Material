public class Papelaria extends MaterialEscolar {
    private String medida;
    private int quantidade;

    public Papelaria(String descricao, double preco, String medida, int quantidade){
        super(descricao, preco);
        this.medida = medida;
        this.quantidade = quantidade;
    }
    public String getMedida(){
        return medida;

    }
    public void setMedida(String medida){
        this.medida = medida;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public void exibeInfo(){
        System.out.println("ITEM DE PAPELARIA:");
        System.out.println("Descrição: " + descricao + " : R$ " + preco);
        System.out.println("Medida: " + medida);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Fabricante: " + f.getNome());
    }

}
