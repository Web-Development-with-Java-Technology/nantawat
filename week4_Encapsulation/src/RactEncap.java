public class RactEncap {
    private double width;
    private double height;
    String name;

    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public double computeArea(){
        return this.width * this.height;
    }
}
