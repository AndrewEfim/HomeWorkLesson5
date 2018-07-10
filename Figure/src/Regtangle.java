public class Regtangle extends Figure {
    private int a;
    private int b;

    public Regtangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    void area() {
        System.out.println("Площадь прямоугольника = " + a*b );

    }
}
