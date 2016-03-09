package oop.evidencerc;

public class RodneCislo {
    private String RC; // formát RRMMDDXXXX
    public RodneCislo(String rc) {
        this.RC = rc;
    }
    public void setRC(String RC) {
        this.RC = RC;
    }
    public String getRC() {
        return RC;
    }
    public int getRok() {
        return Integer.valueOf(RC.substring(0, 2));
    }
    public int getMesic() {
        int mesic = Integer.valueOf(RC.substring(2, 4));
        // ženy mají měsíc zvětšený o 50
        if (mesic > 50) {
            return mesic-50;
        } else {
            return mesic;
        }
    }
    public String getMesicNazev() {
        int mesic = Integer.valueOf(RC.substring(2, 4));
        // ženy mají měsíc zvětšený o 50
        if (mesic > 50) {
            mesic = mesic-50;
        }
        switch (mesic) {
            case 1: return "leden";
            case 2: return "únor";
            case 3: return "březen";
            case 4: return "duben";
            case 5: return "květen";
            case 6: return "červen";
            case 7: return "červenec";
            case 8: return "srpen";
            case 9: return "září";
            case 10: return "říjen";
            case 11: return "listopad";
            case 12: return "prosinec";
            default: return "neznámý měsíc";
        }
    }
    public int getDen() {
        return Integer.valueOf(RC.substring(4, 6));
    }
    public String getPohlavi() {
        if (Integer.valueOf(RC.substring(2, 4)) > 50) {
            return "žena";
        } else {
            return "muž";
        }
    }
}
