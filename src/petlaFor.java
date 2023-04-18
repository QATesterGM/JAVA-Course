public class petlaFor {

    public static void main(String[] args) {

        //ZADANIE 1

        int[] numbers = {2, 2, 3, 4, 5, 7, 7, 7, 8, 8, 2};

        //policz ile jest liczb parzystych a ile nieparzystych w tablicy

        int even = 0;
        int odd = 0;


        for (int number : numbers) {
            if (number % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }

        System.out.println("Ilość liczb nieparzystych to: " + odd);
        System.out.println("a ilość liczb parzystych to: " + even);


        int number = 10;

        number = number + 1;
        System.out.println(number);

        number += 1;
        System.out.println(number);

        System.out.println(number++); //POST INCREMENT
        System.out.println(number);

        System.out.println(++number);  //PRE INCREMENT

        //ZADANIE 2

        int[] numbersTwo = {1, 2, 3, 4, 5};

        //zamień pierwszą licze w tablicy z ostatnią

        int first = numbersTwo[0];
        int last = numbersTwo[numbersTwo.length - 1];

        numbersTwo[0] = last;
        numbersTwo[numbersTwo.length - 1] = first;

        for (int numberTwo : numbersTwo) {
            System.out.println(numberTwo);
        }

        //drugie rozxwiazanie tylko z jedna zmienna

        numbersTwo[0] = numbersTwo[numbersTwo.length - 1];
        numbersTwo[numbersTwo.length - 1] = first;

        for (int numberTwo : numbersTwo) {
            System.out.println("Drugie roziwazanie: " + numberTwo);
        }


        //roziazanie trzecie

        int[] numbersTree = {1, 2, 3, 4, 5};
        numbersTree[numbersTree.length - 1] = numbersTree[numbersTree.length - 1] + numbersTree[0];

        numbersTree[0] = numbersTree[numbersTree.length - 1] - numbersTree[0];

        numbersTree[numbersTree.length - 1] = numbersTree[numbersTree.length - 1] - numbersTree[0];

        for (int numberTree : numbersTree) {
            System.out.println("gotowe rozwiazanie trzecie: " + numberTree);
        }
    }
}
