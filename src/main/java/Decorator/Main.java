package Decorator;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle();
        BlueShapeDecorator bluecircle=new BlueShapeDecorator(new Circle());
        System.out.println("\nОбычный круг:");
        circle.draw();
        System.out.println("\nКруг с синей границей:");
        bluecircle.draw();

    }
}
