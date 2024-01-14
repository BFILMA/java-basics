import java.util.ArrayList;

public class Listadd{
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList<>();
        a1.add("a");
        a1.add("b");

        ArrayList a2 = new ArrayList<>();
        a2.add(a1);

        a2.addAll(a1);
        System.out.println(a2);
    }
}