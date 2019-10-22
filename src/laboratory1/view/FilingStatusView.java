package laboratory1.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Jerry
 */
public class FilingStatusView {

    /***
     *  Display the various filing status for the user to chose.
     *  Status chosen should be a number between 1 and 4. 0 & 5 are anomalies 
     * @return the statusChosen
     */
    public int createTaxableIncomeView() {
        String title = "Enter Filing Status:\n0. Query\n1. Single\n2. Married (Joint)\n"
                + "3. Married (Singly)\n4. Head of Household\n5. Listing";

        String statusChosen
                = JOptionPane.showInputDialog(null, title, "Input", JOptionPane.QUESTION_MESSAGE);

        return Integer.parseInt(statusChosen);
    }

}
