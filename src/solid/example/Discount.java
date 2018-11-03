package solid.example;

/**
 * This class defines a Discount, which implements the DiscountType interface
 * Created by jsadi on 11/3/2018
 * @author Jordan Sadi
 * @version 2018 1103 1
 */
public class Discount implements DiscountType {
    private double billAmount;

    /**
     * This method calculates the total billAmount, factoring in the discount amount
     * @return double the billAmount
     */
    @Override
    public double getBillAmount() {
        billAmount -= (billAmount * 0.5);
        return billAmount;
    }

    /**
     * This method sets the billAmount to a specified value
     * @param billAmount double the intended new billAmount
     */
    @Override
    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    /**
     * This method returns a char indicating which discount type it is
     * @return char the type of discount
     */
    @Override
    public char getType() {
        return 'D';
    }
}
