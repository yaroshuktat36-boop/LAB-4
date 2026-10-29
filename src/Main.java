public class Main {

    public static void main(String[] args) {

        Car car = new Car("Corolla", "Toyota", 2020, 24500.0, "Blue", 10);


        System.out.println("Initial state:");
        System.out.println(car.toString());


        car.sell(5);


        System.out.println("\nFields (Intial state):");
        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        car.setColor("Red");
        car.setPrice(25000.0);
        car.setYear(2023);
        car.delivery(10);



        System.out.println("\nFields (After changes):");
        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        car.sell(5);
        System.out.println("\nAfter changes:");
        System.out.println(car.toString());
    }
}