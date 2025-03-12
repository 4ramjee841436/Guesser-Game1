
public class logicaloperator {
    public static void main(String[] args) {


        int p = 15, q = 20, r = 25;
        // && operator
        System.out.println((p > q) && (p < r));
        System.out.println((p < q) && (p < r));
        // |||| operator
        System.out.println((p > q) || (p < r));
        System.out.println((p > q) || (p < r));
        System.out.println((p<q) || (p<r) || (q>r) || (q<r));
        // ! operator
        System.out.println(!(p>q));
        System.out.println(!(p==q));
        System.out.println(!(p<=r));
        System.out.println(!(p>=r));
    }
}
