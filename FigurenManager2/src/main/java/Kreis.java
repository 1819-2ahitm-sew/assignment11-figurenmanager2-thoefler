public class Kreis extends Formen {

    int koord;
    int radius;
    double area;
    double circumfence;

    public Kreis(int koord, int radius) {
        this.koord = koord;
        this.radius = radius;
    }

    public double getArea(int radius) {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double getCircumfence(int radius) {
        return (2 * radius) * Math.PI;
    }

    public String output() {
        return "Kreis mit Radius: " + radius +
                " -> Fläche: " + getArea(radius) +
                " -> Umfang: " + getCircumfence(radius);
    }

}