package org.example.builderpattern;

import java.util.HashMap;
import java.util.Map;

public class ShoppingOrder {
    private String customerName;
    private Map<String, Integer> items;
    private String shippingAddress;

    public ShoppingOrder(String customerName, Map<String, Integer> items, String shippingAddress) {
        this.customerName = customerName;
        this.items = items;
        this.shippingAddress = shippingAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getItemQuantity(String item) {
        return items.getOrDefault(item, 0);
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public static class ShoppingOrderBuilder {
        private String customerName;
        private Map<String, Integer> items;
        private String shippingAddress;

        public ShoppingOrderBuilder setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public ShoppingOrderBuilder addItem(String item, int quantity) {
            if (items == null) {
                items = new HashMap<>();
            }
            items.put(item, quantity);
            return this;
        }

        public ShoppingOrderBuilder setShippingAddress(String shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        public ShoppingOrder build() {
            if (items == null) {
                items = new HashMap<>();
            }
            return new ShoppingOrder(customerName, items, shippingAddress);
        }
    }
}
