import java.util.Scanner;
public class product {
    public String name;
    public int price;
    public int id;
    public int discount;

    void calculatediscount(int price){
        System.out.println("No discount available");
    }
}

class Electronics extends product {
    @Override
    void calculatediscount(int price) {
        System.out.println("Discount is: " + 0.2 * price);
    }
}

class Clothing extends product {
    @Override
    void calculatediscount(int price) {
        System.out.println("Discount is: " + 0.3 * price);
    }
}

class Grocery extends product {
    @Override
    void calculatediscount(int price) {
        System.out.println("Discount is: " + 0.5 * price);
    }
}
class producttest {
    public static void main(String[] args) {
        product e = new Electronics();
        product c = new Clothing();
        product g = new Grocery();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter product from list:-");
        System.out.println("1.Electronics");
        System.out.println("2.Clothing");
        System.out.println("3.Grocery");
        int option=scanner.nextInt();
        int price=scanner.nextInt();
        product item;
        switch(option){
            case 1:
                item=e;
                item.calculatediscount(price);
                break;
            case 2:
                item=c;
                item.calculatediscount(price);
                break;
            case 3:
                item=g;
                item.calculatediscount(price);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }            
 }
}