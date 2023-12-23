public class Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException {
        A a = new A(2, 3);
        A b = (A)a.clone();

        System.out.println(b.val2);
    }
}
