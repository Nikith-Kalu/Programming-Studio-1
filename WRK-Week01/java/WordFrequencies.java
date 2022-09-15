import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class WordFrequencies {
   public static void main(String[] args) {      

      // STEP 1: Read the number of words into an integer
      Scanner scnr = new Scanner(System.in);
      ArrayList<String> list = new ArrayList<String>();
      int num = scnr.nextInt();

      // STEP 2: Read the words, one-at-a-time into an ArrayList
      for (int i = 0; i < num; i++) {
         list.add(scnr.next());
      }
      // STEP 3: Skip Steps 4 and 5 cause im not a beta male
      while (list.size() != 0) {
         String check = list.get(0);
         int freq = Collections.frequency(list, check);
         list.removeAll(Collections.singleton(check));
         System.out.println(check + " - " + freq);
      }
      // STEP 4: Question - What do you need to change in your Step 3 code
      //                    to find the number of times the *second* word
      //                    appears in the ArrayList?
      //         Question - What about the *third* word?
      //         Question - Do you see a pattern emerging?

      // STEP 5: Turn your code in Step 3 into a loop that checks every word in the ArrayList
      }
   }