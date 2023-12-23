import java.lang.Cloneable; 

public class A implements Cloneable{
    int val1, val2;
    public A (int a, int b){
        val1 = a;
        val2 = b;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
