# Lista.Material
/*
Programadora Júlia Paes
Data: 19/08/2021


*/
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		ArrayList<Livro> livros = new ArrayList<Livro>();
		ArrayList<Papelaria> itens = new ArrayList<Papelaria>();
		
		int op;
		do{
		    System.out.println("1 - Visualizar lista de material escolar");
		    System.out.println("2 - Adicionar livro");
		    System.out.println("3 - Adicionar item de papelaria");
		    System.out.println("4 - Remover livro");
		    System.out.println("5 - Remover item de papelaria");
		    System.out.println("6 - Sair");
		    System.out.println("Informe o número da sua opção:");
		    op = leitor.nextInt();
		    switch(op){
		        case 1: if((livros.size()==0) && (itens.size()==0) ){
		                    System.out.println("Lista de material vazia!");
		                }else{
		                    System.out.println("*  *  * LISTA DE MATERIAL *  *  *");
		                    
		                    for(int i = 0; i<livros.size(); i++){
		                        livros.get(i).exibeInfo();
		                    }
		                    
		                    for(int i = 0; i<itens.size(); i++){
		                        itens.get(i).exibeInfo();
		                    }
		                }
		                break;
		        case 2: String n, a;
				        double valor;
						int ano, edicao;
						leitor.nextLine();
		                System.out.println("Informe o título do livro: ");
		                n = leitor.nextLine();
		                System.out.println("Informe os autores do livro: ");
		                a = leitor.nextLine();
		                
		                do{
		                    System.out.println("Informe o ano da publicação: ");
		                    ano = leitor.nextInt();
		                }while(ano < 1900);
		                
		                do{
		                    System.out.println("Informe a edição: ");
		                    edicao =  leitor.nextInt();
		                }while (edicao <= 0);
		                
		                do{
		                    System.out.println("Informe o preco: ");
		                    valor = leitor.nextDouble();
		                }while(valor<0);
		                Livro l1 = new Livro(n,valor,a,ano,edicao);
				        //TESTE PARA VER A VISUALIZAÇÃO
						String f, e, estado;
						leitor.nextLine();
		                System.out.println("Informe o Fabricante: ");
		                f = leitor.nextLine();
		                System.out.println("Informe o endereço: ");
		                e = leitor.nextLine();
						System.out.println("Informe o estado: ");
		                estado = leitor.nextLine();
						Fabricante fab1 = new Fabricante(f, e, estado);

		                l1.setF(fab1);
		                livros.add(l1);
		                System.out.println("Livro adicionado com sucesso!");
		                break;

						case 3: String ni, medida;
		                double valori;
		                int qtd;
		                
		                leitor.nextLine();
		                System.out.println("Informe a descrição do item: ");
		                ni = leitor.nextLine();
		                System.out.println("Informe a unidade de medida do item: ");
		                medida = leitor.nextLine();
		                
		                do{
		                    System.out.println("Informe a quantidade: ");
		                    qtd = leitor.nextInt();
		                }while(qtd <= 0);
		                
		                do{
		                    System.out.println("Informe o preço: ");
		                    valori = leitor.nextDouble();
		                }while(valori<=0);
		                Papelaria item = new Papelaria(ni,valori,medida,qtd);
		                leitor.nextLine();
		                String nomei, endi, estadoi;
		                System.out.println("Informe o nome do fornecedor: ");
		                nomei = leitor.nextLine();
		                System.out.println("Informe o endereço do fornecedor: ");
		                endi = leitor.nextLine();
		                System.out.println("Informe o estado do fornecedor: ");
		                estadoi = leitor.nextLine();
		                Fabricante fab2 = new Fabricante(nomei,endi,estadoi);
		                item.setF(fab2);
		                itens.add(item);
		                System.out.println("Item de papelaria adicionado com sucesso!");
		                break;

						case 4: //remover o livro
		                if (livros.size() == 0){
		                    System.out.println("Não há livros cadastrados!");
		                }else{
		                    for (int i = 0; i<livros.size();i++){
		                        System.out.println((i+1) + " - " + livros.get(i).getDescricao());
		                    }
		                    System.out.println("Informe o código do livro a ser removido: ");
		                    int codigo;
		                    do{
		                        codigo = leitor.nextInt();
		                    }while((codigo < 1) || (codigo >livros.size()));
		                    livros.remove(codigo-1);
		                    System.out.println("Livro removido com sucesso!");
		                }
		                break;

						case 5: //remover o livro
		                if (itens.size() == 0){
		                    System.out.println("Não há itens cadastrados!");
		                }else{
		                    for (int i = 0; i<itens.size();i++){
		                        System.out.println((i+1) + " - " + itens.get(i).getDescricao());
		                    }
		                    System.out.println("Informe o código do item a ser removido: ");
		                    int codigo;
		                    do{
		                        codigo = leitor.nextInt();
		                    }while((codigo < 1) || (codigo >itens.size()));
		                    itens.remove(codigo-1);
		                    System.out.println("Item removido com sucesso!");
		                }
		                break;

						


		               case 6: System.out.println("Encerrando o programa...");
		                break;
		        default: System.out.println("Opção inválida!");
		    }
		}while(op!=6);
		
	}
}
