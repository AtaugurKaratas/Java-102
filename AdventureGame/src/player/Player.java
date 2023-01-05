package player;

import gameCharacter.GameCharacter;

public class Player{
    private Inventory inventory = new Inventory();
    private int damage;
    private int healthy;
    private int money;
    private String name;

    public Player(String name) {
        this.name = name;
    }
    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void selectChar(GameCharacter gameCharacter){
        this.damage = gameCharacter.getDamage();
        this.money = gameCharacter.getMoney();
        this.healthy = gameCharacter.getHealth();
    }

    @Override
    public String toString() {
        return "Player{" +
                "inventory=" + inventory +
                ", damage=" + damage +
                ", healthy=" + healthy +
                ", money=" + money +
                ", name='" + name + '\'' +
                '}';
    }
}
