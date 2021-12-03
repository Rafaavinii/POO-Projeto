/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.*;
import java.io.*;
/**
 *
 * @author Meu Pc
 */
public class Arquivo {


    public static String Read(String caminha){
        String conteudo = "";
        try {
            FileReader arq = new FileReader(caminha);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha="";
            try {
                linha = lerArq.readLine();
                while(linha!=null){
                    conteudo += linha+"\n";
                    linha = lerArq.readLine();
                }
                arq.close();
                return conteudo;
            } catch (IOException ex) {
                System.out.println("Erro: Não foi possível ler o arquivo!");
                return "";
            }
        } catch (FileNotFoundException ex) {
            //System.out.println();
            return "Erro: Arquivo não encontrado!";
        }
    }
    
    public static boolean Write(String caminha,String texto){
        try {
            FileWriter arq = new FileWriter(caminha);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(texto);
            gravarArq.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static void delete(String caminho){
        Path path = Paths.get(caminho);

        try {
            Files.delete(path);
        }
        catch (IOException e) {

            e.printStackTrace();
        }
    }
    
    public int contarArquivos(String caminho){
        File f = new File(caminho);

        File[] files = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile();
            }
        });
        
        return files.length;
    }
}
