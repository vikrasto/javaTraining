package training.ideas.java.stringCompression;

import java.util.List;

/**
 * Created by idnvra on 11-08-2014.
 */
public class stringCompression {
//    public static void compress(String inputString) {
//        char[] array = inputString.toCharArray();
//        String compressedString = "";
//        int sameElementCounter = 1;
//        compressedString = compressedString + Character.toString(array[sameElementCounter]);
//        for (int counter = 0; counter < array.length - 1; counter++) {
//            if (array[sameElementCounter - 1] == array[sameElementCounter]) {
//                sameElementCounter++;
//            }
//        }
//        compressedString = compressedString + Integer.toString(sameElementCounter);
//        System.out.println(compressedString);
//    }

    public static String compress(String inputString) {
        char[] array = inputString.toCharArray();
        String compressedString2 = "";
        int sameElementCounter = 1;
        for (int counter =0; counter < array.length;counter++){
           while(sameElementCounter==1){
               compressedString2 =compressedString2+ Character.toString(array[sameElementCounter-1]);
           }
           if (array[counter]==array[counter]+1){
               sameElementCounter++;
           }
         }
           compressedString2 = compressedString2+Integer.toString(sameElementCounter);
           sameElementCounter--;

        return compressedString2;
     }
}

