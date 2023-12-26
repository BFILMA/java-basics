public class StringPool {
    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");

        if(s1 == s2) {
            System.out.println("s1 = s2");
        }
        if(s1 == s3){
            System.out.println("s1 = s3");
        }
        else{
            System.out.println("s1 != s3");
        }
    }
}
