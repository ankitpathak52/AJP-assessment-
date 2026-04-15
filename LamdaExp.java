public class LamdaExp {
    public static void main(String[] args) {
    Square sq = (n)->n*n;
    System.out.println(sq.squ(5));
    }
}
@FunctionalInterface
interface Square{
    int squ(int n);
}