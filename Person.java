import javax.lang.model.type.NullType;

public class Person implements MapElement {

    private int id;

    private String name;

    private int age;

    private String gender; 

    private int x;

    private int y;

    public Person(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }
    
    public String getDisplayName() {
        return this.name;
    }
    
    public String getSymbol() {
        return "B";
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }



}
