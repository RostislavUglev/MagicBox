import java.util.Random;

public class MagicBox<T> {
    protected int maxItems;
    protected T item;
    protected T[] items;
    private T randomItem;

    public MagicBox(T item, int maxItems) {
        this.item = item;
        this.maxItems = maxItems;
        T[] items = (T[]) new Object[maxItems];
        this.items = items;
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        if (items[maxItems - 1] == null) {
            throw new RuntimeException("Коробка не полна");
        }
        Random random = new Random();
        int randomInt = random.nextInt(maxItems);
        T randomItem = items[randomInt];
        return randomItem;
    }
}
