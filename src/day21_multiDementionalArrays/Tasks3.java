package day21_multiDementionalArrays;

import java.util.Arrays;

public class Tasks3 {
    public static void main(String[] args) {
       String[][][][][][][][][][] array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};
        for (String[][][][][][][][][] array9D : array) {
            for (String[][][][][][][][] array8D : array9D) {
                for (String[][][][][][][] array7D : array8D) {
                    for (String[][][][][][] array6D : array7D) {
                        for (String[][][][][] array5D : array6D) {
                            for (String[][][][] array4D : array5D) {
                                for (String[][][] array3D : array4D) {
                                    for (String[][] array2D : array3D) {
                                        for (String[] elements : array2D) {
                                            System.out.println(Arrays.toString(elements));

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }

        String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
        String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
        String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};
        String[][] bach1Groups = {batch1Group1, batch1Group2, batch1Group3};

        System.out.println("-----------------------------------------------");


        String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};
        String[][] bach2Groups = {batch2Group1, batch2Group2, batch2Group3};

        String[][][] cydeoStudent = {bach1Groups, bach2Groups};
        for (String[][] array2D : cydeoStudent) {
            for (String[] array1D : array2D) {
                for (String students : array1D) {
                    System.out.println(students);

                }

            }


        String[][]bachGroup={batch1Group1, batch1Group2,batch2Group3};
        System.out.println(bachGroup.length);
        System.out.println(bachGroup[2][5]);



        }
    }
}