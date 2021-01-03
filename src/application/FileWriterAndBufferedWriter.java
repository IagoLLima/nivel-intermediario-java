package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//classes para escrever ao final do arquivo

public class FileWriterAndBufferedWriter {
  public static void main(String[] args) {
    String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };//feito um vetor de String
    String path = "C:\\Users\\Karen_Iago\\Documents\\Iago\\Capacitação\\Java\\course\\nivel-intermediario-java\\out.txt";
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
      /* Se tivesse feito (new FileWriter(path, true)) iria acrescentar os dados
      no final, não recriando o arquvio/gerando um novo*/
      for (String line : lines) {
        bw.write(line);
        bw.newLine();//por patrão não tem a quebra de linha, pois de mais esse line 
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
