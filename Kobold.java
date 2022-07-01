public class Kobold implements MapElement {
    
        private String name;
    
        public Kobold(String name) {
            this.name = name;
        }
    
        public String getName(){
            return name;
        }
        
        public String getDisplayName() {
            return this.name;
        }

        public String getSymbol() {
          return "☣";
        }
}
