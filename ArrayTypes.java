import java.util.ArrayList;

public class ArrayTypes {
    public static void main(String[] args) {
        int[] array = new int[2];
        array[0] = 10;
        array[1] = 20;
        System.out.println(array[0]);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(10);
        System.out.println(arrayList.get(0));
    }
}
