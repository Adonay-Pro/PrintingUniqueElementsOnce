package taskfive;

/*Write a program which for a given array of ints prints all its elements, but each value
only once, without repetitions (and the number of different elements).*/

public class TaskFive {
    public static void main (String[] args) {
        int arr[] = {1, 10, 10, 10, 4, 4, 6,50,50};
        int n = arr.length;
        distinctNumber(arr, n);
    }

    static void distinctNumber(int arr[], int n) {
        int contador =0;
            for (int i = 0; i < n; i++) {
               int j;
               for (j = 0; j < i; j++){

                    if (arr[i] == arr[j]) {
                        break;
                    }
                }
                if (i == j) {
                    contador++;
                    System.out.print(arr[i] + " ");

                }
            }
        System.out.println();
        System.out.print("There were " +contador+ " different numbers");
        }

    }



