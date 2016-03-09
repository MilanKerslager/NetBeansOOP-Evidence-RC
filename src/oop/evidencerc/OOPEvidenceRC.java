package oop.evidencerc;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OOPEvidenceRC {

    public static void main(String[] args) {
        System.out.println("Objekt ze třídy RodneCislo:");
        RodneCislo x = new RodneCislo("1653091234");
        System.out.println("RČ: "+x.getRC());
        System.out.println("Rok: "+x.getRok());
        System.out.println("Měsíc: "+x.getMesic());
        System.out.println("Den: "+x.getDen());
        System.out.println("Den: "+x.getPohlavi());
        
        System.out.println("");
        System.out.println("Objekt ze třídy Osoba:");
        Osoba o = new Osoba("René", "9903081234");
        o.predstavSe();
        
        System.out.println("");
        System.out.println("Objekt ze třídy Osoba:");
        Zamestnanec z = new Zamestnanec(19000, "Jane", "9953081234");
        z.predstavSe();
    }    
}
