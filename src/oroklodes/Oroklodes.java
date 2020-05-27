package oroklodes;

public class Oroklodes {
    public static void main(String[] args) {

        // Itt hozzuk létre az Osztályokból a példányokat
        Nagypapa pestipapa = new Nagypapa(); //Nagypapa az osztály, pestipapa a változó, a New Apuka() pedig létrehozza az új példányt (instance angolul)
        Apuka apus = new Apuka();
        Gyerek barni = new Gyerek();
        Szomszed barniSzomszed = new Szomszed();

        pestipapa.fingott(); //a pestiPapa változón (ami egy Nagypapa típusú objektum példányára mutat) meghívjuk a .fingott() függvényt
        apus.fingott(); //
        barni.fingott();

        System.out.println("Nagypapa életkor változó alapján  = " + pestipapa.eletkor);
        System.out.println("Apuka életkor változó alapján     = " + apus.eletkor);
        System.out.println("Gyerek életkor változó alapján    = " + barni.eletkor);

        System.out.println("Nagypapa életkor getter metódussal lekérdezve   = " + pestipapa.getEletkor());
        System.out.println("Apuka életkor getter metódussal lekérdezve      = " + apus.getEletkor());
        System.out.println("Gyerek életkor getter metódussal lekérdezve     = " + barni.getEletkor());
        System.out.println("Szomszéd életkor getter metódussal lekérdezve   = " + barniSzomszed.getEletkor());

        // Ez is érdekes, itt egy Nagypapa típusú osztályba egy Gyerek osztály példányosítunk. Ez azért lehet, mert a Gyerek örökli az apát, az apa pedig a nagypapát
        Nagypapa gyerekNagypapa = new Gyerek();
        gyerekNagypapa.fingott(); // mivel a gyerekNagypapa változó egy Gyerek objektum példánya, ezért a Gyerek osztályban lévő fingott függvényt hajtja végre

        // Ez hibás, ha kikommenteled kiírja, hogy a gyerek típusú változónak (nagypapaGyerek) nem lehet Nagypapa osztály példányosítani (new NagyPapa)
//        Gyerek nagypapaGyerek = (Gyerek) new Nagypapa();
//        nagypapaGyerek.fingott();

        System.out.println("csakANagypapaVáltozója a pesti papa objektum példányból változó alapján " + pestipapa.csakAnagypapaValtozoja);
        System.out.println("csakANagypapaVáltozója a pesti papa objektum példányból getter alapján " + pestipapa.getCsakAnagypapaValtozoja());

        //Na ez az érdekes itt, mi van akkor, ha a gyerek osztály próbálja meghívni a getCsakAnagypapaValtozoja() metódust?
        System.out.println("Gyerek hívja csakANagypapaValtozoja gettert = " + barni.csakAnagypapaValtozoja);

        // Ez pedig hibás lenne, ha kikommentelnéd, mert a Szomszed osztály NEM örökli a nagypapa dolgait
//        System.out.println("Szomszéd hívja csakANagypapaValtozoja gettert = " + barniSzomszed.csakAnagypapaValtozoja);

    }
}
