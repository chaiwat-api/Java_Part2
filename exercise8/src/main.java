public class main {
    public static void main(String[] args) {
        int[][] two_Array = {
                {1, 2, 3}, {4, 5, 6, 7}, {8, 9}
        };
        int sum = 0;
        //item1
        for (int i = 0; i < two_Array.length; i++) {
            for (int j = 0; j < two_Array[i].length; j++) {
                System.out.println(two_Array[i][j]);
            }
        }

        //item2
        for (int i = 0; i < two_Array.length; i++) {
            for (int j = 0; j < two_Array[i].length; j++) {
                if (j == two_Array[i].length - 1) {
                    sum = sum + two_Array[i][j];
                }
            }
        }
        System.out.println("Sum of last element in each row: " + sum);
    }
}