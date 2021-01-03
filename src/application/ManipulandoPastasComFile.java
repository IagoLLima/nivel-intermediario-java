package application;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastasComFile {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a folder path: ");
    String strPath = sc.nextLine();

    File path = new File(strPath); // o file pode ser tanto um caminho de um arquivo quanto de uma pasta
    File[] folders = path.listFiles(File::isDirectory);/* Pode ser usado uma função como argumento
    de outra função*/
    System.out.println("FOLDERS:");
    for (File folder : folders) {
    System.out.println(folder);
    }

    File[] files = path.listFiles(File::isFile);//filtrar por arquivos
    System.out.println("FILES:");
    for (File file : files) {
    System.out.println(file);
    }

    boolean success = new File(strPath + "\\subdir").mkdir();//criando uma subpasta
    System.out.println("Directory created successfully: " + success);
    sc.close();
    }

}
