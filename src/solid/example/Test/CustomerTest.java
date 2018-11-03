package solid.example.Test;

import org.junit.*;
import solid.example.Customer;
import solid.example.Liquidation;
import solid.example.Sale;

public class CustomerTest extends junit.framework.TestCase {
    public CustomerTest() {}

    private Customer testCustomer;

    @Before
    public void setUp() throws Exception {
        testCustomer = new Customer("Jordan", 100.0, new Sale());
        testCustomer.getDiscountType().setBillAmount(testCustomer.getBillAmount());
    }

    @After
    public void tearDown() throws Exception {}

    @Test
    public void testGetCustomerName() {
        assertEquals("Jordan", testCustomer.getCustomerName());
        assertNotSame("Not Jordan", testCustomer.getCustomerName());
    }

    @Test
    public void testGetDiscountType() {
        assertTrue(testCustomer.getDiscountType() instanceof Sale);
        assertFalse(testCustomer.getDiscountType() instanceof Liquidation);
    }

    @Test
    public void testGetBillAmount() {
        assertEquals(100.0, testCustomer.getBillAmount());
        assertNotSame(90.0, testCustomer.getBillAmount());
    }

    @Test
    public void testToString() {
        assertEquals("Customer{" +
                "customerName='" + testCustomer.getCustomerName() + '\'' +
                ", billAmount=" + testCustomer.getBillAmount() +
                ", discountType=" + testCustomer.getDiscountType().getType() +
                '}', testCustomer.toString());
        assertNotSame("Not toString", testCustomer.toString());
    }
}
