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
public class Compte {
    private int numeroCompte;
    private double soldeCourant;
    private String dateCreation;
    private String nomClient;
    
    private Mouvement[] mouvements = null;

    public Compte(){
       this.mouvements = new Mouvement[20];
    }
    
    
    //public boolean addMoAge(Movimiento m){
      // this.mouvements[?]= m;
    //}
    
    //comp
    public boolean addMo(Type t, double monto, ..){
        Movimiento m = new Mouvement(t, monto, ...);
        this.mouvements[?]= m;
    }
    
    
}
