
package car.race;

import java.lang.Math;
public class CarRace {

   
    public static void main(String[] args) {
        // Car A has displacement xa, Car B has displacement xb
        // Car A has velocity va,  Car B has velocity vb. time is t.
        // xa is an oscillating function that is bounded by 1 and xb is an asymptotic function with
        // asymptote at 1, so they have infinite intersections. I happen to pick t as 200 here but you can pick any value.
        
        double t=200;
        double x=0;
        double xa=0;
        double xb=0;
        double v=0;
        double va=0;
        double vb=0;
       
        
        xa = 1-Math.exp(-t);
        xb= Math.sin(t);
        
        x=xa-xb;
        
        va = Math.exp(-t);
        vb = Math.cos(t);
        
        v=va-vb;
        
        
         System.out.println(x +" m is how far A and B are apart ");
         
         if (x>0)
         {
          System.out.println("A is ahead of B");   
         
         }
         
         if (x == 0)
         {
          System.out.println("Level");   
         }
         
         
         if (x<0)
         {
          System.out.println("B is ahead of A");   
         }
         
         
         System.out.println(v + " m/s is the difference in velocities of A and B");
         
         if (v>0)
         {
          System.out.println("A is moving quicker than B");   
         
         }
         
         if (v == 0)
         {
          System.out.println("A and B are the same speed");   
         }
         
         
         if (v<0)
         {
          System.out.println("B is moving quicker than A");   
         }
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
    }
    
    
}
