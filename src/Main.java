import java.util.*;

public class Main {

    public static void main(String[] args) {
        Integer[] bulbs = {0,1,0,1};
        System.out.println(getNumberOfSwitchesToPress(new ArrayList<Integer>( Arrays.asList(bulbs))));
    }

    public static int getNumberOfSwitchesToPress(ArrayList<Integer> a) {
        int state = 0;
        int counter =0;
        for (int i=0;i<a.size();i++){
            if (a.get(i)==state){
                counter++;
                state = 1 - state;
            }
        }
        return counter;
    }
}
