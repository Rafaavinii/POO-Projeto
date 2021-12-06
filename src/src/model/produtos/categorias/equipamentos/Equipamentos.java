package model.produtos.categorias.equipamentos;
import model.produtos.*;

public class Equipamentos extends Produto{

	private String marca;
	private String departamento;
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

    public String salvarEquipamento(){
        return "" + this.nome + "\n" + this.preco + "\n"  + this.marca + "\n"  + this.departamento + "\n" + this.quantidadeEstoque + "\n";
    }
	
	
	
}
