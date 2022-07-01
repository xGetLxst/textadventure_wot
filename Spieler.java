public class Spieler implements MapElement {

    private String name;

    private int x;

    private int y;

    private MapElement waffe1;

    public Spieler(String name) {
        this.name = name;
        this.x = 0;
        this.y = 0;
    }

    public void MoveUp() {
        this.y++;
    }

    public void MoveDown() {
        this.y--;
    }

    public void MoveRight() {
        this.x++;
    }

    public void MoveLeft() {
        this.x--;
    }


    public String getName() {
        return name;
    }

    public String getDisplayName() {
        return this.name;
    }

    public String getSymbol() {
        return "⍢";
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public MapElement getWaffe1() {
        return this.waffe1;
    }

    public void setWaffe1(MapElement schwert) {
        this.waffe1 = schwert;
    }
}
