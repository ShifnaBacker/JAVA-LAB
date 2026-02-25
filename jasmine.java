class Flower {
    String name;
    String color;
    double price;
    
    Flower(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }
    
}
public class jasmine extends Flower {
    jasmine(String name, String color, double price) {
        super(name, color, price);
    }
    
    void display() {
        System.out.println("Flower Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
    }
    
    public static void main(String[] args) {
        jasmine j = new jasmine("Jasmine", "White", 10.0);
        j.display();
    }
    
}
