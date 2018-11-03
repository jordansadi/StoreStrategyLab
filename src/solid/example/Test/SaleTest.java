package solid.example.Test;

import org.junit.*;
import solid.example.Customer;
import solid.example.Sale;

public class SaleTest extends junit.framework.TestCase {
    public SaleTest() {}

    private Customer testCustomer;

    @Before
    public void setUp() throws Exception {
        testCustomer = new Customer("Jordan", 100.0, new Sale());
        testCustomer.getDiscountType().setBillAmount(testCustomer.getBillAmount());
    }

    @After
    public void tearDown() throws Exception {}

    @Test
    public void testGetBillAmount() {
        assertEquals(90.0, testCustomer.getDiscountType().getBillAmount());
        assertNotSame(100.0, testCustomer.getDiscountType().getBillAmount());
    }

    @Test
    public void testGetType() {
        assertEquals('S', testCustomer.getDiscountType().getType());
        assertNotSame('D', testCustomer.getDiscountType().getType());
    }
}
