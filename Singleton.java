public class Singleton {
    private static Singleton instance = null;
    public String s;
    private Singleton(){
        s = "A string";
    }
    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
