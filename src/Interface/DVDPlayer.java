package Interface;

public class DVDPlayer implements Player{
    public void play(){
        System.out.println ("Please Play Dvd Player");
    }
    public void stop(){
        System.out.println ("Please stop the Dvd player");
    }
    public void pause(){
        System.out.println (" Please pause Dvd player");
    }
    public void reverse(){
        System.out.println ("Please reverse the Dvd player");
    }
    public void video (){
        System.out.println (" DVD is a  video player");
    }
}
