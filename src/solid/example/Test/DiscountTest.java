package solid.example.Test;

import org.junit.*;
import solid.example.Customer;
import solid.example.Discount;

public class DiscountTest extends junit.framework.TestCase {
    public DiscountTest() {}

    private Customer testCustomer;

    @Before
    public void setUp() throws Exception {
        testCustomer = new Customer("Jordan", 100.0, new Discount());
        testCustomer.getDiscountType().setBillAmount(testCustomer.getBillAmount());
    }

    @After
    public void tearDown() throws Exception {}

    @Test
    public void testGetBillAmount() {
        assertEquals(50.0, testCustomer.getDiscountType().getBillAmount());
        assertNotSame(100.0, testCustomer.getDiscountType().getBillAmount());
    }

    @Test
    public void testGetType() {
        assertEquals('D', testCustomer.getDiscountType().getType());
        assertNotSame('S', testCustomer.getDiscountType().getType());
    }
}
