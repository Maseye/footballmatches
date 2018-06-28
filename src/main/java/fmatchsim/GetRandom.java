package fmatchsim;

import java.util.Random;

public class GetRandom {


    public static String getRandomString(int upperBound, int lowerBound) {
        Random random = new Random();
        int randomLength = (random.nextInt(upperBound - lowerBound) + lowerBound);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < randomLength; i++) {
            char rndChar = (char) (random.nextInt(25) + 65);
            stringBuilder.append(rndChar);
        }
        return stringBuilder.toString();
    }
}
