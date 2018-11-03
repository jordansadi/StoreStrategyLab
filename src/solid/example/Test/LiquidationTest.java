package solid.example.Test;

import org.junit.*;
import solid.example.Customer;
import solid.example.Liquidation;

public class LiquidationTest extends junit.framework.TestCase {
    public LiquidationTest() {}

    private Customer testCustomer;

    @Before
    public void setUp() throws Exception {
        testCustomer = new Customer("Jordan", 100.0, new Liquidation());
        testCustomer.getDiscountType().setBillAmount(testCustomer.getBillAmount());
    }

    @After
    public void tearDown() throws Exception {}

    @Test
    public void testGetBillAmount() {
        assertEquals(25.0, testCustomer.getDiscountType().getBillAmount());
        assertNotSame(100.0, testCustomer.getDiscountType().getBillAmount());
    }

    @Test
    public void testGetType() {
        assertEquals('L', testCustomer.getDiscountType().getType());
        assertNotSame('D', testCustomer.getDiscountType().getType());
    }
}
