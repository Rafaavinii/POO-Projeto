/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.clientes;

/**
 *
 * @author Meu Pc
 */

public class Clientes {
    private String nome;
    private String cpf;
    private char sexo;
    //private Produto[] compras;

    public Clientes(String nome, String cpf, char sexo/*, Produto[] compras*/){
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
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
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
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

    public void listarCompras(){}


}

