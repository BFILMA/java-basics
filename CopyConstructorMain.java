public class CopyConstructorMain {
    public static void main(String[] args) {
        CopyConstructor c1 = new CopyConstructor(1,2);
        CopyConstructor c2 = c1;
        c1.display();
        c2.display();
    }
}
