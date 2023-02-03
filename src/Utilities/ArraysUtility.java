package Utilities;

import java.util.Arrays;

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
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverse[j++] = array[i];

        }
        return reverse;
    }

    public static char[] reverse(char[] array) {

        char[] reverse = new char[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
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

    public static int[] addElement(int[] array, int element) {
        int[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }


    public static double[] addElement(double[] array, double element) {
        double[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }


    public static char[] addElement(char[] array, char element) {
        char[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }


    public static String[] addElement(String[] array, String element) {
        String[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    public static boolean contains(int[] array, int elements) {
        for (int each : array) {
            if ( each == elements ) {
                return true;
            }
        }
        return false;
    }


    public static boolean contains(double[] array, double elements) {
        for (double each : array) {
            if ( each == elements ) {
                return true;
            }
        }
        return false;
    }


    public static boolean contains(char[] array, char elements) {
        for (char each : array) {
            if ( each == elements ) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(String[] array, String elements) {
        for (String each : array) {
            if ( each.equals(elements )) {
                return true;
            }
        }
        return false;
    }




}