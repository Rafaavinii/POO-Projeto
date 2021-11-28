package model.produtos.categorias.roupas;

import model.produtos.*;

public class Roupas extends Produto{
	
	private String marca;
	private String genero;
	private String tipo;
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

    public String salvarRoupa(){
        return ""+ this.nome +"\n"+ this.preco +"\n"+ this.marca +"\n"+ this.genero+"\n"+ this.tipo+"\n"+this.quantidadeEstoque+"";
    }
	
}
