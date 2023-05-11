import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.builderpattern.ShoppingOrder;

public class BuilderTest {
    @Test
    public void testBuildShoppingOrder() {
        ShoppingOrder.ShoppingOrderBuilder builder = new ShoppingOrder.ShoppingOrderBuilder();
        ShoppingOrder order = builder.setCustomerName("Reza Abdz")
                .addItem("Shirt", 2)
                .addItem("Pants", 1)
                .setShippingAddress("Azadi Ave., Tehran")
                .build();

        Assertions.assertEquals("Reza Abdz", order.getCustomerName());
        Assertions.assertEquals(2, order.getItemQuantity("Shirt"));
        Assertions.assertEquals(1, order.getItemQuantity("Pants"));
        Assertions.assertEquals(0, order.getItemQuantity("Books"));
        Assertions.assertEquals("Azadi Ave., Tehran", order.getShippingAddress());
    }

}
