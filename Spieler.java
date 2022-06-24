public class Spieler implements MapElement {

    private int id;

    private String name;

    private int age;

    private int strength; 

    public Spieler(int id, String name, int age, int strength) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.strength = strength;
    }

    public String getName(){
        return name;
    }
    
    public String getDisplayName() {
        return this.name + ":" + this.strength;
    }
}
