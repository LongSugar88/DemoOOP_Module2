import java.util.Scanner;

public class Rectangle {
        double width, height;

        public Rectangle(){
        }
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return width*height;
        }
        public double getParameter() {
            return (width+height)*2;
        }

        public String display() {
            return "the Rectangle has width is :" + width + " ,height is : " + height;
        }
}


class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the width : ");
        double width = sc.nextDouble();
        System.out.println("enter the height : ");
        double height = sc.nextDouble();

        Rectangle myRect = new Rectangle(width,height);
        System.out.println(myRect.display());
        System.out.printf("The Area is : %.2f \n",myRect.getArea());
        System.out.println("The Parameter is : "+ myRect.getParameter());
    }
}
