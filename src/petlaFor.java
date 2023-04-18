public class petlaFor {

    public static void main(String[] args) {

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
    }
}
