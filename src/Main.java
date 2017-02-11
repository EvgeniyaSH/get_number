/**
 * Created by evgenia on 10.02.17.
 */

public class Main {
    public static void main(String[] args) {
        String given = "08545758";
        System.out.println(given);
        int k = given.length();
        int n = 0;
        int ourn = 0;
        while (k > 0) {
            int i1 = Character.getNumericValue(given.charAt(k - 1));
            ourn = (int) (Math.pow(10, n)) * i1 + ourn;

            k = k - 1;
            n = n + 1;
        }
        System.out.println(ourn);


    }
}
