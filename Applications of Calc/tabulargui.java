
import java.util.*;
import javax.swing.*;
import java.awt.*;



import java.text.*;

public class tabulargui extends JFrame
{
    static Scanner reader = new Scanner(System.in);
    private JPanel contentPane;
    
    public static void main (String [] args) 
    {
        EventQueue.invokeLater(() -> new tabulargui());
    }
    
    public tabulargui()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(100,100,300,300);
        
        contentPane = new JPanel();
        setContentPane(contentPane);
        //JImageComponent ic = new JImageComponent("heart.jpg");
        JLabel jl2 = new JLabel(new ImageIcon("brad and jeff - awards 005.jpg"));
        JLabel jl1 =new JLabel(" ");
        JTextField jt1 = new JTextField("Coefficient of X",6);
        JTextField jt2 = new JTextField("Power of X",6);
        JTextField jt3 = new JTextField("-/+ sin/cos",6);
        JTextField jt4 = new JTextField("coefficient inside trig",6);
        
        JButton b1 = new JButton ("Calculate");
        GridLayout layout = new GridLayout(5,1);
        
        Container mW = getContentPane();
        mW.setLayout(layout);
        
        mW.add(jt1);
        mW.add(jt2);
        mW.add(jt3);
        mW.add(jt4);
        
        mW.add(b1);
        
        setVisible(true);
        
        b1.addActionListener((e) -> {
            
            
            
            
            String str = jt3.getText();
            
            
            
            
        
          
        
        });
        
        
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