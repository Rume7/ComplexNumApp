package laboratory1.status;

/**
 *
 * @author Jerry
 */
public class SingleIncomeTax implements PersonalIncomeTaxInterface {

    private double taxableIncome;
    private double amountLeft;
    private double tax = 0;

    public SingleIncomeTax(double taxableIncome) {
        this.taxableIncome = taxableIncome;
        this.amountLeft = taxableIncome;
    }

    @Override
    public double firstTenPercent() {
         if (this.amountLeft > 25000) {
            this.tax += (0.10 * 25000);
            this.amountLeft -= 25000;
        } else {
            this.tax += (0.10 * this.amountLeft);
            this.amountLeft = 0;
        }
        return tax;
    }

    @Override
    public double nextFifteenPercent() {
         if (this.amountLeft > 135000) {
            this.tax += (0.15 * 135000);
            this.amountLeft -= 135000;
        } else {
            this.tax += (0.15 * this.amountLeft);
            this.amountLeft = 0;
        }
        return tax;
    }

    @Override
    public double nextTwentyPercent() {
        if (this.amountLeft > 380000) {
            this.tax += (0.20 * 380000);
            this.amountLeft -= 380000;
        } else {
            this.tax += (0.20 * this.amountLeft);
            this.amountLeft = 0;
        }
        return tax;
    }

    @Override
    public double nextThirtyPercent() {
        if (this.amountLeft > 650000) {
            this.tax += (0.30 * 650000);
            this.amountLeft -= 650000;
        } else {
            this.tax += (0.30 * this.amountLeft);
            this.amountLeft = 0;
        }
        return tax;
    }

    @Override
    public double nextThirtyFourPercent() {
        if (this.amountLeft > 1200000) {
            this.tax += (0.34 * 1200000);
            this.amountLeft -= 1200000;
        } else {
            this.tax += (0.34 * this.amountLeft);
            this.amountLeft = 0;
        }
        return tax;
    }

    @Override
    public double nextThirtyEightPercent() {
         this.tax += (0.38 * this.amountLeft);
         return tax;
    }
    
    @Override
    public double computeTax() {
        firstTenPercent();
        nextFifteenPercent();
        nextTwentyPercent();
        nextThirtyPercent();
        nextThirtyFourPercent();
        nextThirtyEightPercent();
        return tax;
    }

    @Override
    public String toString() {
        return "SingleIncomeTax = ";
    }
}
