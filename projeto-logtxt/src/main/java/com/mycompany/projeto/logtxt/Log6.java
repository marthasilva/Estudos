
package com.mycompany.projeto.logtxt;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
/**
 *
 * @author Samsung
 */
public class Log6 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
    Scanner ler = new Scanner(System.in);
    String nome;
    double nota1, nota2;
    long n;
  
    RandomAccessFile Log2 = new RandomAccessFile("C:\\Users\\samsung\\Desktop\\txt.txt", "rw");
  
    Log2.seek(Log2.length()); // posiciona o ponteiro de posição no final do arquivo
    n = (Log2.length() / 56) + 1; // número do novo registro
    while (true) {
      System.out.printf("%do. registro-------------------------------\n", n);
      System.out.printf("Informe o nome do aluno, FIM para encerrar:\n");
      nome = ler.nextLine();
      if (nome.equalsIgnoreCase("FIM"))
         break;
       
      System.out.printf("\nInforme a 1a. nota: ");
      nota1 = ler.nextDouble();
  
      System.out.printf("Informe a 2a. nota: ");
      nota2 = ler.nextDouble();
  
      ler.nextLine(); // esvazia o buffer do teclado
  
      gravarString(Log2, nome, 20);
      Log2.writeDouble(nota1);
      Log2.writeDouble(nota2);
  
      n = n + 1;
  
      System.out.printf("\n");
    }
    Log2.close();
  }
  
  private static void gravarString(RandomAccessFile arq, String s, int tam) throws IOException {
    StringBuilder result = new StringBuilder(s);
    result.setLength(tam);
    arq.writeChars(result.toString());
}
}