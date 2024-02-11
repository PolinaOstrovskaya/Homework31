package Decorator;

public class BlueShapeDecorator extends ShapeDecorator {
    public BlueShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBlueBorder(decoratedShape);
    }

    private void setBlueBorder(Shape decoratedShape) {
        System.out.println("Сообщение от BlueShapeDecorator:цвет границы - синий ");
    }
}
