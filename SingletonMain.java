public class SingletonMain {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();

        if(x==y){
            System.out.println("Objects are the same");
        }
    }
}
