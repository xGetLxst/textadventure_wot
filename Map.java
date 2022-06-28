public class Map {

    private MapPosition[] positionen;

    public Map() {

    }

    public MapPosition getMapPosition(int x, int y)  {
        for(MapPosition pos : positionen) {
            if (pos.getX() == x && pos.getY() == y) {
                return pos;
            } 
        }
        return null;
    }

}
