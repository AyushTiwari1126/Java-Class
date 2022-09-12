public class datatypes {
    public static void main(String[] args) {

        // Q.1 --> Write a Java program to print an int, a double and a char on screen.
        int a = 2;
        double b = 5;
        char c = 'A';
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        // Q.2 --> Write a program to print the area of a rectangle of sides 2 and 3
        // units respectively.
        int length = 2;
        int width = 3;
        int area = length * width;
        System.out.println("area of rectangle is " + area);

        // Q.3 --> Print the ASCII value of the character 'h'.
        System.out.println((int) 'h');

        // Q.4 --> Write a program to assign a value of 100.235 to a double variable and
        // then convert it to int.
        double d = 100.235;
        System.out.println((int) d);

        // Write a program to add 3 to the ASCII value of the character 'd' and print
        // the equivalent character.
        System.out.println((int) 'd' + 3);

        // Write a program to add an integer variable having value 5 and a double
        // variable having value 6.2.
        int five = 5;
        double sixpointtwo = 6.2;
        System.out.println(five + sixpointtwo);

        // Write a program to find the square of the number 3.9.
        System.out.println(3.9 * 3.9);
    }
}