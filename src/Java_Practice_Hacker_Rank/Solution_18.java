/*
https://www.hackerrank.com/challenges/java-anagrams/problem
 */
package Java_Practice_Hacker_Rank;

import java.util.Scanner;

public
class Solution_18 {


    public static
    void main (String[] args) {
        Scanner scan = new Scanner ( System.in );
        String  a    = scan.next ( );
        String  b    = scan.next ( );
        scan.close ( );
        boolean ret = isAnagram ( a , b );
        System.out.println ( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    public static
    boolean isAnagram (String a , String b) {

        if ( a.length ( ) != b.length ( ) ) return false;

        int flag=0;
        a = a.toLowerCase ( );
        b = b.toLowerCase ( );

        int[] letters = new int[1 << 8];

        // It is counting the occurrences of characters in the string.
        for (char c : a.toCharArray ( )) {
            letters[c]++;
            System.out.println ( c );
            System.out.println (letters[c]);

        }

        System.out.println ( );

        // In the same way, it is decrementing the
        for (char c : b.toCharArray ( )) {
            letters[c]--;
            System.out.println ( c  );
            System.out.println (letters[c]);
        }


        // Here if the strings are anagrams, then in same order the
        // letters value will come to 0, so if it is not 0, then it is not anagrams.

        for (int i : letters) {
            //System.out.println (i );
            if ( i != 0 ) // Checking, it is not NULL
            {
                flag=0;
            }else{
                flag=1;
            }
        }
        if(flag==1) {
            return true;
        }
        else{
            return false;
        }
    }
}
