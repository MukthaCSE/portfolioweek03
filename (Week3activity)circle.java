public class Circle {
    private double radius;

    public Circle() {
        radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 7;
        
        double area = circle.calculateArea();
        double circumference = circle.calculateCircumference();
       
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}
