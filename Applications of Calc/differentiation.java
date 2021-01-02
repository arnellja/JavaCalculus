import java.util.*;

public class differentiation
{
    static Scanner reader = new Scanner(System.in);
        static Scanner stringReader = new Scanner(System.in);
        
    public static void main (String [] args)
    {
        
        int i;
        double x,y;
        p("Choose the type of desired differentiation.");
        p("1. au\n2. u+v\n3. u-v\n4. uv\n5. u/v\n6. a\n7. u^n\n8. x\n9. ln|u|\n10. e^u");
        p("\n\n");
        i = reader.nextInt();
        if(i == 1)
        {
            double a;
        
            double e;
            p("Enter the value of a.");
            a = reader.nextDouble();
        
            p("Enter the power of the entire u term.");
            e = reader.nextDouble();
            double b;
            double c;
            double d;
            p("Enter the coeffecient of your variable in u.");
            b = reader.nextDouble();
            p("Enter the power of your variable in u.");
            c = reader.nextInt();
            p("Enter the value of the second term in your u. Enter 0 if there is no second value.");
            d = reader.nextDouble();
            double a1= au(a,b,c,e);
            double b2 = powerRule(b,c);
            double c2 = getPower(c);
            double e2 = getPower(e);
            p(" ");
            
            p("You want the derivative of: " + a + "(" + b+ "x^"+c+"+"+d+")^"+e);
            p(" ");
            if(c2==0 && e2 == 0)
            p("The derivative is: " + a1);
            else if(c2==0)
            p("The derivative is: " + a1+ "(" + b + "x^" + c + "+" + d+")^"+e2);
            else if (e2 == 0)
            p("The derivative is: " + a1+ "(" + b2 + "x^" + c2 + ")");
            else
            p("The derivative is: " + a1+ "(" + b2 + "x^" + c2 + ") * (" + b + "x^" + c + "+" + d+")^"+e2);
        }
        else if(i == 2)
        {
           double a;
        
            double e;
            p("Enter the value of a.");
            a = reader.nextDouble();
        
            p("Enter the power of the entire u term.");
            e = reader.nextDouble();
            double b;
            double c;
            double d;
            p("Enter the coeffecient of your variable in u.");
            b = reader.nextDouble();
            p("Enter the power of your variable in u.");
            c = reader.nextInt();
            p("Enter the value of the second term in your u. Enter 0 if there is no second value.");
            d = reader.nextDouble(); 
            double a2;
        
            double e2;
            p("Enter the 2nd value of a.");
            a2 = reader.nextDouble();
        
            p("Enter the power of the entire v term.");
            e2 = reader.nextDouble();
            double b2;
            double c2;
            double d2;
            p("Enter the coeffecient of your variable in v.");
            b2 = reader.nextDouble();
            p("Enter the power of your variable in v.");
            c2 = reader.nextInt();
            p("Enter the value of the second term in your v. Enter 0 if there is no second value.");
            d2 = reader.nextDouble();
            double a3= au(a,b,c,e);
            double b3 = powerRule(b,c);
            double c3 = getPower(c);
            double e3 = getPower(e);
            double a4 = au(a2,b2,c2,e2);
            double b4 = powerRule(b2,c2);
            double c4 = getPower(c2);
            double e4 = getPower(e2);
            p(" ");
            
            p("You want the derivative of: " + a + "(" + b+ "x^"+c+"+"+d+")^"+e + " + " + a2 + "(" + b2+ "x^"+c2+"+"+d2+")^"+e2);
            p(" ");
            if(c3==0 && e3 == 0)
            p("The derivative is: " + a3 );
            else if(c3==0)
            p("The derivative is: " + a3+ "(" + b + "x^" + c + "+" + d+")^"+e2);
            else if (e3 == 0)
            p("The derivative is: " + a3+ "(" + b3 + "x^" + c3 + ")");
            else 
            p("The derivative is: " + a3+ "(" + b3 + "x^" + c3 + ") * (" + b + "x^" + c + "+" + d+")^"+e3);
            p("+");
            if(c4==0 && e4 == 0)
            p(" "+ a2);
            else if(c4==0)
            p( a2+ "(" + b2 + "x^" + c2 + "+" + d2+")^"+e4);
            else if (e4 == 0)
            p( a2+ "(" + b4 + "x^" + c4 + ")");
            else
            p( a4+ "(" + b4 + "x^" + c4 + ") * (" + b2 + "x^" + c2 + "+" + d2+")^"+e4);
            
        }
        else if(i == 3)
        {
           double a;
        
            double e;
            p("Enter the value of a.");
            a = reader.nextDouble();
        
            p("Enter the power of the entire u term.");
            e = reader.nextDouble();
            double b;
            double c;
            double d;
            p("Enter the coeffecient of your variable in u.");
            b = reader.nextDouble();
            p("Enter the power of your variable in u.");
            c = reader.nextInt();
            p("Enter the value of the second term in your u. Enter 0 if there is no second value.");
            d = reader.nextDouble(); 
            double a2;
        
            double e2;
            p("Enter the 2nd value of a.");
            a2 = reader.nextDouble();
        
            p("Enter the power of the entire v term.");
            e2 = reader.nextDouble();
            double b2;
            double c2;
            double d2;
            p("Enter the coeffecient of your variable in v.");
            b2 = reader.nextDouble();
            p("Enter the power of your variable in v.");
            c2 = reader.nextInt();
            p("Enter the value of the second term in your v. Enter 0 if there is no second value.");
            d2 = reader.nextDouble();
            double a3= au(a,b,c,e);
            double b3 = powerRule(b,c);
            double c3 = getPower(c);
            double e3 = getPower(e);
            double a4 = au(a2,b2,c2,e2);
            double b4 = powerRule(b2,c2);
            double c4 = getPower(c2);
            double e4 = getPower(e2);
            p(" ");
            
            p("You want the derivative of: " + a + "(" + b+ "x^"+c+"+"+d+")^"+e + " + " + a2 + "(" + b2+ "x^"+c2+"+"+d2+")^"+e2);
            p(" ");
            if(c3==0 && e3 == 0)
            p("The derivative is: " + a3 );
            else if(c3==0)
            p("The derivative is: " + a3+ "(" + b + "x^" + c + "+" + d+")^"+e2);
            else if (e3 == 0)
            p("The derivative is: " + a3+ "(" + b3 + "x^" + c3 + ")");
            else 
            p("The derivative is: " + a3+ "(" + b3 + "x^" + c3 + ") * (" + b + "x^" + c + "+" + d+")^"+e3);
            p("-");
            if(c4==0 && e4 == 0)
            p(" "+ a2);
            else if(c4==0)
            p( a2+ "(" + b2 + "x^" + c2 + "+" + d2+")^"+e4);
            else if (e4 == 0)
            p( a2+ "(" + b4 + "x^" + c4 + ")");
            else
            p( a4+ "(" + b4 + "x^" + c4 + ") * (" + b2 + "x^" + c2 + "+" + d2+")^"+e4); 
        }
        /*else if(i == 4)
        {
            uTimesv();
        }
        else if(i == 5)
        {
            uDividedv();
        }*/
        else if(i == 6)
        {
            double a;
            p("Enter your A term.");
            a= reader.nextDouble();
            p("");
            p("You want the derivative of " + a);
            p("0");
        }
        else if(i == 7)
        {
            double a;
        
            double e;
            p("Enter the value of a.");
            a = reader.nextDouble();
        
            p("Enter the power of the entire u term.");
            e = reader.nextDouble();
            double b;
            double c;
            double d;
            p("Enter the coeffecient of your variable in u.");
            b = reader.nextDouble();
            p("Enter the power of your variable in u.");
            c = reader.nextInt();
            p("Enter the value of the second term in your u. Enter 0 if there is no second value.");
            d = reader.nextDouble();
            double a1= au(a,b,c,e);
            double b2 = powerRule(b,c);
            double c2 = getPower(c);
            double e2 = getPower(e);
            p("You want the derivative of: " + a + "(" + b+ "x^"+c+"+"+d+")^"+e);
            p(" ");
            if(c2==0 && e2 == 0)
            p("The derivative is: " + a1);
            else if(c2==0)
            p("The derivative is: " + a1+ "(" + b + "x^" + c + "+" + d+")^"+e2);
            else if (e2 == 0)
            p("The derivative is: " + a1+ "(" + b2 + "x^" + c2 + ")");
            else
            p("The derivative is: " + a1+ "(" + b2 + "x^" + c2 + ") * (" + b + "x^" + c + "+" + d+")^"+e2);
        }
        else if(i == 8)
        {
            double a;
            p("Enter the coefficient of x.");
            a = reader.nextDouble();
            p("");
            p("You want the derivative of " + a + "x");
            p(a+ "");
        }
        else if(i == 9)
        {
            double a;
        
            double e;
            p("Enter the value of a.");
            a = reader.nextDouble();
        
            p("Enter the power of the entire u term.");
            e = reader.nextDouble();
            double b;
            double c;
            double d;
            p("Enter the coeffecient of your variable in u.");
            b = reader.nextDouble();
            p("Enter the power of your variable in u.");
            c = reader.nextInt();
            p("Enter the value of the second term in your u. Enter 0 if there is no second value.");
            d = reader.nextDouble();
            double a1= au(a,b,c,e);
            double b2 = powerRule(b,c);
            double c2 = getPower(c);
            double e2 = getPower(e);
            p(" ");
            p("You want the derivative of ln("+a+"("+b+"x^"+c+"+"+d+")^"+e+")");
            p("The derivative is: "+a+"("+b+"x^"+c+"+"+d+")^"+e+ " / " + a1+"("+b2+"x^"+c2 + "+"+d+")^"+e2);
        }
        else if(i == 10)
        {
            double a;
        
            double e;
            p("Enter the value of a.");
            a = reader.nextDouble();
        
            p("Enter the power of the entire u term.");
            e = reader.nextDouble();
            double b;
            double c;
            double d;
            p("Enter the coeffecient of your variable in u.");
            b = reader.nextDouble();
            p("Enter the power of your variable in u.");
            c = reader.nextInt();
            p("Enter the value of the second term in your u. Enter 0 if there is no second value.");
            d = reader.nextDouble();
            double a1= au(a,b,c,e);
            double b2 = powerRule(b,c);
            double c2 = getPower(c);
            double e2 = getPower(e);
            p(" ");
            p("You want the derivative of e^"+a+"("+b+"x^"+c+"+"+d+")^"+e);
            p("The derivative is: e^"+a+"("+b+"x^"+c+"+"+d+")^"+e+ " * " + a1+"("+b2+"x^"+c2 + "+"+d+")^"+e2);
        }
        else
        p("There is no such differentiation method in our database.");
    }
    
    public static double au(double a, double b, double c, double e)
    {
        
        
        
        if(c == 1 && e == 1)
        return a*b;
        else 
        
        
        return a*e;
        
        
        
    }
    public static double powerRule(double b, double c)
    {
       
        return b*c;
        
    }
    public static double getPower(double x)
    {
        
        return x-1;
    }
    
    /*public static double uPlusv()
    {}
    
    public static double uMinusv()
    {}
    
    public static double uTimesv()
    {}
    
    public static double uDividedv()
    {}
    
    public static double a()
    {}
    
    public static double uTon()
    {}
    
    public static double x()
    {
        return 1;
    }
    
    public static double ln()
    {}
    
    public static double eTou()
    {}*/
    
    
    
    public static void p (String s)
    {
        System.out.println(s);
    }
}
