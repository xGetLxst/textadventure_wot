public class Person implements MapElement {

    private int id;

    private String name;

    private int age;

    private String gender; 

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
        return this.name + ":" + this.gender;
    }
    
        public String getSymbol() {
          return "B";
        }
}
