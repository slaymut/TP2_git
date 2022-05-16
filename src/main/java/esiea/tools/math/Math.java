package esiea.tools.math;

/**
    * Classe qui offre des methodes de calcul mathematiques
    * @version 1.0
    * @author Felicia Ionascu
*/
public final class Math {

    /** 
    * Methode pour l'addition de deux entiers
    * @param first1 le premier terme
    * @param second1 le second terme
    * @return la somme des deux termes
    */
	public static int add(int first1, int second1) {
        return first1 + second1;
    }

	public  static   double add (double first1, double second1) {
		return first1 + second1;
	}
	
	public static int subtract (int first, int second) {
	   return first - second;
	}
	
	public static double subtract (double first, double second) {
		   return first - second;
	}
	
    public static int multiply(int multiplicand, int multiplier){
        int result = multiplicand * multiplier;
         return result;
    }
    
    public static double multiply(double multiplicand, double multiplier) {
        return multiplicand * multiplier;
    }

    /** 
    * Methode pour la division de deux entiers
    * @param dividend le numerateur
    * @param divisor le denominateur
    * @return le resultat
    * @exception  IllegalArgumentException si le denominateur est zero
    */

    public static double divide(int dividend, int divisor) throws IllegalArgumentException {
        if (divisor == 0)
            throw new IllegalArgumentException("Cannot divide by zero (0).");

        return dividend / divisor;
    }
    
    public static double divide(double dividend, double divisor) throws IllegalArgumentException {
        if (divisor == 0.0)
            throw new IllegalArgumentException("Cannot divide by zero (0).");

        return dividend / divisor;
    }
}