package location.normalLocation.store;

import location.normalLocation.NormalLocation;
import location.normalLocation.store.armor.Armor;
import location.normalLocation.store.armor.Heavy;
import location.normalLocation.store.armor.Light;
import location.normalLocation.store.armor.Medium;
import location.normalLocation.store.weapon.Pistol;
import location.normalLocation.store.weapon.Rifle;
import location.normalLocation.store.weapon.Sword;
import location.normalLocation.store.weapon.Weapon;

import java.util.Scanner;

import player.Player;

public class ToolStore extends NormalLocation {

    Scanner scan = new Scanner(System.in);

    public ToolStore(Player player) {
        setPlayer(player);
    }

    @Override
    public void setOnLocation(boolean onLocation) {
        super.setOnLocation(onLocation);
    }

    public void menu() {
        String items = "";
        Weapon weapon = new Pistol();
        items += "WEAPON \n";
        items += weapon + "\n";
        weapon = new Sword();
        items += weapon + "\n";
        weapon = new Rifle();
        items += weapon + "\n";
        Armor armor = new Light();
        items += "ARMOR \n";
        items += armor + "\n";
        armor = new Medium();
        items += armor + "\n";
        armor = new Heavy();
        items += armor + "\n";
        System.out.println(items);
    }

    public void buy() {
        Weapon weapon;
        Armor armor;
        System.out.println("Money : " + getPlayer().getMoney());
        System.out.println("Weapon : [1] - Armor : [2]");
        int temp = scan.nextInt();
        if (temp == 1) {
            System.out.println("Weapon Id ?");
            temp = scan.nextInt();
            weapon = new Pistol();
            selectWeapon(weapon, temp);
            weapon = new Sword();
            selectWeapon(weapon, temp);
            weapon = new Rifle();
            selectWeapon(weapon, temp);
        } else if (temp == 2) {
            System.out.println("Armor Id ?");
            temp = scan.nextInt();
            armor = new Light();
            selectArmor(armor, temp);
            armor = new Medium();
            selectArmor(armor, temp);
            armor = new Heavy();
            selectArmor(armor, temp);
        }
    }

    private void selectWeapon(Weapon weapon, int temp) {
        if (temp == weapon.getId()) {
            if (weapon.getPrice() <= getPlayer().getMoney()) {
                getPlayer().getInventory().setWeaponDamage(weapon.getDamage());
                getPlayer().getInventory().setWeaponName(weapon.getClass().getSimpleName());
                getPlayer().setMoney(getPlayer().getMoney() - weapon.getPrice());
            } else {
                System.out.println("You don't have enough money");
            }
        }
    }

    private void selectArmor(Armor armor, int temp) {
        if (temp == armor.getId()) {
            if (armor.getPrice() <= getPlayer().getMoney()) {
                getPlayer().getInventory().setArmorDefence(armor.getBlock());
                getPlayer().getInventory().setArmorName(armor.getClass().getSimpleName());
                getPlayer().setMoney(getPlayer().getMoney() - armor.getPrice());
            } else {
                System.out.println("You don't have enough money");
            }
        }
    }
}
