import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.WindowConstants;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane; 
public class JScrollPaneDemo
{
    public JScrollPaneDemo()
    {
        JFrame jFrame=new JFrame("Swing application");
        jFrame.setSize(300,125);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel jPanel=new JPanel(new GridLayout(3,2,5,5));
        for(int i=1;i<=20;i++)
        {
            jPanel.add("button"+1,new JButton("Button"+1));
        }

        JScrollPane scrollPane= new JScrollPane(jPanel);
        jFrame.setContentPane(scrollPane);
        jFrame.setVisible(true);
    }
    public static void main(String[] args)
    {
        new JScrollPaneDemo();
    }
}
