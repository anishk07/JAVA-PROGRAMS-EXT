//Java Program To Find Employee Name In An Array List That Starts With A Specified Alphabet
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmpName {
    public static void main(String[] args) {
        Scanner input = null ;
        try{
            ArrayList<String> empName = new ArrayList<>();
            input = new Scanner(System.in);
            empName.add("Steve");
            empName.add("David");
            empName.add("Nathan");
            empName.add("Alex");
            empName.add("Aaron");

            System.out.println("Employee List: " + empName);
            System.out.println("\nSearch Employee by letter: ");
            String letter = input.next();

            List<String> searchResult = new ArrayList<>();
            for (String string : empName) {
                  if(string.contains(letter))
                     searchResult.add(string);
             }

            List<String> searchResultStartsWithSpecifiedLetters = new ArrayList<>();
            for (String string : empName) {
                if(string.startsWith(letter))
                    searchResult.add(string);
            }

            for(String i : empName) {
                if(i.startsWith(letter)) System.out.println("Employee Name Starting With Sepcified Letter Is " + i);
                
            }
        }finally{
            input.close();
        }
    }
}