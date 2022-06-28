public class MapPosition {
    int x;
    int y;
    Person character;

    MapElement[] elements;


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setCharacter (Person character) {
        this.character = character;
    }

    public Person getCharacter () {
        return character;
    }
}