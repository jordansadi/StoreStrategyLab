package solid.example;

/**
 * This interface defines a DiscountType and is inherited by most other classes in this package
 * Created by jsadi on 11/3/2018
 * @author Jordan Sadi
 * @version 2018 1103 1
 */
public interface DiscountType {
    double getBillAmount();
    void setBillAmount(double billAmount);
    char getType();
}
