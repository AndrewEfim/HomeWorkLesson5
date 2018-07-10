public class Triangle extends Figure {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double perimeterCulculate() {
        int perimeter = (a + b + c);
        return perimeter;
    }
    @Override
    void area() {
        int perimetrHalf = (a + b + c) / 2;
        double area = Math.sqrt((perimetrHalf * (perimetrHalf - a) * (perimetrHalf - b) * (perimetrHalf - c)));
        System.out.println("Площадь треугольника = "+ area);
    }
}
