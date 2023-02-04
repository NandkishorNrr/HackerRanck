import java.util.*;

public class Solution {
    public List<Integer> reverseArray(List<Integer> a) {
        int size = a.size();
        for (int i = 0; i < size / 2; i++) {
            int temp = a.get(i);
            a.add(i, a.get(size - (1 + i)));
            a.add(size - (1 + i), temp);
        }
        return a;
    }

    public int[] reverseArray(int[] a) {
        int size = a.length;
        for (int i = 0; i < size / 2; i++) {
            int temp = a[i];
            a[i] = a[size - (1 + i)];
            a[size - (1 + i)] = temp;
        }
        return a;
    }

    public String getSmallestAndLargest(String s, int k) {
        String smallest;
        String largest;
        String[] list = new String[s.length() - (k - 1)];
        for (int i = 0; i < list.length; i++) {
            list[i] = s.substring(i, k + i);
        }

       /* List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length() - (k - 1); i++) {
            list.add(s.substring(i, i + k));
        }

        Collections.sort(list);

        smallest = list.get(0);
        largest = list.get(list.size() - 1);*/
        smallest = list[0];
        largest= list[0];


        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < list.length; j++) {
                if (smallest.compareTo(list[i]) > 0)
                    smallest = list[i];
                if (largest.compareTo(list[i]) < 0)
                    largest = list[i];
            }
        }
        return smallest + "\n" + largest;
    }

    public int diagonalDifference(List<List<Integer>> arr) {
        int digLR = 0;
        int digRL = 0;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if(i == j)
                    digLR += arr.get(i).get(j);
                if(i + j == 3 - 1)
                    digLR += arr.get(i).get(j);
            }
        }
        return Math.abs(digLR - digRL);
    }
    public void primeChecker(int[] n){
        for (int i = 0; i < n.length; i++){
            for (int j = 2; j < n[j]; j++) {
                if (isPrime(j))
                    System.out.print(j + " ");
            }
        }
        System.out.println();
    }
    public boolean isPrime(int n){
        if (n < 2)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


//    public static String timeConversion(String s) {
//        String militaryTime = "";
//        if(s.contains("AM")){
//            if(s.substring(0,2).contains("12")){
//                s.replace("12", "00");
//                militaryTime = s.substring(0, 8);
//            }
//
//
//        }
//        else {
//            s.replace(s.substring(0, 2),String.valueOf(Integer.valueOf(s.substring(0, 2) + 12)));
//            militaryTime = s.substring(0, 8);
//        }
//
//        return militaryTime;
//    }

    public void java2DArray(int[][] arr){

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = 0;

                for (int k = j; k < 3 + j ; k++) {
                    sum += arr[i][k];
                }
                sum += arr[1 + i][1 + j];
                for (int k = j; k < 3 + j; k++) {
                    sum += arr[2 + i][k];
                }

                if(maxSum < sum)
                    maxSum = sum;
            }
        }

        System.out.println(maxSum);
    }

    public int primeCount(long n) {
        int count = 0;

        for (int i = 2; n > 1; i++) {
            while(n % i == 0){
                n = n / i;
                count++;
            }
        }
        return count;
    }
}
