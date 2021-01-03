package entities;

public class ProductInCsv {

  private String name;
  private double price;
  private int quantity;

  public ProductInCsv (){}

  public ProductInCsv(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double totalprice (){
    return quantity*price;
  }

  

  @Override
  public String toString() {
    return "Dados do produto "+name
    +": - "+"preço: R$ "+String.format("%.2f",price)
    +" e quantidade total "+quantity+". O valor total do item R$ "+String.format("%.2f", totalprice())+"\n";
  }

  public String sumary (){
    return name+", "+String.format("%.2f", totalprice());
  }
  
  
}
