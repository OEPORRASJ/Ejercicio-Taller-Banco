
package ejerciciorelacionesbanco.modelo;

import java.util.ArrayList;



public class Banque {

    private String code;
    
      
    //Asociación
    private ArrayList<Type> types = new ArrayList <Type>();
    private ArrayList<Compte> comptes = new ArrayList <Compte>();
    
    public void setType(Type type){
        types.add(type);
    }
    
    public void setCompte(Compte compte){
        comptes.add(compte);
    }
    
    
    //Banque

    public Banque(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    
    
}


