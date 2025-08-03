import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CartService {
    private final List<CartItem> cartItems = new ArrayList<>();

    public void addToCart(Product product, String size) {
        for (CartItem item : cartItems) {
            if (item.getProduct().getId() == product.getId() && item.getSize().equals(size)) {
                item.setQuantity(item.getQuantity() + 1);
                return;
            }
        }
        cartItems.add(new CartItem(product, size, 1));
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void clearCart() {
        cartItems.clear();
    }
}
