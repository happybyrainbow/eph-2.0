public class MainProgram {
    public static void main(String[] args) {
        Property p1 = new Property("Address: Erzbergerstraße 1",10,20.5);
        System.out.println("Address: " + p1.getAddress() + "\nSize: " + p1.getSize() + " m²");

        Property p2 = new Property("Address: Erzbergerstraße 2",70,25.7);
        System.out.println("Address: " + p2.getAddress() + "\nSize: " + p2.getSize() + " m²");

        Property p3 = new Property("Address: Erzbergerstraße 3",50,36.1);
        System.out.println("Address: " + p3.getAddress() + "\nSize: " + p3.getSize() + " m²");

        Property p4 = new Property("Address: Erzbergerstraße 4",30,40.2);
        System.out.println("Address: " + p4.getAddress() + "\nSize: " + p4.getSize() + " m²");

        Property p5 = new Property("Address: Erzbergerstraße 5",26,50.01);
        System.out.println("Address: " + p5.getAddress() + "\nSize: " + p5.getSize() + " m²");

        Stairs s1 = new Stairs(20.1,26,50.01);
        System.out.println("Volumen der Treppe: " + s1.getSize() + "m³");

        Stairs s2 = new Stairs(10.1,29,56.01);
        System.out.println("Volumen der Treppe: " + s2.getSize() + "m³");

        Stairs s3 = new Stairs(23.1,26,59.01);
        System.out.println("Volumen der Treppe: " + s3.getSize() + "m³");

        Stairs s4 = new Stairs(10.1,46,60.01);
        System.out.println("Volumen der Treppe: " + s4.getSize() + "m³");

        Stairs s5 = new Stairs(90.1,1000,100.01);
        System.out.println("Volumen der Treppe: " + s5.getSize() + "m³");
    }
}