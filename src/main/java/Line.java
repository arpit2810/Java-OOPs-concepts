public class Line {

        private int start_x;
        private int end_x;
        private int start_y;
        private int end_y;
        private double length;
        public Line(int start_x, int end_x,int start_y,int end_y){
            this.start_x = start_x;
            this.end_x = end_x;
            this.start_y = start_y;
            this.end_y = end_y;
        }

        public double lengthLine(int start_x, int end_x,int start_y,int end_y)
        {
            double x=Math.pow((end_x-start_x), 2);
            double y=Math.pow((end_y-start_y), 2);
            length = Math.sqrt(x+y);
            return length;
        }
    }

