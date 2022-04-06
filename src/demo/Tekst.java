package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Tekst {

  ArrayList<String> tekstLinjer = new ArrayList<String>();
  Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    new Tekst().go();
  }

  public void go(){
    tilføj();
    findAntalUnikke();
  }

  public void tilføj(){
     tekstLinjer.add("Test");
     tekstLinjer.add("Test2");
     tekstLinjer.add("Test3");
     tekstLinjer.add(scanner.nextLine());
  }

  public void findAntalUnikke(){
     System.out.println(tekstLinjer.size());
   }
}
