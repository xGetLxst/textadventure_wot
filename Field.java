public class Field implements MapElement {


    private String displayName;

    public Field(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return this.displayName;
    }
    
    public String getSymbol() {
        return "x";
    }
}
