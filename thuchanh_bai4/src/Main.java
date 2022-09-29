import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the width");
        double width = scanner.nextDouble();
        System.out.println("Enter the height");
        double height = scanner.nextDouble();
        Rectangle hcn = new Rectangle(width,height);
        System.out.println("Your Rectangle " + hcn.display());
        System.out.println("Area " + hcn.getArea());
        System.out.println("Perimeter " + hcn.getPerimeter());



    }
}