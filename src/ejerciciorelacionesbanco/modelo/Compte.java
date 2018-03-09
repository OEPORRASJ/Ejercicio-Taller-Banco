
package ejerciciorelacionesbanco.modelo;

import java.util.ArrayList;
import java.util.Date;




public class Compte {
    private int numeroCompte;
    private double soldeCourant;
    private Date dateCreation;
    private String nomClient;
    
  
    //Composición
    private ArrayList<Mouvement> mouvements = new ArrayList<Mouvement>();
    
    
       
    public void setMouvement(Mouvement mouvement){
        mouvements.add(mouvement);
    }
    
    //Compte

    public Compte(int numeroCompte, double soldeCourant, Date dateCreation, String nomClient) {
        this.numeroCompte = numeroCompte;
        this.soldeCourant = soldeCourant;
        this.dateCreation = dateCreation;
        this.nomClient = nomClient;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSoldeCourant() {
        return soldeCourant;
    }

    public void setSoldeCourant(double soldeCourant) {
        this.soldeCourant = soldeCourant;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }
    
}
