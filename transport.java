
import java.util.Scanner;
abstract class  transport{
    public int distance;
    abstract  void calculateFare(int distance);
}
class bus extends transport{
    @Override
    void calculateFare(int distance) {
        System.out.println("Bus fare is: "+ 5*distance);
    }
}
class taxi extends transport{
    @Override
    void calculateFare(int distance) {
        System.out.println("Taxi fare is: "+ 10*distance);
    }
}
class train extends transport{
    @Override
    void calculateFare(int distance) {
        System.out.println("Train fare is: "+ 7*distance);
    }
}
class transporttest{
    public static void main(String[] args) {
        transport b = new bus();
        transport t = new taxi();
        transport tr = new train();
        transport o;
        System.out.println("Enter transport from list:-");
        System.out.println("1.Bus");
        System.out.println("2.Taxi");
        System.out.println("3.Train");
        Scanner scanner= new Scanner(System.in);
        int option=scanner.nextInt();
        int distance=scanner.nextInt();
        switch(option){
            case 1:
                o=b;
                o.calculateFare(distance);
                break;
            case 2:
                o=t;
                o.calculateFare(distance);
                break;
            case 3:
                o=tr;
                o.calculateFare(distance);
                break;
            case 4:
                System.out.println("Invalid option");
                break;          
    }
}
}
