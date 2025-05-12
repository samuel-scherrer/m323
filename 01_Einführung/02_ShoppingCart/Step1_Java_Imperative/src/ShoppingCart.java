import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<String> items = new ArrayList<>();
    private boolean bookAdded = false;

    public void addItem(String item) {
        items.add(item);
        if (item.toLowerCase().contains("buch")) {
            bookAdded = true;
        }
    }

    public void removeItem(String item) {
        items.remove(item);
        if (items.stream().noneMatch(i -> i.toLowerCase().contains("buch"))) {
            bookAdded = false;
        }
    }

    public List<String> getItems() {
        return items;
    }

    public double getDiscountPercentage() {
        return bookAdded ? 5.0 : 0.0;
    }
}