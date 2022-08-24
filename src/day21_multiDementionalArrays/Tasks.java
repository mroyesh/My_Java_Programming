package day21_multiDementionalArrays;

import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {


        /*String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
        String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
        String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};

        String [][]bach1Groups={batch1Group1, batch1Group2, batch1Group3};
        for (String[] eachbach : bach1Groups) {
            System.out.println(Arrays.toString(eachbach));
            for (String eachStudents : eachbach) {
                System.out.println(eachStudents);
            }
            String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
            String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
            String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

            String [][] bach2Groups= {batch2Group1, batch2Group2, batch2Group3};
            for (String[] eachGroup : bach2Groups) {
                System.out.println(Arrays.toString(eachGroup));
                for (String eachElements : eachGroup) {
                    System.out.println(eachElements);

                }
            }
        String [][] [] cydeoStudents= {bach1Groups, bach2Groups};
            for (String[][] eachBatch : cydeoStudents) {
                System.out.println(Arrays.deepToString(eachBatch));
                for (String[] eachGroup : eachBatch) {
                    System.out.println(Arrays.toString(eachGroup));
                    for (String eachStudents : eachGroup) {
                        System.out.println(eachStudents);

                    }

                }

            }






        }



        /*
        1. CydeoStudents Task:
		1. given the following arrays:
		 		String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
		 		String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
		 		String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};

		2. declare an array variable named batch1Groups with the length of three
				2.1 Assign batch1Group1, batch1Group2, batch1Group3 to each indexes
				 of the variable batch1Groups

		3. given the following arrays:
				String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
		 		String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
		 		String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

 		4. declare an array variable named batch24Groups with the length of
 				4.1 Assign batch2Group1, batch2Group2, batch2Group1 to each indexes of the variable batch2Groups

		5. declare an array variable named CydeoStudents and assign batch1Groups & batch2Groups to the indexes of CydeoStudents

		6. Print the names of each students



         */

        /*String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };


        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j] + "\t");

            }
            System.out.println();

        }

        System.out.println("-----------------------------------");

        for (int i = 0; i < items.length; i++) {
            for (int j = items[i].length - 1; j >= 0; j--) {
                System.out.print(items[i][j] + "\t");
            }
            System.out.println();

        }

        System.out.println("----------------------------------------");


        for (int i = items.length - 1; i >= 0; i--) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j]+"\t");

            }
            System.out.println();

        }


        /*
         Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
         */


        /*String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};
        for (String[][][][][][][][][] each9D : array) {
            for (String[][][][][][][][] each8D : each9D) {
                for (String[][][][][][][] each7D : each8D) {
                    for (String[][][][][][] each6D : each7D) {
                        for (String[][][][][] each5D : each6D) {
                            for (String[][][][] each4D : each5D) {
                                for (String[][][] each3D : each4D) {
                                    for (String[][] each2D : each3D) {
                                        for (String[] eachElements : each2D) {
                                            System.out.println(Arrays.toString(eachElements));

                                        }

                                    }

                                }

                            }

                        }

                    }

                }

            }

        }


*/





    }
}
