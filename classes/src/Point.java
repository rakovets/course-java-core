public class Point {
    private double x;
    private double y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
        System.out.println("x= " + x + " y= " + y);
    }

    double getX(){
        System.out.println("x= " + this.x);
        return this.x;
    }

    public void setX(double x){
        this.x = x;
        System.out.println("x= " + x);
    }

    double getY(){
        System.out.println("y= " + this.y);
        return this.y;
    }

    public void setY(double y){
        this.y = y;
        System.out.println("y= " + y);
    }

    //double distance(){}
}