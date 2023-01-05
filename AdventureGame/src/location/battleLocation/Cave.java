package location.battleLocation;

import obstacle.Zombie;
import player.Player;

import java.util.Scanner;

public class Cave extends BattleLocation {
    Scanner scan = new Scanner(System.in);
    public Cave(Player player) {
        super(player, "Cave", new Zombie());
    }

    @Override
    public boolean isOnLocation() {
        return super.isOnLocation();
    }

    @Override
    public void combat() {
        int random = getRandom();
        int totalDamage = getPlayer().getDamage() + getPlayer().getInventory().getWeaponDamage();
        int defense = getPlayer().getInventory().getArmorDefence();
        int monsterDamage = this.getObstacle().getDamage();
        while (random > 0) {
            System.out.println(getPlayer());
            System.out.println(this.getObstacle());
            System.out.println("Hit [1] - Run [2]");
            int temp = scan.nextInt();
            if (temp == 1) {
                this.getObstacle().setHealth(this.getObstacle().getHealth() - totalDamage);
                if (this.getObstacle().getHealth() > 0) {
                    getPlayer().setHealthy(getPlayer().getHealthy() - (defense >= monsterDamage ? (defense - monsterDamage) : monsterDamage-defense));
                    if (getPlayer().getHealthy() <= 0) {
                        break;
                    }
                } else {
                    getPlayer().setMoney(getPlayer().getMoney() + this.getObstacle().getMoney());
                }
                if(getObstacle().getHealth()<=0){
                    this.setObstacle(new Zombie());
                    random--;
                    if(random<=0) {
                        this.getPlayer().getInventory().setFood(true);
                        System.out.println(getPlayer());
                        return;
                    }
                }
            } else if (temp == 2) {
                break;
            }
        }
    }

}
