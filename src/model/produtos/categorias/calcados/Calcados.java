/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.produtos.categorias.calcados;

import model.produtos.Produto;
/**
 *
 * @author anton
 */
public class Calcados extends Produto{

	private String tipo;
	private String departamento;
	private String genero;
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
        public String salvarCalcado(){
        return "" + this.nome + "\n" + this.preco + "\n"  + this.tipo + "\n"  + this.departamento + "\n" + this.quantidadeEstoque + "\n" + "\n" + this.genero;
    }	
	
}
