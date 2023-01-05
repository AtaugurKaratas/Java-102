package location.battleLocation;

import location.Location;
import obstacle.Obstacle;
import player.Player;

public abstract class BattleLocation extends Location {

    private Obstacle obstacle;

    private final int random = (int) (Math.random()*3+1);

    public int getRandom() {
        return random;
    }

    public BattleLocation(Player player, String name, Obstacle obstacle) {
        super(player, name);
        this.obstacle = obstacle;

    }
    @Override
    public boolean isOnLocation() {
        return super.isOnLocation();
    }
    @Override
    public void setOnLocation(boolean onLocation) {
        super.setOnLocation(onLocation);
    }
    abstract public void combat();
    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

}
