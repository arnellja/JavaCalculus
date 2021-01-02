
import java.util.*;
public class ImaginaryPairMultiplication
{
    public static Scanner reader = new Scanner(System.in);
    public static void main (String [] args)
    {
        int x,y,z,w;
        System.out.println("Enter 1st X Coordinate");
        w = reader.nextInt();
        System.out.println("Enter 1st Y Coordinate");
        x = reader.nextInt();
        System.out.println("Enter 2nd X Coordinate");
        y = reader.nextInt();
        System.out.println("Enter 2nd Y Coordinate");
        z = reader.nextInt();
        
        System.out.println("You wanted to print product of ("+w+","+x+") and ("+y+","+z+")");
        int u = w*y;
        int i = x*z;
        int o = w*x;
        int p = y*z;
        
        System.out.println("(" + (p+o) + "," + (u-i) + ")");
    }
}
