package laboratory1.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Jerry
 */
public class TaxResultView {

    public void createTaxResultView(int[] statuses, double income, double[] tax) {
        
        
        // Case 1: Only one status inputted
        if (statuses[1] == 0) {
            String info = "\nYour tax for filing status " + statuses[0] + " \nfor taxable "
                    + "Income of " + income + " Naira  is \n" + tax[0] + " Naira.\n";
            String title = "Input";
            JOptionPane.showMessageDialog(null, info, title, JOptionPane.INFORMATION_MESSAGE);
        }

        // Case 2: Two statuses inputted 
        if (statuses[1] != 0) {
            String info = "\nYour tax for filing status \n" + statuses[0] + ", " + statuses[1] + "\n" + 
                                "for taxable Income of \n" + income + " Naira is \n" + tax[0] + ", " + tax[1] + ".\n";
            String title = "Input";
            JOptionPane.showMessageDialog(null, info, title, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
