package location;

import player.Player;

public abstract class Location {
    private Player player;
    private String name;
    private boolean onLocation;
    public Location(){}
    public Location(Player player){
        this.player = player;
    }
    public Location(Player player, String name){
        this.player = player;
        this.name = name;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOnLocation() {
        return onLocation;
    }

    public void setOnLocation(boolean onLocation) {
        this.onLocation = onLocation;
    }

    @Override
    public String toString() {
        return "Location{" +
                "player=" + player +
                ", name='" + name + '\'' +
                ", onLocation=" + onLocation +
                '}';
    }
}
