package esiea.tools.vector3d;

public class Entity3d {
    public double x;
    public double y;
    public double z;

    public Entity3d() {
        this.x = (double) 0.0;
        this.y = (double) 0.0;
        this.z = (double) 0.0;
    }
    public Entity3d(Entity3d e) {
        this.x = e.x;
        this.y = e.y;
        this.z = e.z;
    }
    public Entity3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    /**Sets the value of this entity to the scalar multiplication of itself.*/
    public final void scale(double s) {
        this.x *= s;
        this.y *= s;
        this.z *= s;
    }
    /**Sets the value of this entity to the scalar multiplication of entity e1.*/
    public final void scale(double s, Entity3d e1) {
        this.x = s*e1.x;
        this.y = s*e1.y;
        this.z = s*e1.z;
    }

    /**
     * Sets the value of this entity to the sum of itself and e1.
     * @param e1 the other entity
     */
    public final void add(Entity3d e1)
    {
        this.x += e1.x;
        this.y += e1.y;
        this.z += e1.z;
    }

    /**Returns a string that contains the values of this Entity3d. The form is (x,y,z), with three decimal places.*/
    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + "," + this.z + ")";
    }

    @Override
    public int hashCode() {
        long bits = 1L;
        bits = 31L * bits + VectorMathsUtil.doubleToLongBits(x);
        bits = 31L * bits + VectorMathsUtil.doubleToLongBits(y);
        bits = 31L * bits + VectorMathsUtil.doubleToLongBits(z);
        return (int) (bits ^ (bits >> 32));
    }

    /**Returns true if all the data members of Entity3d t1 are equal to the corresponding data members in this Entity3d.*/
    public boolean equals(Entity3d t1) {
        try {
            return(this.x == t1.x && this.y == t1.y && this.z == t1.z);
        }
        catch (NullPointerException e2) {return false;}
    }

     /**Returns true if the distance between this entity and entity t1 is less than or equal to the epsilon parameter,
      * otherwise returns false.
      * The max distance is equal to MAX[abs(x1-x2), abs(y1-y2), abs(z1-z2)].*/
     public boolean epsilonEquals(Entity3d t1, double epsilon) {
         double diff;

         diff = x - t1.x;
         if(Double.isNaN(diff)) return false;
         if((diff<0?-diff:diff) > epsilon) return false;

         diff = y - t1.y;
         if(Double.isNaN(diff)) return false;
         if((diff<0?-diff:diff) > epsilon) return false;

         diff = z - t1.z;
         if(Double.isNaN(diff)) return false;
         if((diff<0?-diff:diff) > epsilon) return false;

         return true;
     }

}