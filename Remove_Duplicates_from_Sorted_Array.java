import java.util.*;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        Map<String,Integer> checkRepeatMap = new HashMap<>();
        List<String> num = new ArrayList<>();
        int firstNum = 0;
        num.add("0");
        num.add("0");
        num.add("1");
        num.add("1");
        num.add("1");
        num.add("2");
        num.add("2");
        num.add("3");
        num.add("3");
        num.add("4");

        for(int i = 0 ; i < num.size() ; i++){
            String getNum = num.get(i);
            if (!checkRepeatMap.containsKey(getNum)){
                firstNum = firstNum + 1;
            }
            else {
                num.set(i,"_");
            }
            checkRepeatMap.put(getNum,i);
        }
        Collections.sort(num);
        System.out.println("nums = " + num);
        System.out.println("Outout:" + firstNum);
    }
}
