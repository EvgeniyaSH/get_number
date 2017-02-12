/**
 * Created by evgenia on 10.02.17.
 */

public class Main {
    public static void main(String[] args) {
        try {
            String given = "08545f58";
            System.out.println(strtoInt(given));
        } catch (MyExept ee) {
            ee.printStackTrace();
        }
    }

    public static int strtoInt(String given) throws MyExept{
        int k = given.length();
        int n = 0;
        int ourn = 0;
        while (k > 0) {
            int i1 = Character.getNumericValue(given.charAt(k - 1));
            if (i1 < 0 || i1 > 9 )
                throw new MyExept("one of the symbols in the line is not a number");
                else
            ourn = (int) (Math.pow(10, n)) * i1 + ourn;

            k = k - 1;
            n = n + 1;
        }
        return ourn;
    }


}
