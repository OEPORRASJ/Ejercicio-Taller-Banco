
package ejerciciorelacionesbanco.modelo;

import java.util.Date;


public class Mouvement {
    private Date date;
    private double soldePrecedent;
    private double montant;
    
    
    //Asociación
    private Type type;
    
    public Mouvement(){}
    
    public Mouvement(Type type){
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    
    
    //Mouvement

    public Mouvement(Date date, double soldePrecedent, double montant) {
        this.date = date;
        this.soldePrecedent = soldePrecedent;
        this.montant = montant;
    }
    

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getSoldePrecedent() {
        return soldePrecedent;
    }

    public void setSoldePrecedent(double soldePrecedent) {
        this.soldePrecedent = soldePrecedent;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
    
    
   
    
}
