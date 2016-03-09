package oop.evidencerc;

public class Zamestnanec extends Osoba {
    int vyplata;

    public Zamestnanec(int vyplata, String jmeno, String r) {
        super(jmeno, r);
        this.vyplata = vyplata;
    }
    
    public void predstavSe() {
        super.predstavSe();
        System.out.println("Moje výplata: "+this.vyplata);
    }
}
