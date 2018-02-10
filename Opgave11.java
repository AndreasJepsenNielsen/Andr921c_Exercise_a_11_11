import java.util.*;

public class Opgave11 {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(4);
        set1.add(7);
        set1.add(9);


        set2.add(2);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        symmetricSetDifference(set1, set2);
    }

    public static Set symmetricSetDifference(Set<Integer> a, Set<Integer> b) {


        Set<Integer> set3 = new HashSet(a); // laver et set som består af alle værdierne i a
        set3.addAll(b);

        for(Integer A : a)
        {
            if(b.contains(A)) //hvis b har en af værdierne i set3 fjernes værdien, derved er der ingen duplicates
            {
               set3.remove(A);
            }
        }




        System.out.println(set3); // udskriver set 3 af integers
        return set3;

    }
}
