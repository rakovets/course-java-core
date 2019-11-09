public class Rectangle {
    private double pointLT;
    private double pointRU;

    Rectangle(double point1, double point2){
        //this point1 =
    }

    double getPointLT(){
        System.out.println("x= ; y= " + this.pointLT);
        return this.pointLT;
    }

    public void setPointLT(double pointLT){
        this.pointLT = pointLT;
        System.out.println("x= " + pointLT);
    }

    double getPointRU(){
        System.out.println("y= " + this.pointRU);
        return this.pointRU;
    }

    public void setPointRU(double pointRU){
        this.pointRU = pointRU;
        System.out.println("y= " + pointRU);
    }
}
