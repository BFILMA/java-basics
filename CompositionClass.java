public class CompositionClass {

    private final Address address;
    CompositionClass(String ad){
        this.address = new Address(ad);
    }

    private static class Address{
        private String addr;
        public Address(String ad){
            this.addr = ad;
        }
    }

    public static void main(String[] args) {
        CompositionClass cm = new CompositionClass("a");
    }
}
