public class Item {

    String id;
    String name;
    int quantity;

    public Item(String id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Item) obj).getId().equals(this.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}