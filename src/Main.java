import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Solution solution = new Solution();
        List list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.set(0, 10);

//        int size = list.size();
//        for (int i = 0; i < size / 2; i++) {
//            int temp = (int)list.get(i);
//            list.add(i, list.get(size - (1 + i)));
//            list.add(size - (1 + i), temp);
//        }

//        int[] list = {1, 2, 3};
//        System.out.println(Arrays.toString(solution.reverseArray(list)));
//        System.out.println(list);

//        String str = "Hello world this is Nrr.";
//        String[] strArr = str.split(" ");
//        System.out.println(Arrays.toString(strArr));

//        System.out.println(solution.getSmallestAndLargest("welcometojava", 3));
       /* List<List<Integer>> diList = new List<List<Integer>>();
        diList.get(0).add(1);
        diList.get(0).add(2);
        diList.get(0).add(3);
        diList.get(1).add(4);
        diList.get(1).add(5);
        diList.get(1).add(6);
        diList.get(2).add(9);
        diList.get(2).add(8);
        diList.get(2).add(9);
        System.out.println(solution.diagonalDifference(diList));*/

//        String str= "Nrr";
//        System.out.println(str.matches("Nrr"));

//        int[] n = {2, 1, 3, 4, 5};
//        int n = array.length;

//        solution.primeChecker(n);

//        String s;
//        String militaryTime = "";
//        s = "12:00:00PM";
//        String hMilt = String.valueOf((Integer.valueOf(s.substring(0,2)) + 12));
//        System.out.println(s);
//
//        militaryTime = s.replace("12",String.valueOf((Integer.valueOf(s.substring(0,2)) + 12)));
//        System.out.println(militaryTime);
      /*  int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        solution.java2DArray(arr);
        System.out.println("hey");*/

        System.out.println(solution.primeCount(5000));
    }
}
