import java.util.ArrayList;
public class JavaBasic {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.add(3);
        myArray.add(-4);
        myArray.add(-5);
        myArray.add(70);
        myArray.add(15);

        int[] myArr = {4, 8, 8, 5, 9};

        Basic Algos = new Basic();
        // Algos.print255(255);
        // Algos.printOdd(20);
        // Algos.printSum(255);
        // Algos.printSum(50);
        // Algos.printArr(myArray);
        // Algos.printMaxInArr(myArray);
        // Algos.printAvgInArr(myArray);
        // Algos.printOddInArr(myArray);
        // Algos.printGreaterThanY(myArray, 10);
        // Algos.printSqr(myArray);
        // Algos.EliminateNegatives(myArr);
        // Algos.printMaxMinAvg(myArray);
        Algos.ShiftArrayValues(myArr);

    }
}