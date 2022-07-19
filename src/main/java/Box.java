public class Box {

        private double height;
        private double breadth;
        private double length;
        private boolean isFull;
        private boolean isEmpty;

        public Box(double height, double breadth, double length){
            this.height = height;
            this.breadth = breadth;
            this.length = length;
        }

        public double calcVolume(){
            double volume = height*length*breadth;
            System.out.println(volume);
            return volume;
        }

    }

