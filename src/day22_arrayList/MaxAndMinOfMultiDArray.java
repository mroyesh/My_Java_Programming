package day22_arrayList;

public class MaxAndMinOfMultiDArray {
    public static void main(String[] args) {
        int[][] array2D = {{100, 20, 300}, {10, 1000, 50}, {-200, 400, 0}};
        int max= array2D[0][0];
        int min = array2D[0][0];
        for (int[] array1D : array2D) {
            for (int eachElements : array1D) {
                if(eachElements>max){
                    max=eachElements;
                }
                if(eachElements<min){
                    min= eachElements;
                }

            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
