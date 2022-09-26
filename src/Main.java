public class Main {
    public static void main(String[] args) {

        //Задание1
        int [] Arr = new int [] {1, 2, 3};
        double [] Arr2 = {1.57, 7.654, 9.986};
        int [] Arr3 = {-1, -2, -3};
        //Задание2
        for (int i = 0; i < 3; i++) {
            System.out.print(Arr[i]);
            if(i < Arr.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        for (int j = 0; j < 3; j++) {
            System.out.print(Arr2[j]);
            if(j < Arr2.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        for (int k = 0; k < 3; k++) {
            System.out.print(Arr3[k]+" ");
            if(k < Arr3.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        //Задание3
        for (int i = 2; i > -1; i--) {
            System.out.print(Arr[i]);
            if(i > 0){
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        for (int j = 2; j > -1; j--) {
            System.out.print(Arr2[j]);
            if(j > 0){
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        for (int k = 2; k > -1; k--) {
            System.out.print(Arr3[k]);
            if(k > 0){
                System.out.print(", ");
            }
        }
        System.out.print("\n");
        for (int i = 0; i < 3; i++) {
            if (Arr[i] % 2 != 0) {
                System.out.print(Arr[i]+1);
            } else {
                System.out.print(Arr[i]);
            }
            if(i < Arr.length - 1){
                System.out.print(", ");
            }
        }
    }
}