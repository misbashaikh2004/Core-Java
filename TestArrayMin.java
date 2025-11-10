// import java.util.Arrays;
// import java.util.Scanner;

// public class TestArrayMin {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter size:");
//         int n = sc.nextInt();

//         int[] a = new int[n];

//         System.out.println("Enter numbers:");
//         for(int i = 0; i < n; i++)
//             a[i] = sc.nextInt();

//         int min = Arrays.stream(a).min().getAsInt();    //Using Stream

//         System.out.println("Minimum: " + min);
//     }
// }



// import java.util.Scanner;

// public class TestArrayMin {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter size:");
//         int n = sc.nextInt();

//         int[] a = new int[n];

//         System.out.println("Enter numbers:");
//         for(int i = 0; i < n; i++)
//             a[i] = sc.nextInt();

//         int min = a[0];

//         for(int x : a) {
//             if(x < min)
//                 min = x;
//         }

//         System.out.println("Minimum: " + min);
//     }
// }








import java.util.Arrays;
import java.util.Scanner;

public class TestArrayMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter numbers:");
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();

        System.out.println("Minimum: " + min(a));
    }

    public static int min(int a[]){
        return Arrays.stream(a).min().getAsInt();
    }
}
