public class Car extends Vehicle{
    public void honk(){
        System.out.println("Honk Honk!");
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.honk();
    }
}
