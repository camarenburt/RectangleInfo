import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double side1 = 0;
        double side2 = 0;
        double area;
        double perimeter;
        double diagonal;
        boolean stop1 = false;
        boolean stop2 = false;

        do{
            System.out.println("Enter Length of Side 1:");
            if (scan.hasNextDouble()) {
                side1 = scan.nextDouble();
                scan.nextLine();
                if (side1 >= 0){
                    stop1 = true;
                } else {
                    System.out.println("The value you entered was incorrect. Please try again.");
                }
            } else {
                System.out.println("The value you entered was incorrect. Please try again.");
                scan.nextLine();
            }
        } while(!stop1);
        do{
            System.out.println("Enter Length of Side 2:");
            if (scan.hasNextDouble()) {
                side2 = scan.nextDouble();
                scan.nextLine();
                if (side2 >= 0){
                    stop2 = true;
                } else {
                    System.out.println("The value you entered was incorrect. Please try again.");
                }
            } else {
                System.out.println("The value you entered was incorrect. Please try again.");
                scan.nextLine();
            }
        } while(!stop2);
        area = side1 * side2;
        perimeter = (side1 + side2)*2;
        diagonal = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2,2));
        System.out.printf("Side 1: %12.2f", side1);
        System.out.printf("\nSide 2: %12.2f", side2);
        System.out.printf("\nArea: %14.2f", area);
        System.out.printf("\nPerimeter: %9.2f", perimeter);
        System.out.printf("\nDiagonal: %10.2f", diagonal);
    }
}
