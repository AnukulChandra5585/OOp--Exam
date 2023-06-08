package Interface;

public class Main {
    public static void main(String[] args) {


        CDPlayer c = new CDPlayer ();
        c.audio ();
        c.play ();
        c.stop ();
        c.pause ();
        c.reverse ();
        DVDPlayer d = new DVDPlayer ();
        d.video ();
        d.play ();
        d.stop ();
        d.pause ();
        d.reverse ();
    }
}