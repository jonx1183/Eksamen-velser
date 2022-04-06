package Øvelse2;

public class Test {
  public static void main(String[] args) {
    Film film1 = new Film("", 0);
    Producer producer1 = new Producer("Jon");
    film1.setFilmtitel("The great test");
    film1.setUdgivelsesÅr(2022);
    film1.setProducer(producer1);

    System.out.println(film1);
  }
}
