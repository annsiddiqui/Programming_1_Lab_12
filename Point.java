
/**
 * A class that holds a 2D point.
 *
 * @author Jason Heard
 */
public class Point
{
    private double x;
    private double y;
    
    public double getX()
    {
        return this.x;
    } 
    
     public double getY()
    {
        return this.y;
    } 
        
    public double setX()
    {
        this.x = x;
    }
    
    public double setY()
    {
        this.y = y;
    }
    
    public double distanceTo(double start){
        double distance = this.x - this.y;
        
        return distance;
    }
    
    public double distanceToOrigin(double distance){
        double distanceToOrigin = this.x - this.y;
        return distanceToOrigin;
    }
    
}
