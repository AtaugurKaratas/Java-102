package location.battleLocation;

import obstacle.Bear;
import player.Player;

import java.util.Scanner;

public class River extends BattleLocation {
    Scanner scan = new Scanner(System.in);
    public River(Player player) {
        super(player, "River", new Bear());
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
                    this.setObstacle(new Bear());
                    random--;
                    if(random<=0) {
                        this.getPlayer().getInventory().setWater(true);
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
