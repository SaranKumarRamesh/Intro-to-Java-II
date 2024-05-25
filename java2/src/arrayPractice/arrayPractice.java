package arrayPractice;

import java.util.Scanner;

public class arrayPractice {
    public static void main(String[]args){
        Scanner input = new Scanner( System.in);

        char[]alphabet = new char[6];
        System.out.println("Enter the alphabet:");
        for ( int i=0; i<3; ++i )
        {
            alphabet[i] = input.next().charAt(0);
        }
        System.out.println(alphabet);
    }

    public static int count( String str1, String str2){
        String sTemp = new String(str1);
        int index= str1.indexOf(str2);
        int iResult = 0;
        while(index != -1){
            iResult++;

        }
        return iResult;
    }
}
