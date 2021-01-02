import javax.swing.*;
import java.awt.*;

public class DefIntWork extends JFrame
{
    private JPanel contentPane2;
    
    public DefIntWork( double a2, double b3, double x4, double x5)
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setBounds(400,400,400,200);
        //applies to functions of cx^n
        contentPane2 = new JPanel();
        setContentPane(contentPane2);
        Container mw = getContentPane();
        String str6 = "[" + a2 + ","+b3+"]" + "\t∫"+x4+"x^"+x5;
        double x2 = x4/(x5+1);
        x5+=1;
        String str7 = x2+"x^"+x5 + "+ C";
        String str8 = "(" + x2 + "*(" + b3+"^"+x5+")) " + "- (" + x2 + "*(" + a2+"^"+x5+"))";
        double ans = x2*Math.pow(b3,x5) - x2*Math.pow(a2,x5);
        
        JLabel jl1 = new JLabel("   Integral: "+ str6);
        JLabel jl2 = new JLabel("   Indefinite Integration: " + str7);
        JLabel jl3 = new JLabel("   Show Work: "+ str8);
        JLabel jl4 = new JLabel("   Answer: "+ ans);
        GridLayout layout = new GridLayout(4,1);
        setLayout(layout);
        mw.add(jl1);
        mw.add(jl2);
        mw.add(jl3);
        mw.add(jl4);
        
        setVisible(true);
        
    }
}
