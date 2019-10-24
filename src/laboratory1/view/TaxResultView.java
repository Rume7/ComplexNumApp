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
            String info = "Your tax for filing status " + statuses[0] + " \nfor taxable "
                    + "Income of " + income + " is " + tax[0];
            String title = "Input";
            JOptionPane.showMessageDialog(null, info, title, JOptionPane.INFORMATION_MESSAGE);
        }

        // Case 2: Two statuses inputted 
        if (statuses[1] != 0) {
            String info = "Your tax for filing status \n" + statuses[0] + ", " + statuses[1] +  
                                "for taxable Income of \n" + income + " naira is " + tax[0] + ", " + tax[1];
            String title = "Input";
            JOptionPane.showMessageDialog(null, info, title, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
