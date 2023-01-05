package location.normalLocation;

import player.Player;

public class SafeHouse extends NormalLocation {
    public SafeHouse(Player player, int health){
        setPlayer(player);
        getPlayer().setHealthy(health);
        System.out.println(getPlayer());
    }
    @Override
    public boolean isOnLocation() {
        return true;
    }
}
