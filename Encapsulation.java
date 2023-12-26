public class Encapsulation {
    private String secret;
    public void setSecret(String s){
        secret = s;
    }
    public String getSecret(){
        return secret;
    }
    public static void main(String[] args) {
        Encapsulation e1 = new Encapsulation();
        e1.setSecret("This is a private variable");
        System.out.println(e1.getSecret());
    }
}
