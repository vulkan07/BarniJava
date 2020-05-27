package oroklodes;

public class Apuka extends Nagypapa{
    int eletkor=42;

    @Override
    public void fingott(){
        System.out.println("Apuka fingott.");
    }

    @Override
    public int getEletkor(){
        return eletkor;
    }
}
