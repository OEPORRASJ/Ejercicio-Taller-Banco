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
public class Banque {
   //Atributos
    private String code;
    
    private Type[] types = null;
    private Compte[] comptes = null;

    public Banque() {
    }
    
    public void addTypes(Type t){
        this.types = t;
       
    }
  
    
    
    
 
    
    
}


