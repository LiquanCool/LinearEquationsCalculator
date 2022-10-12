public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double y3;
    private double slope;
    private String fractionSlope;
    private double yIntercept;
    private double distance;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public void calculate(){
        findSlope();
        findYIntercept();
        findDistance();
    }
    public double findSlope(){
        double slope = ((double)(int)(((double)(y2-y1)/(x2-x1))*100+.5))/100;
        this.slope = slope;
        return slope;
    }
    public double findYIntercept(){
        double yIntercept = ((double)((int)(((double)y1-(x1*slope))*100+.5)))/100;//fix this
        this.yIntercept = yIntercept;
        return yIntercept;
    }
    public double findDistance(){
        double distance = ((double)(int)(((Math.sqrt((double)Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2))))*100+.5))/100;
        this.distance = distance;
        return distance;
    }
    public double findY(double x3){
        double y3 = x3*slope+yIntercept;
        this.y3 = y3;
        return y3;
    }
    public String toString(){
        return "Point 1: " + "(" + x1 + "," + y1 + ")\n"
        + "Point 2: " + "(" + x2 + "," + y2 + ")\n"
        + "Slope of line: " + slope + "\n"
        + "Y-intercept: " + yIntercept + "\n"
        + "Slope intercept form: " + "y = " + (y2-y1) + "/" + (x2-x1) + "x + " + yIntercept + "\n"
        + "Distance between points: " + distance + "\n";
    }
}