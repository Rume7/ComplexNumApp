package laboratory1.status;

/**
 *
 * @author Jerry
 */
public interface PersonalIncomeTaxInterface {

    static int[] marginalTaxRate = {10, 15, 20, 30, 34, 38};

    public double firstTenPercent();

    public double nextFifteenPercent();

    public double nextTwentyPercent();

    public double nextThirtyPercent();

    public double nextThirtyFourPercent();

    public double nextThirtyEightPercent();
    
    public double computeTax();

}
