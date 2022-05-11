package wrappers;

import java.nio.charset.StandardCharsets;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {
        String s1 = "Russian";
        String s2 = new String("orcs");
        char[] c1 = {'g', 'o'};
        String s3 = new String(c1);
        String sF = "fuck";
        String s4 = new String(sF.getBytes(StandardCharsets.UTF_8));
        StringBuilder build = new StringBuilder("yourself");
        String s5 = build.toString();

        String fruits = "Tangerine.Banana.Kiwi.Peach";
        String[] fruitsSet = fruits.split("\\.");
        String resFruit = "";
        for (String fruit : fruitsSet) {
            if (fruit.length() > resFruit.length()) {
                resFruit = fruit;
            }
        }
        System.out.println(resFruit.toLowerCase());

        System.out.println(resFruit.substring(0, 3));

        String iamString = " I`m_new_string  ";
        System.out.println(iamString.trim().replace("_", " "));

        Scanner scan = new Scanner(System.in);
        System.out.println("You entered: ");
        String message = scan.nextLine();
        System.out.println(message);

        if (message.startsWith("Start")) {
            System.out.println("Start process ...");
        } else if (message.endsWith("ended")) {
            System.out.println("Process end!");
        } else if (message.toLowerCase().contains("error")) {
            System.out.println("Error occurred");
        }

        StringBuilder build2 = new StringBuilder ();
        build2 = build2.append(s1).append(".").append(s2).append(".").append(s3).append(".").append(s4).append(".").append(s5);
        String[] newString = build2.toString().split("\\.");
        System.out.println(Arrays.toString(newString));
        for (int i = 0; i < newString.length; i++) {
            if(i == 0) {
                System.out.print(newString[i] + " ");
            } else if((i % 3) != 0) {
                System.out.print(newString[i] + " ");
            } else {
                System.out.print("\n" + newString[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < newString.length; i++) {
            System.out.print(newString[newString.length - i - 1] + " ");
        }
        System.out.println();
        System.out.println(build2.toString().replace(".", " "));
    }
}
