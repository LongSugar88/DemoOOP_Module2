import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c,delta;

    public QuadraticEquation(){
    }

    public double getA() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the A:");
        this.a = sc.nextDouble();
        return a;
    }

    public double getB() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the B:");
        this.b = sc.nextDouble();
        return b;
    }

    public double getC() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the C:");
        this.c = sc.nextDouble();
        return c;
    }


    public String getRoot() {
        this.delta = (b*b) - (4*a*c);
        if (this.delta > 0) {
            double newDelta = Math.sqrt(delta);
            double x1 = (-b + newDelta) / (2*a);
            double x2 = (-b - newDelta) / (2*a);
            return "QuadraticEquation Has two Root is x1 = " + x1 + " and x2 = " + x2;
        }
        else  if (this.delta == 0) {
            double x = -b/(2*a);
            return "QuadraticEquation has one Root is x = " + x;
        }
        else {
            return "QuadraticEquation has no root";
        }
    }
}

class Exam {
    public static void main(String[] args) {
        QuadraticEquation myEquation = new QuadraticEquation();
        myEquation.getA();
        myEquation.getB();
        myEquation.getC();
        System.out.println(myEquation.getRoot());

    }
}