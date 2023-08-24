package global.goit.edu.module8.shape;

public class ShapeTest {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape trapeze = new Trapeze();

        System.out.println("circle.getName() = " + circle.getName());
        System.out.println("quad.getName() = " + quad.getName());
        System.out.println("triangle.getName() = " + triangle.getName());
        System.out.println("rectangle.getName() = " + rectangle.getName());
        System.out.println("trapeze.getName() = " + trapeze.getName());

    }

}
