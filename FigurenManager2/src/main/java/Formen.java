public abstract class Formen {

    static Rechteck rechteck = new Rechteck(0, 3,5);
    static Kreis kreis = new Kreis(0,5);
    static Ellipse ellipse = new Ellipse();

    static String[] formen = new String[]{
            rechteck.output(),
            kreis.output()
    };


    abstract public String output();


}
