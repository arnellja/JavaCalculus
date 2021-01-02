import java.util.*;

public class tabular
{
    public static void main (String [] args)
    {
        Scanner stringReader = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        p("Enter the coefficient of the U");
        double x = reader.nextInt();
        p("Enter the power of the U");
        double y = reader.nextInt();
        int v=-1;
        
        p("Enter the Trig value for your dV");
        String t = stringReader.nextLine();
        p("Enter the coefficient inside the trig");
        int q = reader.nextInt();
        
        
        
        p(x + "x^"+y + " * " + chainR(q) + " * " + TrigSC(t,q));//+ " - " + " ∫ ( " + chainR(q) + " * " + TrigSC(t,q) + " * " + powerRule(x,y)+ " ) dx ");
        t = TrigSw(t);
        t = TrigSw(t);
        
        for(int e = 2; e<y+4; e++)
        {
            
            x*=y;
            y-=1;
            
            if(v==1)
            p((x) + "x^" + (y) + " * " + "1/" + Math.pow(q,e) + "("+t + q + "x)");
            else 
            p("-" +(x) + "x^" + (y) + " * " + "1/" + Math.pow(q,e) + "("+t + q + "x)");
            t = TrigSw(t);
            v*=-1;
        }
        
        
        
    }
    
    
    
    public static String powerRule ( double x, double y )
    {
        x*=y;
        y-=1;
        
        if(y==-1)
        {
            x=0;
            
        }
        return x + "x^" + y;
        
    }
    
     public static String TrigSw (String s)
    {
        if(s.equals("sin")||s.contains("Sin"))
        s = "-cos";
        else if (s.equals("cos")||s.contains("Cos"))
        s = "sin";
        else if (s.equals("-sin")||s.contains("-Sin"))
        s = "cos";
        else if (s.equals("-cos")||s.contains("-Cos"))
        s = "-sin";
        
        return s;
    }
    
    public static String TrigSC (String s, double y)
    {
        if(s.equals("sin")||s.contains("Sin"))
        s = "-cos";
        else if (s.equals("cos")||s.contains("Cos"))
        s = "sin";
        else if (s.equals("-sin")||s.contains("-Sin"))
        s = "cos";
        else if (s.equals("-cos")||s.contains("-Cos"))
        s = "-sin";
        
        return s + "(" + y + "x)";
    }
    
    public static String chainR (double y)
    {
        
        
        return   "1/("  + y + ")";
    }
    
    public static void p (String s)
    {
        System.out.println(s);
    }
}
