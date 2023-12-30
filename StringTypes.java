public class StringTypes {
    public static void concat1(String s1){
        s1 = s1 + "S2";
    }
    public static void concat2(StringBuffer s1){
        s1.append("S2");
    }
    public static void concat3(StringBuilder s1){
        s1.append("S2");
    }
    
    public static void main(String[] args) {
        String s1 = "S1";
        StringBuffer s11 = new StringBuffer("S11");
        StringBuilder s111 = new StringBuilder("S111");

        concat1(s1);
        System.out.println(s1);

        concat2(s11);
        System.out.println(s11);

        concat3(s111);
        System.out.println(s111);
    }
}
