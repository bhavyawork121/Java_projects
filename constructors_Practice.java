public class CharacterCount { 
    public static void main(String[] args) { 
        // Example char array 
        char[] charArray = {'a', 'b', 'c', 'a', 'd', 'a', 'e', 'a'}; 
        char searchChar = 'a'; 
        int count = countCharacterOccurrences(charArray, searchChar); 
        System.out.println("The character '" + searchChar + "' appears " + count + " times."); 
    } 
    public static int countCharacterOccurrences(char[] charArray, char searchChar) { 
        int count = 0; 
        for (char c : charArray) { 
            if (c == searchChar) { 
                count++; 
            } 
        } 
                return count; 
    } 
} 
-----------
public class Individual {
    String fullName;
    int yearsOld;

    Individual() {
        this.fullName = "Unknown";
        this.yearsOld = 0;
    }

    Individual(String fullName, int yearsOld) {
        this.fullName = fullName;
        this.yearsOld = yearsOld;
    }

    Individual(Individual another) {
        this.fullName = another.fullName;
        this.yearsOld = another.yearsOld;
    }

    void showDetails() {
        System.out.println("Name: " + fullName + ", Age: " + yearsOld);
    }

    public static void main(String[] args) {
        Individual i1 = new Individual();
        i1.showDetails();

        Individual i2 = new Individual("Bob", 30);
        i2.showDetails();

        Individual i3 = new Individual(i2);
        i3.showDetails();
    }
---------------
public class Shape {
    double radius;
    double length, width;

    Shape(double radius) {
        this.radius = radius;
        this.length = 0;
        this.width = 0;
    }

    Shape(double length, double width) {
        this.length = length;
        this.width = width;
        this.radius = 0;
    }

    void areaCircle() {
        if (radius > 0) {
            double area = Math.PI * radius * radius;
            System.out.println("Area of Circle with radius " + radius + " is: " + area);
        } else {
            System.out.println("Not a circle shape.");
        }
    }

    void areaRectangle() {
        if (length > 0 && width > 0) {
            double area = length * width;
            System.out.println("Area of Rectangle with length " + length + " and width " + width + " is: " + area);
        } else {
            System.out.println("Not a rectangle shape.");
        }
    }

    public static void main(String[] args) {
        Shape circle = new Shape(7);
        circle.areaCircle();

        Shape rectangle = new Shape(10, 5);
        rectangle.areaRectangle();
    }
}

}
