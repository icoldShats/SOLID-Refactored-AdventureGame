import java.util.ArrayList;
import java.util.List;

public class ItemManager {
    private List<String> items;

    public ItemManager() {
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public boolean hasItems() {
        return !items.isEmpty();
    }

    public String getNextItem() {
        return hasItems() ? items.get(0) : null;
    }

    public void removeItem(String item) {
        items.remove(item);
    }
}