import java.text.DecimalFormat;
public class LinearEquation {
    DecimalFormat df = new DecimalFormat( "0.00" );
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double y3;
    private double slope;
    private String fractionSlope;
    private double yIntercept;
    private double distance;

    public LinearEquation(int x1, int y1, int x2, int y2) {//constructor
        this.x1 = x1;//puts information in private variables so methods can use
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public void calculate(){//runs the methods except toString() and findY()
        findSlope();
        findYIntercept();
        findDistance();
    }
    public double findSlope(){//finds slope with formula
        double slope = (double)(y2-y1)/(x2-x1);
        this.slope = slope;
        return slope;
    }
    public double findYIntercept(){//use standard form to solve for y int
        double yIntercept = (double)y1-(x1*slope);
        this.yIntercept = yIntercept;
        return yIntercept;
    }
    public double findDistance(){//calculates distance with the formula
        double distance = Math.sqrt((double)Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        this.distance = distance;
        return distance;
    }
    public String findY(double x3){//finds the y value for the x value argument
        double y3 = x3*slope+yIntercept;
        this.y3 = y3;
        return df.format(y3);
    }
    public String toString(){//returns string with the information
        return "Point 1: " + "(" + x1 + "," + y1 + ")\n"
        + "Point 2: " + "(" + x2 + "," + y2 + ")\n"
        + "Slope of line: " + df.format(slope) + "\n"
        + "Y-intercept: " + df.format(yIntercept) + "\n"
        + "Slope intercept form: " + "y = " + (y2-y1) + "/" + (x2-x1) + "x + " + df.format(yIntercept) + "\n"
        + "Distance between points: " + df.format(distance) + "\n";
    }
}