public class Rechteck extends Formen {

    int koord = 0;
    int width = 0;
    int height = 0;
    int area;
    int circumfence;

    public Rechteck(int koord, int width, int height) {
        this.koord = koord;
        this.width = width;
        this.height = height;
    }


    public int getKoord() {
        return koord;
    }

    public void setKoord(int koord) {
        this.koord = koord;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea(int height, int width) {

        area = height * width;

        return area;
    }

    public int getCircumfence(int height, int width) {
        circumfence = 2 * (height + width);
        return circumfence;
    }


    @Override
    public String output() {
        return "Rechteck mit Länge: " + width +
                "und breite: " + height +
                " -> Fläche: " + getArea(height, width) +
                " -> Umfang: " + getCircumfence(height, width);
    }




}
