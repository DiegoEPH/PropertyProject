public class Property {

    private String address;
    private double width;
    private double length;

    public Property(String a, double w, double l){
        address =a;
        width = w;
        length= l;
    }

    public String getAddress(){
        return address;
    }

    public double getSize(){
        return width*length;
    }
}
