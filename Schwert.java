public class Schwert implements MapElement {

    private int id;

    private String name;

    private int x;

    private int y;

    public Schwert(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getDisplayName() {
        return this.name;
    }

    public String getSymbol() {
        return "†";
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}

