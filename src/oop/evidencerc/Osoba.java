package oop.evidencerc;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Osoba {
    String jmeno;
    // tzv. KOMPOZICE -> objekt obsahuje jiný objekt jako členskou proměnnou
    RodneCislo rc;

    public Osoba(String jmeno, String r) {
        this.jmeno = jmeno;
        rc = new RodneCislo(r);
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    public void setRC(RodneCislo rc) {
        this.rc = rc;
    }
    public String getJmeno() {
        return jmeno;
    }
    public String getRC() {
        return rc.getRC();
    }
    public int getRok() {
        return rc.getRok();
    }
    public int getMesic() {
        return rc.getMesic();
    }    
    public String getMesicNazev() {
        return rc.getMesicNazev();
    }    
    public int getDen() {
        return rc.getDen();
    }
    public String getPohlavi() {
        return rc.getPohlavi();
    }
    public void predstavSe() {
        System.out.println("Jmenuji se "+this.getJmeno()+
                ", jsem "+this.getPohlavi()+".");
        System.out.println("Moje RČ: "+this.getRC());
        System.out.print("Narozen: "+this.getDen()+
                "."+this.getMesic()+".");
        int narozen = this.getRok()*10000+this.getMesic()*100+this.getDen();
        int dneska = Integer.valueOf(
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("YYMMdd")));
        // pokud je narozen dnes, je mu nula let
        // je-li datum narození zítřejší, je narozen 19XY nebo 20XY
        if (narozen > dneska) {
            System.out.println("19"+this.getRok());
        } else {
            if (this.getRok() <= 16) {
                System.out.println("20"+this.getRok());
            } else {
                System.out.println("19"+this.getRok());
            }
        }
    }
}