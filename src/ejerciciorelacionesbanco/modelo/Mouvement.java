/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciorelacionesbanco.modelo;

/**
 *
 * @author Estudiante
 */
public class Mouvement {
    private String date;
    private double soldePrecedent;
    private double montant;
    
    private Type type;
    
    
    
    public Mouvement(){
        
    }
    
    public void addType(Type t){
      this.type= t;
    }
    
    

    
    
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
     
   
    
}
