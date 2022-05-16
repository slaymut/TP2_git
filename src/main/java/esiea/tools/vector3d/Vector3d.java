package esiea.tools.vector3d;

public class Vector3d extends Entity3d {

    /**
     * Constructs and initializes a Vector3d from the specified xyz coordinates.
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     */
    public Vector3d(double x, double y, double z)
    {
        super(x,y,z);
    }
    /**
     * Constructs and initializes a Vector3d from the specified Entity3d.
     * @param t1 the Entity3d containing the initialization x y z data
     */
    public Vector3d(Entity3d t1)
    {
        super(t1);
    }

    /**
     * Constructs and initializes a Vector3d to (0,0,0).
     */
    public Vector3d()
    {
        super();
    }

    /**
     * Sets this vector to the vector cross product of vectors v1 and v2.
     * @param v1 the first vector
     * @param v2 the second vector
     */
    public final void cross(Vector3d v1, Vector3d v2)
    {
        double x,y,z;

        x = v1.y*v2.z - v1.z*v2.y;
        y = v2.x*v1.z - v2.z*v1.x;
        z = v1.x*v2.y - v1.y*v2.x;
        this.z = z;
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the dot product of this vector and vector v1.
     * @param v1 the other vector
     * @return the dot product of this and v1
     */
    public final double dot(Vector3d v1)
    {
        return (this.x*v1.x + this.y*v1.y + this.z*v1.z);
    }

    /**
     * Returns the length (magnitude) of this vector. See https://mathinsight.org/definition/magnitude_vector
     * @return the length (magnitude) of this vector
     */
    public final double length()
    {
        return Math.sqrt(this.x*this.x + this.y*this.x + this.z*this.x);
    }

}