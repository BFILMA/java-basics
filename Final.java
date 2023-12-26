public class Final {
    final int x = 100;
    public static void main(String[] args) {
        Final obj = new Final();
        obj.x = 1000;
        System.out.println(obj.x);
    }
}
