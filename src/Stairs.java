public class Stairs {
    private double height;
    private double width;
    private double length;

    public Stairs(double height,double width,double length){
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double getSize(){
        return this.width * this.length * this.height / 2;
    }


}
