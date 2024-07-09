
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveStars {
    public static void main(String[] args) {

 System.out.println("REMOVE ** E : lecoe "+removeStars("leet**cod*e"));
       System.out.println("REMOVE ** E : \"\" "+removeStars("qawsedrftgyh************"));
       System.out.println("REMOVE ** E : PRUKH "+removeStars("PRAN*S**UKH")); // PRAS**UKH -> PRA*UKH -> PRUKH
        System.out.println("REMOVE ** E : LongString "+removeStars("")); // PRAS**UKH -> PRA*UKH -> PRUKH
}

public static String removeStars(String text){
        BufferedReader reader;
        int[] kk = new int[10000];
        int jj = 0;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\pran.sukh\\Downloads\\GOLong\\JAVA\\LEETCODE\\CrackInterviewIn75QA\\longString.txt"));
            String line = reader.readLine();

            while (line != null) {
                text+= line.toString();

                // read next line
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] array  = text.split("");
        int left = 0;
        int right = 1;
        int lastRemovedFrom =0;
        boolean recentlyRemoved = false;

        while (right<array.length){
            if(array[right].equalsIgnoreCase("*")){
                if(recentlyRemoved){
                    lastRemovedFrom=lastRemovedFrom-1;
                    while (array[lastRemovedFrom] == ""){
                        lastRemovedFrom--;
                    }
                    array[lastRemovedFrom] = "";

                    array[right] ="";
                }else{
                    left = right;
                    // remove
                    array[left-1] = "";
                    array[right] ="";
                    lastRemovedFrom = left-1;
                    recentlyRemoved = true;
                }

            }else{
                recentlyRemoved = false;
            }
            right+=1;
        }
        String result = "";
        for(String data : array){
            result+=data;
        }
        return result;
    }

    

  
}
