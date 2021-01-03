package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//stream que é utilizado na classe FileReader significa sequencia de passos

public class ManualFileReaderAndBufferedReader {

  public static void main(String[] args) {
    String path = "C:\\Users\\Karen_Iago\\Documents\\Iago\\Capacitação\\Java\\course\\nivel-intermediario-java\\in.txt";
    BufferedReader br = null;
    FileReader fr = null;
    try {
      fr = new FileReader(path);//foi uma stream na instaciação para pegar o arquivo
      br = new BufferedReader(fr); // Buffer é instaciado através do FileReader. Isso deixa o sistema mais rápido
      String line = br.readLine(); /* essa função vai ler uma linha do arquivo e se o arquivo já tiver no 
      final, vai ser retornado valor nulo*/ 
      while (line != null) { // enquanto for diferente de nulo a função vai lendo as linhas do arquivo
        System.out.println(line);
        line = br.readLine();
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      try {
        if (br != null)
          br.close();
        if (fr != null)
          fr.close();
      } catch (IOException e) {//pode acontecer de dar erro ao fechar o Buffer e o File, por isso da exceção
        e.printStackTrace();
      }
    }
  }

}
