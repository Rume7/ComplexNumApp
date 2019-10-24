package laboratory1.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Jerry
 */
public class TaxableIncomeView {
    
    public double createTaxableIncomeView() {
        String title = "Taxable Income ";
        String incomeEntered = JOptionPane.
                showInputDialog(null, title, "Input", JOptionPane.QUESTION_MESSAGE);
    
        double taxableIncome = Double.parseDouble(incomeEntered);
        
        while (taxableIncome < 0) {
            incomeEntered
                    = JOptionPane.showInputDialog(null, title, "Input", JOptionPane.QUESTION_MESSAGE);
        }
        taxableIncome = Integer.parseInt(incomeEntered);
        
        return taxableIncome;
    }    
}
