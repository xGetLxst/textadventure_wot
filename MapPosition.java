public class MapPosition {

    private Spieler spieler;
    private MapElement element;

    public MapPosition(Spieler spieler) {
        this.spieler = spieler;
    }

    public MapPosition(MapElement element) {
        this.element = element;
    }

    public MapPosition(Spieler spieler, MapElement element) {
        this.spieler = spieler;
        this.element = element;
    }

    public Spieler getSpieler() {
        return spieler;
    }

    public void setSpieler(Spieler spieler) {
        this.spieler = spieler;
    }

    public MapElement getElement() {
        return element;
    }

    public void setElement(MapElement element) {
        this.element = element;
    }

    
    
}