public class UpdateRectangle {
    private int length;
    private int breadth;
    public UpdateRectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public void updateDimensions(int new_length,int new_breadth)
    {
        this.length=new_length;
        this.breadth=new_breadth;
    }
}
