package myarrays;

public class MyArrays {
    public static void main(String[] args) {
        int[] oneDimArray = {1,2,3,4,5};
        int[][] twoDimArray = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
        int[][][] threeDimArray = {
                {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}},
                {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}},
                {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}}
        };

        for (int i = 0; i < oneDimArray.length; i++){
            System.out.print(oneDimArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < twoDimArray.length; i++){
            //System.out.println(twoDimArray[i]);
            for (int j = 0; j < twoDimArray[i].length; j++){
                System.out.print(twoDimArray[i][j]);
            }
            System.out.print(" ");
        }

        System.out.println();
        System.out.println("Three Dimention Array: ");
        for (int i = 0; i < threeDimArray.length; i++){
            for(int j = 0; j < threeDimArray[i].length; j++){
                for (int y = 0; y < threeDimArray[i][j].length; y++){
                    System.out.print(threeDimArray[i][j][y]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        //rewrite values of threeDim array
        System.out.println();
        System.out.println();
        System.out.println("Three Dimention Array Rewrited Values: ");
        int n;
        for (int i = 0; i < threeDimArray.length; i++){
            n = 0;
            for(int j = 0; j < threeDimArray[i].length; j++){
                for (int y = 0; y < threeDimArray[i][j].length; y++){
                    threeDimArray[i][j][y] = n;
                    n++;
                    System.out.print(threeDimArray[i][j][y]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
