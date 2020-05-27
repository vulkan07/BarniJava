package oroklodes;

// A Szomszéd osztály nem leszármazottja sem a Nagypapának, sem a Gyerek-nek
public class Szomszed {

    int eletkor = 30;

    public void fingott() {
        System.out.println("Szomszéd fingott.");
    }

    public int getEletkor() {
        return eletkor;
    }
}
