package controller;
import javax.swing.JOptionPane;

import model.Arquivo;
import model.clientes.Clientes;

public class ControllerClientes {

    public void cadastrar(String caminho, int id, Clientes cliente){
        if(Arquivo.Write(caminho + id + ".txt", cliente.salvarCliente())){
            System.out.println("Arquivo salvo com sucesso");
            JOptionPane.showMessageDialog(null, "Cliente Cadastrado com sucesso!");
        }
        else
            System.out.println("Erro ao salvar");
    }

    public void excluir(int tamanho, String caminho, String cpf){
        String[] inf;
        String conteudo;
        Arquivo arq = new Arquivo();
        String[] nomesArq = arq.mostrarAqrquivos(caminho);
        int id =1;
        for(int i = 0; i<tamanho; i++){
            conteudo = arq.Read(caminho + "\\" + nomesArq[i]);
            inf = conteudo.split("\n");
            if(cpf.equals(inf[1])){
                Clientes cliente = new Clientes(inf[0], inf[1]);
                arq.Write(".\\src\\model\\clientes\\clientesExcluidos\\clienteE"+ id +".txt", cliente.salvarCliente());
                id++;
                arq.delete(caminho + "\\" + nomesArq[i]);
                JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!");
            }
        }
    }

    public String[] listar(int tamanho, String caminho){
        Arquivo arq = new Arquivo();
        String[] nomesArquivos = arq.mostrarAqrquivos(caminho);
        String conteudo;
        String[] cliente;
        String[] vetorClientes = new String[tamanho];

        for(int i = 0; i<tamanho; i++){
            conteudo = arq.Read(caminho + "\\" + nomesArquivos[i]);
            cliente = conteudo.split("\n");
            vetorClientes[i] = cliente[0] + ";" + cliente[1];
        }

        return vetorClientes;
    }

    public boolean validarCPF(String cpf, String caminho){
        int tamanho = Arquivo.contarArquivos(caminho);
        String[] vet = new String[tamanho];
        String[] conteudo;
        if(tamanho > 0){
            vet = this.listar(tamanho, caminho);
            for(int i = 0; i<tamanho; i++){
                conteudo = vet[i].split(";");
                if(conteudo[1].equals(cpf)){
                    return false;
                }
            }
        }

        return true;
    }
}
