public  class Associativity {
    public static void main(String[] args) {
        System.out.println(4+2+"pqr");
        System.out.println("pqr"+4+2);
        // fragment
        Boolean p= false;
        Boolean q= false;
        Boolean r=true;
        System.out.println(p==q==r);
    }
}
