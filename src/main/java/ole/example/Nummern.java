package ole.example;

public class Nummern {

    char[] eanNummer = new char[13];
    public char[] getEanNummer() {
        return eanNummer;
    }
    public void setEanNummer(char[] eanNummer) {
        this.eanNummer = eanNummer;
    }
    public void randomEanNummer(){
        for(int i = 0;i<12;i++) {
            eanNummer[i] = getChar((int) Math.floor(Math.random() * (9 + 1)));

        }
        eanNummer[12] = getKontrollNummer();
    }
    private char getChar(int nummer){
        return (char) (nummer + '0');
    }
    private int getSummeNummer(){
        return
        (Integer.parseInt(String.valueOf(eanNummer[0]))+
        Integer.parseInt(String.valueOf(eanNummer[1])) * 3 +
        Integer.parseInt(String.valueOf(eanNummer[2])) +
        Integer.parseInt(String.valueOf(eanNummer[3])) * 3 +
        Integer.parseInt(String.valueOf(eanNummer[4])) +
        Integer.parseInt(String.valueOf(eanNummer[5])) * 3 +
        Integer.parseInt(String.valueOf(eanNummer[6])) +
        Integer.parseInt(String.valueOf(eanNummer[7]))* 3 +
        Integer.parseInt(String.valueOf(eanNummer[8])) +
        Integer.parseInt(String.valueOf(eanNummer[9])) * 3 +
        Integer.parseInt(String.valueOf(eanNummer[10])) +
        Integer.parseInt(String.valueOf(eanNummer[11])) * 3);

    }
    public char getKontrollNummer() {
        if (getSummeNummer()%10 == 0){
            return ('0');
        }else return getChar(10 - (getSummeNummer() % 10));

        }
    }

