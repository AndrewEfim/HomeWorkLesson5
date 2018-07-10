public class Main {
    public static void main(String[] args) {
        Figure square = new Square(2);
        Figure triangle = new Triangle(7, 5, 4);
        Figure regtangle = new Regtangle(2, 5);
        Figure circle = new Circle(3);
        circle.area( );
        regtangle.area( );
        triangle.area( );
        square.area( );
    }
}
