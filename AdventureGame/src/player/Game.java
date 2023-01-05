package player;

import gameCharacter.GameCharacter;
import location.Location;
import location.battleLocation.BattleLocation;
import location.battleLocation.Cave;
import location.battleLocation.Forest;
import location.battleLocation.River;
import location.normalLocation.SafeHouse;
import location.normalLocation.store.ToolStore;
import obstacle.Zombie;

import java.util.Scanner;

public class Game {
    private Player player;
    private Location location;

    public Game(Player player, GameCharacter gameCharacter){
        this.player = player;
        this.player.setDamage(gameCharacter.getDamage());
        this.player.setHealthy(gameCharacter.getHealth());
        this.player.setMoney(gameCharacter.getMoney());
    }
    public void start(){
        Scanner scanner = new Scanner(System.in);
        int health = getPlayer().getHealthy();
        Inventory inventory = new Inventory();
        player.setInventory(inventory);
        BattleLocation location;
        ToolStore toolStore;
        SafeHouse safeHouse;
        while (true){
            System.out.println("Select Location\n" +
                    "1. Safe House\n" +
                    "2. Tool Store\n" +
                    "3. Cave\n" +
                    "4. Forest\n" +
                    "5. River\n");
            int temp = scanner.nextInt();
            switch (temp){
                case 1:
                    safeHouse = new SafeHouse(this.player, health);
                    safeHouse.getPlayer();
                    break;
                case 2:
                    toolStore = new ToolStore(this.player);
                    String s = "1. Menu \n" +
                            "2. Buy\n" +
                            "3. Exit";
                    System.out.println(s);
                    while(true) {
                        int i = scanner.nextInt();
                        if (i == 1) {
                            toolStore.menu();
                            System.out.println(s);
                        }
                        else if (i == 2) {
                            toolStore.buy();
                            System.out.println(s);
                        }
                        else if(i == 3) {
                            System.out.println("Exit");
                            break;
                        }
                    }
                    break;
                case 3:
                    location = new Cave(this.player);
                    location.combat();
                    break;
                case 4:
                    location = new Forest(this.player);
                    location.combat();
                    break;
                case 5:
                    location = new River(this.player);
                    location.combat();
                    break;
                default:
                    System.out.println("Incorrect value");
                    break;
            }
            if((getPlayer().getInventory().isFood() &&
                    getPlayer().getInventory().isFirewood() &&
                    getPlayer().getInventory().isWater())) {
                System.out.println("You Won");
                break;
            }
            else if (getPlayer().getHealthy()<=0) {
                System.out.println("You Dead");
                break;
            }
        }
    }
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Game{" +
                "player=" + player +
                ", location=" + location +
                '}';
    }
}
