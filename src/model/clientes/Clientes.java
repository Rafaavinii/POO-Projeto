package model.clientes;
import model.produtos.Produto; //ant
/**
 *
 * @author Meu Pc
 */

public class Clientes {
    private String nome;
    private String cpf;
    private char sexo;
    private Produto[] carrinhoCompras = new Produto[100]; //ant
    private int qtdCompras = 0;

    public Clientes(String nome, String cpf/*, Produto[] compras*/){
        this.nome = nome;
        this.cpf = cpf;
        //this.compras = compras;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }


    /*public void setCompras(Produto[] compras) {
        this.compras = compras;
    }
    public Produto[] getCompras() {
        return compras;
    }*/
    
    public String salvarCliente(){
        return getNome() + "\n" + getCpf();
    }

    public void listarCompras(){    //ant
        for(int i = 0; i < this.qtdCompras; i++){
            carrinhoCompras[i].infoProduto();
            System.out.println();
        }
    }   

    public void addCarrinho(Produto produto){   //ant
        if(produto.quantidadeEstoque <= 0){
            System.out.println("Produto fora de estoque!");
        }
        else{
            this.carrinhoCompras[this.qtdCompras] = produto;
            this.qtdCompras++;
            produto.quantidadeEstoque--;
        }
        
    }
    
    public float fazerCompra(){ //ant
        float precoTotal = 0;
        for(int i=0; i < this.qtdCompras; i++){
            precoTotal =+ carrinhoCompras[i].preco;
        }
        this.qtdCompras = 0;
        
        //Colocar outros Metodos
        
        return precoTotal;
    }
}