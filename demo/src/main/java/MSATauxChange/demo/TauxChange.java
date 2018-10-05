package MSATauxChange.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TauxChange {

    @Id
    private int id_taux;

    private String deviseS;
    private String deviseD;
    private float taux;
    private String date;

    public TauxChange(int i, String ds, String dd, float t, String d){
        this.id_taux=i;
        this.deviseS=ds;
        this.deviseD=dd;
        this.taux=t;
        this.date=d;
    }

    public int getId_taux() {
        return id_taux;
    }

    public String getDeviseS() {
        return deviseS;
    }

    public String getDeviseD() {
        return deviseD;
    }

    public float getTaux() {
        return taux;
    }

    public String getDate() {
        return date;
    }

    public void setId_taux(int id_taux) {
        this.id_taux = id_taux;
    }

    public void setDeviseS(String deviseS) {
        this.deviseS = deviseS;
    }

    public void setDeviseD(String deviseD) {
        this.deviseD = deviseD;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TauxChange{" +
                "id_taux=" + id_taux +
                ", deviseS='" + deviseS + '\'' +
                ", deviseD='" + deviseD + '\'' +
                ", taux=" + taux +
                ", date='" + date + '\'' +
                '}';
    }
}
