package location.normalLocation.store.weapon;

public class Weapon {
    private int id;
    private int damage;
    private int price;

    public Weapon(){ }

    public Weapon(int id, int damage, int price) {
        this.id = id;
        this.damage = damage;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "id=" + id +
                ", name=" + getClass().getSimpleName() +
                ", damage=" + damage +
                ", price=" + price +
                '}';
    }
}
