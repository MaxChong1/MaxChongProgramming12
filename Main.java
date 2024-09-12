import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double xCoor = scan.nextDouble();
        double yCoor = scan.nextDouble();

        //(+, +) = quadrant 1
        //(-, +) = quadrant 2
        //(-, -) = quadrant 3
        //(+, -) = quadrant 4
        if(xCoor == 0.0 && yCoor == 0.0){
            System.out.println("Origin");
        } else if (xCoor >= 0 && yCoor >= 0) {
            System.out.println("Quadrant 1");
        } else if (xCoor < yCoor) {
            System.out.println("Quadrant 2");
        } else if (xCoor <= 0 && yCoor <= 0){
            System.out.println("Quadrant 3");
        } else if (xCoor > yCoor){
            System.out.println("Quadrant 4");
        }


    }
}
