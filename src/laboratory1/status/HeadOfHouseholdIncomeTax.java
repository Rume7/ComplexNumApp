package laboratory1.status;

/**
 *
 * @author Jerry
 */
public class HeadOfHouseholdIncomeTax implements PersonalIncomeTaxInterface {

    private double taxableIncome;
    private double amountLeft;
    private double tax = 0;

    public HeadOfHouseholdIncomeTax(double taxableIncome) {
        this.taxableIncome = taxableIncome;
        this.amountLeft = taxableIncome;
    }

    @Override
    public double firstTenPercent() {
        if (this.amountLeft > 35000) {
            this.tax += (0.10 * 35000);
            this.amountLeft -= 35000;
        } else {
            this.tax += (0.10 * this.amountLeft);
            this.amountLeft = 0;
        }
        return tax;
    }

    @Override
    public double nextFifteenPercent() {
        if (this.amountLeft > 165000) {
            this.tax += (0.15 * 165000);
            this.amountLeft -= 165000;
        } else {
            this.tax += (0.15 * this.amountLeft);
            this.amountLeft = 0;
        }
        return tax;
    }

    @Override
    public double nextTwentyPercent() {
        if (this.amountLeft > 420000) {
            this.tax += (0.20 * 420000);
            this.amountLeft -= 420000;
        } else {
            this.tax += (0.20 * this.amountLeft);
            this.amountLeft = 0;
        }
        return tax;
    }

    @Override
    public double nextThirtyPercent() {
        if (this.amountLeft > 700000) {
            this.tax += (0.30 * 700000);
            this.amountLeft -= 700000;
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
        return "HeadOfHouseholdIncomeTax{" + "tax = " + tax;
    }
}
