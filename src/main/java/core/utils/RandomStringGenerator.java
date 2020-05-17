package core.utils;

import java.util.Random;

/**
 * @author Rajesh
 */
public class RandomStringGenerator {


    public static String generateString(int length)
    {
        String actual = "abcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(actual.charAt(random.nextInt(actual
                    .length())));
        }

        return sb.toString();
    }
}
