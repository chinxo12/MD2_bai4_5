import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập vào b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập vào c: ");
        double c = scanner.nextDouble();
        QuadraticEquation ptBac2 = new QuadraticEquation(a,b,c);
        double delta = ptBac2.getDiscriminant();
        if (delta<0){
            System.out.println("Phương trình vô nghiệm");
        } else if (delta==0){
            double root = -b/(2*a);
            System.out.println("Phương trình có nghiệm kép " + root);
        }else {
            double root1 =  ptBac2.getRoot1();
            double root2 = ptBac2.getRoot2();
            System.out.println("Phương trình có hai nghiệm là: " + root1 + " " +root2);
        }

    }
}