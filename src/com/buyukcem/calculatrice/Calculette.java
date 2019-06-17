package com.buyukcem.calculatrice;


/**
 *
 * @author Buyuk Cem
 */
public class Calculette {
    
    private float resultat;
    private float operande1;
    private float operande2;
    private String operateur;
    
   /*
    * @param operande1 
    * @param operateur
    * @param operande2
    * */
    public Calculette(float operande1, String operateur, float operande2){
        this.operande1 = operande1;
        this.operateur = operateur;
        this.operande2 = operande2;
        this.resultat = 0;
    }    
    
    /*
     * @return resultat du calcule 
     */
    public float Diviser(){
        resultat = operande1 / operande2;
        return resultat;
    }
    /*
     * @return resultat du calcule 
     */
    public float Multiplier(){
        resultat = operande1 * operande2;
        return resultat;
    }
    /*
     * @return resultat du calcule 
     */
    public float Soustraire(){
        resultat = operande1 - operande2;
        return resultat;
    }
    /*
     * @return resultat du calcule 
     */
    public float Additionner(){
        resultat = operande1 + operande2;
        return resultat;
    } 
    
    public float Calculer(){
        switch (operateur){
            case "/":
                return Diviser();
            case "*":
                return Multiplier();
            case "-":
                return Soustraire();
            case "+":
                return Additionner();
        }
        return 0;
    }    
}