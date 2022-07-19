public class Pencil {
    private String Colour;
    private String type;

    public Pencil( String Colour, String type){
        this.Colour = Colour;
        this.type = type;
    }

    public void write(){
        System.out.println("Pencil is being currently set to use.");
    }

    public void sharpen(){
        System.out.println("Pencil is undergoing sharpening process.");
    }
}