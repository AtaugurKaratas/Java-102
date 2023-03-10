package player;

public class Inventory {
    private boolean water = false;
    private boolean food = false;
    private boolean firewood = false;
    private String weaponName;
    private String armorName;
    private int weaponDamage;
    private int armorDefence;

    public Inventory(){}
    public Inventory(boolean water, boolean food, boolean firewood, String weaponName, String armorName, int weaponDamage, int armorDefence) {
        this.water = water;
        this.food = food;
        this.firewood = firewood;
        this.weaponName = weaponName;
        this.armorName = armorName;
        this.weaponDamage = weaponDamage;
        this.armorDefence = armorDefence;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public int getArmorDefence() {
        return armorDefence;
    }

    public void setArmorDefence(int armorDefence) {
        this.armorDefence = armorDefence;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "water=" + water +
                ", food=" + food +
                ", firewood=" + firewood +
                ", weaponName='" + weaponName + '\'' +
                ", armorName='" + armorName + '\'' +
                ", weaponDamage=" + weaponDamage +
                ", armorDefence=" + armorDefence +
                '}';
    }
}
