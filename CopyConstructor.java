public class CopyConstructor {
    private int val1, val2;
    public CopyConstructor(int a, int b){
        val1 = a;
        val2 = b;
    }
    CopyConstructor(CopyConstructor c){
        this.val1 = c.val1;
        this.val2 = c.val2;
    }
    public void display(){
        System.out.println(this.val1);
        System.out.println(this.val2);
    }
}
