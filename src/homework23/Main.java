package homework23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Random 50 numbers: ");
        ArrayList<Integer> numbers = getArrayList();
        Collections.sort(numbers);
        System.out.println(numbers);

        System.out.println("Odd numbers: ");
        ArrayList<Integer> oddNumbers = getOddNumbers(numbers);
        System.out.println(oddNumbers);

        System.out.println("Even numbers: ");
        ArrayList<Integer> evenNumbers = getEvenNumbers(numbers);
        System.err.println(evenNumbers);
    }

    private static ArrayList<Integer> getArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int numbers = random.nextInt(1, 100);
            arrayList.add(numbers);
        }
        return arrayList;
    }

    private static ArrayList<Integer> getOddNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                oddNumbers.add(numbers.get(i));
            }
        }
        return oddNumbers;
    }

    private static ArrayList<Integer> getEvenNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                evenNumbers.add(numbers.get(i));
            }
        }
        return evenNumbers;
    }


}
