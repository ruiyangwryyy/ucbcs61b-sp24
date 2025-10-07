import java.util.List;
import java.util.ArrayList;
public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        if (L == null) {
            return 0;
        }
        int total = 0;
        for (int x : L) {
            total += x;
    }
        return total;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
       List<Integer> evenlist= new ArrayList<>();
       for (int x : L){
        if (x%2==0){
            evenlist.add(x);
        }
    }
        return evenlist;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> commonlist=new ArrayList<>();
        for (int x : L1){
            for (int i=0 ;i<L2.size();i++){
                if (x==L2.get(i)){
                    commonlist.add(x);
                }
            }
             
        }
        return commonlist;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int count=0;
        if (words==null){
            return 0;
        }
        for (String s: words){
            for (int i=0;i<s.length();i++){
                if (s.charAt(i)==c){
                    count++;
                }
            }
            }
        return count;
}
}