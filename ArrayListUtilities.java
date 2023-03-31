import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListUtilities {
    public static int getListMax(ArrayList<Integer> items) {
        int max = items.get(0);
        for(int index = 0; index < items.size(); index++){
            if( items.get(index) > max){
                max = items.get(index);
            }
        }
        return max;
    }

    public static ArrayList<String> withoutLongWords(ArrayList<String> items){
        ArrayList<String> solution = new ArrayList<>();
        for (int i = 0; i < items.size(); i++){
            if (items.get(i).length() < 6){
                solution.add(items.get(i));
            }
        }
        return solution;
    }

    public static void removeLongWords(ArrayList<String> items){
        for (int i = 0; i < items.size(); i++){
            if (items.get(i).length() > 5){
                items.remove(items.get(i));
            }
        }
    }

    public static ArrayList<Double> reversed(ArrayList<Double> items){
        ArrayList<Double> solution = new ArrayList<>();
        for(int i = items.size() - 1; i >= 0; i--){
            solution.add(items.get(i));
        }
        return solution;
    }

    public static void reverseInPlace(ArrayList<Double> items){
        int countDown = items.size()-1;
        for (int i = 0; i < items.size() / 2; i++){
            Double temp = items.get(i);
            items.set(i, items.get(countDown));
            items.set(countDown, temp);
            System.out.println(items);
            countDown--;
        }
    }

}