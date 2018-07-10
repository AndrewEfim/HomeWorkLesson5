public class Circle extends Figure{
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    void area() {
        double area = Math.PI * (r * r);
        System.out.println("Площадь круга =" + area );
    }
}
