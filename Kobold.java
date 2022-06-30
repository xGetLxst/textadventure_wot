public class Kobold implements MapElement {

        private int id;
    
        private String name;
    
        private int age;
    
        private int strength; 
    
        public Kobold(int id, String name, int age, int strength) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.strength = strength;
        }
    
        public String getName(){
            return name;
        }
        
        public String getDisplayName() {
            return this.name;
        }

        public String getSymbol() {
          return "ǘ";
        }
}
