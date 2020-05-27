package oroklodes;

public class Gyerek extends Apuka {
    int eletkor = 12;

    public void fingott(){
        System.out.println("Gyerek fingott.");
    }

    public int getEletkor(){
        return eletkor;
    }
}
