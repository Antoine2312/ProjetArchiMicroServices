package MSAOperation.operation;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OperationChange {
    @Id
    private int id;
    private String devise_source;
    private String devise_destination;
    private int montant;
    private String date;
    private float taux;

    public OperationChange(int id_transaction, String devise_source, String devise_destination, int montant, String date, float taux) {
        this.id= id;
        this.devise_source = devise_source;
        this.devise_destination = devise_destination;
        this.montant = montant;
        this.date = date;
        this.taux = taux;
    }

    public int getId_transaction() {
        return id;
    }

    public void setId_transaction(int id_transaction) {
        this.id = id_transaction;
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

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "OperationChange{" +
                "id_transaction=" + id +
                ", devise_source='" + devise_source + '\'' +
                ", devise_destination='" + devise_destination + '\'' +
                ", montant=" + montant +
                ", date='" + date + '\'' +
                ", taux=" + taux +
                '}';
    }
}
