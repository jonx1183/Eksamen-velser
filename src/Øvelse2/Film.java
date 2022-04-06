package Øvelse2;

public class Film {

  private String filmtitel;
  private int udgivelsesÅr;
  private  Producer producer;

  public Film(String filmtitel, int udgivelsesÅr){
  }

  public Film(String filmtitel){
    setUdgivelsesÅr(udgivelsesÅr);
  }

  public Producer getProducer() {
    return producer;
  }

  public void setProducer(Producer producer) {
    this.producer = producer;
  }

  public void setFilmtitel(String filmtitel) {
    this.filmtitel = filmtitel;
  }

  public void setUdgivelsesÅr(int udgivelsesÅr) {
    this.udgivelsesÅr = udgivelsesÅr;
  }

  public String getFilmtitel() {
    return filmtitel;
  }

  public int getUdgivelsesÅr() {
    return udgivelsesÅr;
  }

  @Override
  public String toString() {
    return "Film{" +
        "filmtitel='" + filmtitel + '\'' +
        ", udgivelsesÅr=" + udgivelsesÅr +
        ", producer=" + producer +
        '}';
  }
}
