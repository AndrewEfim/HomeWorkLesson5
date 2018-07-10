public class Square extends Figure {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    void area() {
        System.out.println("Площадь квадрата = " + a*a );
    }
}
