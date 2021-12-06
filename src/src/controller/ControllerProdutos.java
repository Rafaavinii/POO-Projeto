package controller;
import model.Arquivo;


public class ControllerProdutos {

    public String[] listar(int tamanho, String caminho){
        Arquivo arq = new Arquivo();
        String[] nomesArquivos = arq.mostrarAqrquivos(caminho);
        String conteudo;
        String[] produto;
        String[] vetorProduto = new String[tamanho];

        for(int i = 0; i<tamanho; i++){
            conteudo = arq.Read(caminho + "\\" + nomesArquivos[i]);
            produto = conteudo.split("\n");
            vetorProduto[i] = produto[0] + ";" + produto[1] + ";" + produto[4];
        }

        return vetorProduto;
    }
}
