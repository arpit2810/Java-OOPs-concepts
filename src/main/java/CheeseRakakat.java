public class CheeseRakakat {
    public CheeseRakakat(){
        System.out.println("Lets Start mmaking Rolls");
    }
    public CheeseRakakat mixing(double mozzarella, double leaves,double seeds){
        System.out.println("Add shredded Mozzarella" + mozzarella +"Toasted sesame seeds" +seeds +"corriander leaves" +leaves+"and mix them");
        return this;
    }
    public CheeseRakakat rollingAndFolding(){
        System.out.println("Spread the filling on a sheet roll it over to form a log and seal the edges");
        return this;
    }
    public CheeseRakakat cooking(float oil){
        System.out.println("Deep fry the prepared cheese rolls until golden"+oil);
        return this;
    }
    public CheeseRakakat serving(String dip){
        System.out.println("Enjoy your Cheese rolls with "+dip+"!");
        return this;
    }

    public static void main(String[] args) {
        CheeseRakakat rolls = new CheeseRakakat();
        rolls
                .mixing(300,10,200);
                .rollingAndFolding()
                .cooking()
                .serving("Ketchup");
    }
}
