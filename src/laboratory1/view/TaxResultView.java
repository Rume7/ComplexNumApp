package laboratory1.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Jerry
 */
public class TaxResultView {
    
    public void createTaxResultView(int status, double income, double tax) {
        
        String info = "Your tax for filing status " + status + " for taxable " + 
                "Income of " + income + " is " + tax;
        String title = "Input";
        JOptionPane.showMessageDialog(null, info, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
