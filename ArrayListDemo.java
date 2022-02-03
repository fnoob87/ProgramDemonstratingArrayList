import java.util.ArrayList;
import java.util.Random;
/**
 * The purpose of this test program is to create an arrayList, fill it with randomly generated numeric values
 * Then print out those values using a foreach loop.
 */
public class ArrayListDemo
{
    public static void main(String[] args){
        // create an object of the ArrayList Class of type Integer
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        // create random number generator for creating random numbers
        Random rng = new Random();
        // populate arraylist using for loop
        for(int i = 0; i <= 10; i++){
            numberList.add(rng.nextInt(1000));
        }
        // print values using a foreach loop
        for (Integer number : numberList) {
            System.out.print(String.format("%d ",number));
        }

    }
}