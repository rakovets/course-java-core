import com.rakovets.course.java.core.practice.generic_types.Pair;

public class PairDemo {
    public static void main(String[] args) {
        Pair pair = new Pair(100, -100);
        Pair pair1 = pair.swap(1, 2);
        System.out.println(pair1.getObT());
        System.out.println(pair1.getObV());

        Pair pair2 = pair.swap(10, "Hi");
        System.out.println(pair2.getObT());
        System.out.println(pair2.getObV());

        Pair pair3 = pair.swap(pair1,2);
        System.out.println(pair3.getObT() instanceof Pair);
        System.out.println(pair3.getObV());
        System.out.println(pair3.getObV() instanceof Pair);

        Pair pair4 = pair.getSwapped();
        System.out.println(pair4.getObT());
        System.out.println(pair4.getObV());
    }
}
