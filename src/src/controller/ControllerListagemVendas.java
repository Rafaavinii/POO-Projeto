/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Arquivo;


public class ControllerListagemVendas {

    public String[] listar(int tamanho, String caminho){
        Arquivo arq = new Arquivo();
        String conteudo;
        int j = 1;
        String[] venda;
        String[] vetorVendas = new String[tamanho];
        String[] nomesArq = arq.mostrarAqrquivos(caminho);
    
        for(int i = 0; i<tamanho; i++){
            conteudo = arq.Read(caminho + "\\" + nomesArq[i]);
            venda = conteudo.split(";");
            vetorVendas[i] = venda[0] + ";" + venda[1] + ";" + venda[2] + ";" + venda[3] + ";" + venda[4];
        } 
        
        return vetorVendas;
    }
}
