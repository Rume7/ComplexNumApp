package laboratory1.view;

import laboratory1.taxcalculator.TaxCalculator;

/**
 *
 * @author Jerry
 */
public class TaxApplication {
    
    public static void main(String[] args) {
        
        FilingStatusView statusView = new FilingStatusView();
        int statusChosen = statusView.createFilingStatusView();
        
        TaxableIncomeView incomeView = new TaxableIncomeView();
        double income = incomeView.createTaxableIncomeView();      
        
        TaxCalculator taxCalculator = new TaxCalculator();
        double taxAccrued = taxCalculator.calculator(statusChosen, income);
        
        // Display the answer
        TaxResultView taxResultView = new TaxResultView();
        taxResultView.createTaxResultView(statusChosen, income, taxAccrued);
        
    }    
}
