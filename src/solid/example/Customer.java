package solid.example;

/**
 * This class defines a Customer
 * Created by jsadi on 11/3/2018
 * @author Jordan Sadi
 * @version 2018 1103 1
 */
public class Customer {
    private String customerName;
    private double billAmount;
    private DiscountType dt;

    /**
     * This constructor defines a Customer
     * Each Customer must have a customerName, billAmount, and DiscountType
     * @param customerName String the name of the Customer
     * @param billAmount double the amount of the Customer's bill
     * @param dt DiscountType the type of discount the Customer will receive
     */
    public Customer(String customerName, double billAmount, DiscountType dt) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.dt = dt;
    }

    /**
     * This method returns the customerName for a Customer
     * @return String the customerName of a Customer
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * This method sets the customerName of a Customer to a specified value
     * @param customerName String the intended new customerName
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * This method returns the DiscountType offered to a Customer
     * @return DiscountType the type of discount offered to a Customer
     */
    public DiscountType getDiscountType() {
        return dt;
    }

    /**
     * This method sets the DiscountType offered to a customer to a specified value
     * @param dt DiscountType the intended new DiscountType
     */
    public void setDiscountType(DiscountType dt) {
        this.dt = dt;
    }

    /**
     * This method returns the billAmount for a Customer
     * @return double the billAmount of a Customer
     */
    public double getBillAmount() {
        return billAmount;
    }

    /**
     * This method sets the billAmount for a Customer to a specified value
     * @param billAmount double the intended new billAmount
     */
    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    /**
     * This method overrides toString to format a Customer's information in a specific way
     * @return
     */
    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", billAmount=" + billAmount +
                ", discountType=" + dt.getType() +
                '}';
    }
}
