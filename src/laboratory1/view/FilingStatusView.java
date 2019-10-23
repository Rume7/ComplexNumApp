package laboratory1.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Jerry
 */
public class FilingStatusView {

    private final String title = "Enter Filing Status:\n0. Query\n1. Single\n2. Married (Joint)\n"
            + "3. Married (Singly)\n4. Head of Household\n5. Listing";

    /**
     * *
     * Display the various filing status for the user to chose. Status chosen
     * should be a number between 1 and 4. 0 & 5 are anomalies
     *
     * @return the statusChosen
     */
    public int createFilingStatusView() {
        String statusChosen
                = JOptionPane.showInputDialog(null, title, "Input", JOptionPane.QUESTION_MESSAGE);

        boolean state = verifyStatusChosen(statusChosen);

        // Create two scenarios. 1. if the state is true and the status is one
        // 2. if state is true and statuses are two.
        while (state) {
            statusChosen
                    = JOptionPane.showInputDialog(null, title, "Input", JOptionPane.QUESTION_MESSAGE);
        }
        if (state && statusChosen.length() == 1) {
            return Integer.parseInt(statusChosen) ;
        } else {
            // Process two different status.
        }
        int status = Integer.parseInt(statusChosen);
        return status;
    }

    private boolean verifyStatusChosen(String statusChosen) {
        if (statusChosen.length() == 1) {
            return isANumber(statusChosen);
        } else if (statusChosen.trim().length() > 2) {
            String firstStatus = statusChosen.charAt(0) +"";
            String secondStatus = statusChosen.charAt(statusChosen.length()-1) + "";
            
            return (isANumber(firstStatus) && isANumber(secondStatus));
        }
        return false;
    }
    
    private boolean isANumber(String str) {
        int value = Integer.parseInt(str);
        for (int i = 0; i <= 5; i++) {
            if (value == i) {
                return true;
            }
        }
        return false;
        
    }
}
