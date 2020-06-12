package com.mycompany.projeto.logtxt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Samsung
 */
public class Log5 {
    
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
  
    System.out.printf("Informe o nome de arquivo texto:\n");
    String nome = ler.nextLine();
  
    System.out.printf("\nConteúdo do arquivo texto:\n");
    try {
      FileReader arq = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(arq);
  
      String linha = lerArq.readLine(); // lê a primeira linha
      while (linha != null) {
        System.out.printf("%s\n", linha);
        linha = lerArq.readLine(); // lê da segunda até a última linha
      }
  
      arq.close();
    } catch (IOException e) {
        System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
    }
    System.out.println();
  }
}
