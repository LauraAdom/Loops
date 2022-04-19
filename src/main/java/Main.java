import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);

        int[] numbers = {4, 2, 7};
        Arrays.sort(numbers);
        String result = Arrays.toString(numbers);
        System.out.println(result);

        // alt + enter imports a class when selected
        // to start multi-line comment   CTRL + SHIFT + /

        String[] names = {"Cristina", "Paul", "Thom", "Emilia", "Jordi"};

        System.out.println("===for===");
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("===For-each===");
        for(String name : names) {
            System.out.println(name);
        }

        System.out.println("===While===");
        int i = 0;
        while (i < names.length){
            System.out.println(names[i++]);
        }
        //checks the condition and then executes

        System.out.println("===Do-While===");
        i = 0;
        do {
            System.out.println(names[i++]);
        } while(i < names.length);
        //executes the code and then checks the condition and keeps running if the condition is met

        //FIRST EXERCISE
        // input: [5, 4, 3, 2, 1] output: [20, 12, 6, 2, 5] // Explanation 5*4, 4*3, 3*2, 2*1, 1*5

        int[] inputNumbers = {5, 4, 3, 2, 1};

        /*FINISH WATCHING RECORDING VIDEOS
        System.out.println();
        int lastPosition = number
        for(int b = 0; b < inputNumbers.length - 1; b++){
            inputNumbers[]
        }*/

        for(int j = 0; j < inputNumbers.length; j++){
            if(j != inputNumbers.length - 1){
                System.out.println(inputNumbers[j]*inputNumbers[j+1]);
            } else {
                System.out.println(inputNumbers[j]*inputNumbers[0]);
            }
        }

        int[] numbs = {5, 4, 3, 2, 1};
        int y = 0;
        while (y < numbs.length){
            System.out.println(y != numbs.length -1? numbs[y]*numbs[y+1] : numbs[y]*numbs[0]);
            y++;
        }

        //SECOND EXERCISE
        /*input: [1, 2, 3, 4, 5]
        output: [5, 4, 3, 2, 1]*/

        int[] input = {1, 2, 3, 4, 5};
        int[] output = new int[5];
        int oppositeIndex = input.length - 1;

        for(int k = 0; k < input.length; k++){
            output[k] = input[oppositeIndex--];
            }

        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(output));

        int[] oldArray = {0, 2, 4, 6, 8, 10, 12, 14};
        int[] newArray = new int[oldArray.length];

        for(int a = 0; a < newArray.length; a++){
            int index = oldArray.length - 1;
            newArray[a] = oldArray[index - a];
        }

        System.out.println(Arrays.toString(oldArray));
        System.out.println(Arrays.toString(newArray));

        




        }
}
