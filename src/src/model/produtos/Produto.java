/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.produtos;

/**
 *
 * @author Meu Pc
 */
public abstract class Produto {
    public String nome;
	public float preco;
	public int quantidadeEstoque;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public String infoProduto(){ //ant
		return this.nome + "/nPreco: "+ this.preco + "/nEm estoque: "+ this.quantidadeEstoque;
	}
}
