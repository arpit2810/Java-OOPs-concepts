public class Whiteboard {
        private int length;
        private int breadth;
        private double size;
        public Whiteboard(int length, int breadth){
            this.length = length;
            this.breadth=breadth;
        }
        public void area(int length,int breadth) {
            size=length*breadth;
        }
        public void write(){
            System.out.println("Writing begins ");
        }
        public void erase(){
            System.out.println("All written content erased");
        }

    }

