package MSATauxChange.demo;

import javax.persistence.Entity;

@Entity
public class TauxChange {

    private String devise_source;
    private String devise_destination;
    private float taux;
    private String date;

    public TauxChange(){

    }

    public TauxChange(String ds, String dd, float t, String d){
        this.devise_source=ds;
        this.devise_destination=dd;
        this.taux=t;
        this.date=d;
    }

    public String getDevise_source() {
        return devise_source;
    }

    public void setDevise_source(String devise_source) {
        this.devise_source = devise_source;
    }

    public String getDevise_destination() {
        return devise_destination;
    }

    public void setDevise_destination(String devise_destination) {
        this.devise_destination = devise_destination;
    }

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TauxChange{" +
                "devise_source='" + devise_source + '\'' +
                ", devise_destination='" + devise_destination + '\'' +
                ", taux=" + taux +
                ", date='" + date + '\'' +
                '}';
    }
}
