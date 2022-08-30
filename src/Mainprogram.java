public class Mainprogram {

    public static void main(String[] args) {
        Property p1 = new Property("Erzbergerstraße 1",10, 20.5);
        System.out.println(p1.getAddress() + " - " + p1.getSize() + "m²");

        Property p2 = new Property("Erzbergerstraße 2", 15, 25.5);
        System.out.println(p2.getAddress() + " - " + p2.getSize() + "m²");

        Property p3 = new Property("Borsigstraße 76", 16, 35);
        System.out.println(p3.getAddress() + " - " + p3.getSize() + "m²");

        Property p4 = new Property("An der Blattstraße 84", 20, 45);
        System.out.println(p4.getAddress() + " - " + p4.getSize() + "m²");

        Property p5 = new Property("Wiesenstraße 96", 35, 75);
        System.out.println(p5.getAddress() + " - " + p5.getSize() + "m²");
    }


}
