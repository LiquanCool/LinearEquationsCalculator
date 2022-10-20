import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        String point1;
        String point2;
        int x1;
        int y1;
        int x2;
        int y2;
        double x3;
        Scanner s = new Scanner(System.in);
        Scanner sDouble = new Scanner(System.in);
        System.out.println("Welcome to the Linear Equation Calculator! What is your first coordinate point?");
        point1 = s.nextLine();
        System.out.println("Great! What is your second coordinate point?");
        point2 = s.nextLine();
        x1 = Integer.parseInt(point1.substring(1, point1.indexOf(",")));//stores the values in variables
        y1 = Integer.parseInt(point1.substring(point1.indexOf(",") + 1, point1.indexOf(")")));
        x2 = Integer.parseInt(point2.substring(1, point2.indexOf(",")));
        y2 = Integer.parseInt(point2.substring(point2.indexOf(",") + 1, point2.indexOf(")")));
        LinearEquation equation = new LinearEquation(x1,y1,x2,y2);
        equation.calculate(); //runs the methods
        System.out.print(equation);//calls the toString() method
        System.out.println("Enter a x value to find a y value for: ");
        x3 = s.nextDouble();
        System.out.println("The y coordinate point for that x coordinate point is: " + "(" + x3 + "," + equation.findY(x3) + ")");

    }
}
