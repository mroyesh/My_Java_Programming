package Utilities;

public class ArraysUtility {

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];// make sure that the third Arrays has enough capacity.
        int k = 0;// for third arrays index number
        for (int i = 0; i < arr1.length; i++, k++) {
            result[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            result[k] = arr2[i];
        }
        return result;


    }

    public static double[] merge(double[] arr1, double[] arr2) {
        double[] result = new double[arr1.length + arr2.length];// make sure that the third Arrays has enough capacity.
        int k = 0;// for third arrays index number
        for (int i = 0; i < arr1.length; i++, k++) {
            result[k] = arr2[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            result[k] = arr2[i];
        }
        return result;
    }


    public static char[] merge(char[] arr1, char[] arr2) {
        char[] result = new char[arr1.length + arr2.length];// make sure that the third Arrays has enough capacity.
        int k = 0;// for third arrays index number
        for (char i = 0; i < arr1.length; i++, k++) {
            result[k] = arr1[i];
        }
        for (char i = 0; i < arr2.length; i++, k++) {
            result[k] = arr2[i];
        }
        return result;

    }

    public static String[] merge(String[] arr1, String[] arr2) {
        String[] result = new String[arr1.length + arr2.length];// make sure that the third Arrays has enough capacity.
        int k = 0;// for third arrays index number
        for (char i = 0; i < arr1.length; i++, k++) {
            result[k] = arr1[i];
        }
        for (char i = 0; i < arr2.length; i++, k++) {
            result[k] = arr2[i];
        }
        return result;
    }

    public static int[] reverse(int[] array) {
        int[] reverse = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    public static double[] reverse(double[] array) {
        double[] reverse = new double[array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverse[j++] = array[i];

        }
        return reverse;
    }
    public static char[] reverse(char[] array) {

        char[] reverse = new char[array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            reverse[j] = array[i];

        }
        return reverse;
    }

    public static String[] reverse(String[] array) {
        String[] reverse = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];

        }
        return reverse;
    }
    
}