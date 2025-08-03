

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items = new ArrayList<>();

    public void addToCart(Product product, int quantity) {
        for (CartItem item : items) {
            if (item.getProduct().getId() == product.getId() &&
                item.getProduct().getSize().equals(product.getSize())) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        items.add(new CartItem(product, quantity));
    }

    public void removeFromCart(int productId, String size) {
        items.removeIf(item -> item.getProduct().getId() == productId &&
                               item.getProduct().getSize().equals(size));
    }

    public List<CartItem> getItems() {
        return items;
    }

    public double getTotal() {
        return items.stream().mapToDouble(CartItem::getTotalPrice).sum();
    }

    public void clearCart() {
        items.clear();
    }
}
