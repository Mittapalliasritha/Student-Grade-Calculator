import java.util.*;

public class Task_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of grades to be entered:");
        int n = sc.nextInt();
        double sum = 0;
        int[] arr = new int[n];
        System.out.println("enter each grade:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double avg=sum/n;
        System.out.println("The average :" + avg);        
        sc.close();

    }

}
