package ole.example;

public class Main {


    public static void main(String[] args) {
        Nummern nummern = new Nummern();
        nummern.randomEanNummer();
        nummern.getEanNummer();


        System.out.println(nummern.getEanNummer());
    }
}
