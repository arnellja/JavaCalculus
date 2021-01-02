import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.util.*;
public class DefInt extends JFrame
{
    static Scanner reader = new Scanner(System.in);
    static Scanner stringReader = new Scanner(System.in);
    private JPanel contentPane;
    public static void main (String [] args)
    {
       EventQueue.invokeLater(() -> new DefInt());
    }

    public DefInt()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setBounds(400,400,800,400);
        //applies to functions of cx^n
        contentPane = new JPanel();
        setContentPane(contentPane);
        JLabel jl1 = new JLabel("   Definite Integration ");
        JLabel jl2 = new JLabel("   Value for a ");
        JLabel jl3 = new JLabel("   Value for b ");
        JTextField jt2 = new JTextField(" ",6);
        JTextField jt3 = new JTextField(" ",6);
        JLabel jl4 = new JLabel( "  Coefficient of X" );
        JLabel jl5 = new JLabel("   Power of X ");
        JTextField jt4 = new JTextField(" ", 6);
        JTextField jt5 = new JTextField(" ", 6);
        Button b1 = new Button("    Integrate ");
        JLabel jl6 = new JLabel("   Caution: ");
        JLabel jl7 = new JLabel("   This only applies to integrals of type: c(x^n) ");
        GridLayout layout = new GridLayout(6,2);
        setLayout(layout);
        Container mainWin = getContentPane();
        mainWin.add(jl1);
        mainWin.add(b1);
        mainWin.add(jl2);
        mainWin.add(jt2);
        mainWin.add(jl3);
        mainWin.add(jt3);
        mainWin.add(jl4);
        mainWin.add(jt4);
        mainWin.add(jl5);
        mainWin.add(jt5);
        mainWin.add(jl6);
        mainWin.add(jl7);
        
        b1.addActionListener((e) -> {
            String str2 = jt2.getText();
            String str3 = jt3.getText();
            String str4 = jt4.getText();
            String str5 = jt5.getText();
            double a2 = Double.parseDouble(str2);
            double b3 = Double.parseDouble(str3);
            double x4 = Double.parseDouble(str4);
            double x5 = Double.parseDouble(str5);
            EventQueue.invokeLater(() -> new DefIntWork(a2,b3,x4,x5));
            
            
            
        });
        
        setVisible(true);
    }
    
    public static void p(String s)
    {
        System.out.println(s);
    }
}
