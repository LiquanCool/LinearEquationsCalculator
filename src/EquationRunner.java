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
        x1 = Integer.parseInt(point1.substring(1, point1.indexOf(",")));
        y1 = Integer.parseInt(point1.substring(point1.indexOf(",") + 1, point1.indexOf(")")));
        x2 = Integer.parseInt(point2.substring(1, point1.indexOf(",")));
        y2 = Integer.parseInt(point2.substring(point1.indexOf(",") + 1, point1.indexOf(")")));

    }
}
