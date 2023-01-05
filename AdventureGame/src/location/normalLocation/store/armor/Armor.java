package location.normalLocation.store.armor;

public abstract class Armor {
    private int id;
    private int block;
    private int price;
    public Armor(){ }

    public Armor(int id, int block, int price) {
        this.id = id;
        this.block = block;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Armor{" +
                "id=" + id +
                ", name=" + getClass().getSimpleName() +
                ", block=" + block +
                ", price=" + price +
                '}';
    }
}
