package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ProductInCsv;

public class ProgramProductCsv {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter file path: ");
    String sourceFileStr = sc.nextLine();

    boolean fileCreation = new File(sourceFileStr + "\\out").mkdir();
    System.out.println("Created file: "+fileCreation);
    String targetFileStr = sourceFileStr + "\\out\\summary.csv"; 

    String path = "C:\\Users\\Karen_Iago\\Documents\\Iago\\Capacitacao\\Java\\course\\nivel-intermediario-java\\ProductData.csv";
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      // pode ser instanciado as streams direto no try, porque agora não precisa mais
      // fechar essas var no final

      List<ProductInCsv> listProduct = new ArrayList<>();

      String line = br.readLine();
      while (line != null) {
        String[] fields = line.split(",");
        String name = fields[0];
        double price = Double.parseDouble(fields[1]);
        int quantity = Integer.parseInt(fields[2]);
        listProduct.add(new ProductInCsv(name, price, quantity));
        line = br.readLine();
      }

      try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

        for (ProductInCsv productInCsv : listProduct) {
          bw.write(productInCsv.sumary());
          bw.newLine();
        }
      } catch (IOException e) {
        System.out.println("Error writing file: " + e.getMessage());
      }

    } catch (IOException e) {
      System.out.println("Error reading file: " + e.getMessage());
    }
    sc.close();
  }

}
