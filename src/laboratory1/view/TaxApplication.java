package laboratory1.view;

import laboratory1.taxcalculator.TaxCalculator;

/**
 *
 * @author Jerry
 */
public class TaxApplication {
    
    public static void main(String[] args) {
        
        FilingStatusView statusView = new FilingStatusView();
        int[] statusesChosen = statusView.createFilingStatusView();
        int status1 = statusesChosen[0];
        int status2 = statusesChosen[1];
        
        TaxableIncomeView incomeView = new TaxableIncomeView();
        double income = incomeView.createTaxableIncomeView();      
        
        TaxCalculator taxCalculator = new TaxCalculator();
        double taxAccrued1 = taxCalculator.calculator(status1, income);
        double taxAccrued2 = taxCalculator.calculator(status2, income);
        double[] allTaxes = {taxAccrued1, taxAccrued2};
        
        // Display the answer
        TaxResultView taxResultView = new TaxResultView();
        taxResultView.createTaxResultView(statusesChosen, income, allTaxes);
    }    
}
