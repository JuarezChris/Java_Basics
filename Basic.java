import java.util.ArrayList;
import java.util.Arrays;
public class Basic {
    int sum;
    int max;
    int avg;
    int counter;
    int sqr;
    // int min;
    ArrayList<Integer> newArr = new ArrayList<Integer>();
    public void print255(int num){
        for(int i = 0; i <= num; i++){
            System.out.println(i);
        }
    }

    public void printOdd(int num){
        for(int i = 0; i <= num; i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }

    public void printSum(int num){
        for(int i = 0; i <= num; i++){
            sum += i;
            System.out.println("Number " + i + " Sum " + sum );
        }
    }

    public void printArr(ArrayList<Integer> myArray){
        for(int i = 0; i < myArray.size(); i++){
            System.out.println(myArray.get(i));
        }
    }

    public void printMaxInArr(ArrayList<Integer> myArray){
        for(int i = 0; i < myArray.size(); i++){
            if(myArray.get(i) > max){
                max = myArray.get(i);
            }
        }
        System.out.println(max);
    }

    public void printAvgInArr(ArrayList<Integer> myArray){
        for(int i = 0; i < myArray.size(); i++){
            sum += myArray.get(i);
        }
        avg = sum / myArray.size();
        System.out.println(avg);
    }

    public void printOddInArr(ArrayList<Integer> myArray){
        for(int i = 0; i < myArray.size(); i++){
            if(myArray.get(i) % 2 == 1){
                newArr.add(myArray.get(i));
            }
        }
        System.out.println(newArr);
    }

    public void printGreaterThanY(ArrayList<Integer> myArray, int number){
        for(int i = 0; i < myArray.size(); i++){
            if(myArray.get(i) > number){
                counter += 1;
            }
        }
        System.out.println(counter);
    }

    public void printSqr(ArrayList<Integer> myArray){
        for(int i = 0; i < myArray.size(); i++){
            sqr = myArray.get(i) * myArray.get(i);
            newArr.add(sqr);
        }
        System.out.println(newArr);
    }

    public void EliminateNegatives(int[] myArr){
        for(int i = 0; i < myArr.length; i++){
            if(myArr[i] < 0){
                myArr[i] = 0;
            }
            System.out.println(myArr[i]);
        }
        // System.out.println(myArr); does not work prints out a weird *[I@6504e3b2
        System.out.println(Arrays.toString(myArr));
    }

    public void printMaxMinAvg(ArrayList<Integer> myArray){
        int min = myArray.get(0);
        for(int i = 0; i < myArray.size(); i++){
            sum += myArray.get(i);
            if(myArray.get(i) > max){
                max = myArray.get(i);
            }
            if(myArray.get(i) < min){
                min = myArray.get(i);
            }
        }
        avg = sum / myArray.size();
        System.out.println("Avg " + avg + " Min " + min + " Max " + max);
    }

    public int[] ShiftArrayValues(int[] myArr){
        for(int i = 0; i < myArr.length; i++){
            if(myArr.length - i == 2){
                // System.out.println("hello" + myArr[i]);
                // System.out.println("hi" + myArr[i+1]);
                myArr[i] = myArr[i+1];
                myArr[i+1] = 0;
                System.out.println(Arrays.toString(myArr));
                return myArr;
            }
            myArr[i] = myArr[i+1];
            System.out.println(myArr[i]);
        }
        System.out.println(Arrays.toString(myArr));
        return myArr;
    }

}
