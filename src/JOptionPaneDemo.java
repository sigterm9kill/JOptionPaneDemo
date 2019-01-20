/* Introduction of Class JOptionPane window interface
*Sean O'Brien
*1/10/2019
*/
import javax.swing.JOptionPane;

public class JOptionPaneDemo {
    public static void main(String[] args)
    {
        String appleString =
                JOptionPane.showInputDialog("Enter number of apples:");
        int appleCount = Integer.parseInt(appleString);
        
        String orangeString =
                JOptionPane.showInputDialog("Enter number of oranges:");
        int orangeCount = Integer.parseInt(orangeString);
        
        String awesomeString =
                JOptionPane.showInputDialog("Enter your number of awesomeness:");
        int awesomeCount = Integer.parseInt(awesomeString);   
        
        int totalFruitCount = (appleCount + orangeCount) * awesomeCount;
        JOptionPane.showMessageDialog(null,
                "The total number of fruits = " + totalFruitCount);
        System.exit(0);
    }
}
