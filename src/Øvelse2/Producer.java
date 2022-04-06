package Øvelse2;

public class Producer {

  private String name;

  Producer(String name){
    setName(name);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Producer{" +
        "name='" + name + '\'' +
        '}';
  }
}
