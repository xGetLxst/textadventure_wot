public class Person implements MapElement {

    private String name;

    private int x;

    private int y;

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    
    public String getDisplayName() {
        return this.name;
    }
    
    public String getSymbol() {
        return "⍨";
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
