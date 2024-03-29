import java.util.*;
import java.io.*;
/**
 * Input a positive whole number, and it will return all whole number factors in non-repetitive pairs (i.e 25 would return 1.0 25.0 5.0)
 *
 * @Andrew Senkowski
 * @3/13/2019
 */
public class FindFactors
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What number's factors would you like? Number: ");
        double s = Double.parseDouble(in.nextLine());
        ArrayList<Double> factors = new ArrayList();
        boolean factorSize = false;
        boolean sThere = false;
        for (double i = 1; i <= s; i++)
        {
            if ((s / i) - Math.floor(s / i) == 0 ) {
                if (factorSize) {
                    if (factors.get(factors.size() - 1) == i) {
                        sThere = true;
                    }
                }
                if (!sThere) {
                factors.add(i);
                if ((s / i) == i)
                    break;
                factors.add(s / i);
                factorSize = true;
                }
                else
                break;
            }
        }
        System.out.println("Your factors are: ");
        for (int i = 0; i < factors.size(); i++)
            System.out.print(factors.get(i) + " ");
    }
}
