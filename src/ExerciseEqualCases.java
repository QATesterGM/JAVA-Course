public class ExerciseEqualCases {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "hello";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        String s = str1.toUpperCase();
        System.out.println(s);

        String s1 = str1.toLowerCase();
        System.out.println(s1);
    }
}
