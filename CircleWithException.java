import java.util.Scanner;

public class CircleWithException {
    private double radius;
    private static final double PI = 3.1415291;

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException{
        if (radius < 0 ){
            throw new IllegalArgumentException("Radius has to be a positive number");
        }
        else{
        this.radius = radius;
    }
    }

    public double getArea() throws Exception{
        double area = PI * radius * radius;
        if (area > 1000){
            throw new Exception ("Area bigger than 1000");
        }
        else{
            return area;
        }
    }

    public double getDiameter(){
        return radius * 2;
    }

    // public CircleWithException (double radius) throws Exception{
    //     if (radius < 0){
    //         throw new IllegalArgumentException ("Radius is not a positive number");
    //     }

    //     if (radius > maxRadius){
    //         throw new Exception ("Radius provided results in area of more than 1000 cm2, which is not allowed");
    //     }

    //     this.radius = radius;
    // }

    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in);
        CircleWithException c = new CircleWithException();
        System.out.println("Please input radius of circle in cm: ");
        double radius = sc.nextDouble();

        c.setRadius(radius);
        System.out.println("Radius of circle is : " + c.getRadius() );
        System.out.println("Area of circle is : " + c.getArea() );
        System.out.println("Diameter of circle is : " + c.getDiameter() );
    }
    catch(IllegalArgumentException e)
    {
        System.out.println("Illegal Argument: " + e.getMessage());
    }
    catch(Exception e){
        System.out.println("General Exception: "+ e.getMessage());
    }
    }
}