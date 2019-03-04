package xml;

/**
 * Created by 张文旭 on 2019/2/25.
 */
public class Phone {
    private  String p;
    private  double price;
    private String color;
   public Phone(){

   }
    public Phone(String p, double price, String color) {
        this.p = p;
        this.price = price;
        this.color = color;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "p='" + p + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
