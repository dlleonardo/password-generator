import java.security.SecureRandom;

public class Main {
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()-_=+";
    private static final int PASSWORD_LENGTH = 24;

    public static void main(String[] args) {
        String password = generatePassword();
        System.out.println("Generated password: " + password);
    }

    private static String generatePassword(){
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for(int i = 0; i < PASSWORD_LENGTH; i++){
            String charSet = LOWER + UPPER + DIGITS + SPECIAL;
            password.append(getRandomCharacter(charSet, random));
        }

        return shufflePassword(password, random);
    }

    private static char getRandomCharacter(String charSet, SecureRandom random){
        int index = random.nextInt(PASSWORD_LENGTH);
        //System.out.println("Random index: " + index);
        return charSet.charAt(index);
    }

    private static String shufflePassword(StringBuilder password, SecureRandom random){
        char[] shuffledPassword = String.valueOf(password).toCharArray();
        System.out.println("Before shuffle: " + String.valueOf(shuffledPassword));
        for(int i = 0; i < PASSWORD_LENGTH; i++){
            int randomInt = random.nextInt(PASSWORD_LENGTH);
            char tmp = shuffledPassword[randomInt];
            shuffledPassword[randomInt] = shuffledPassword[i];
            shuffledPassword[i] = tmp;
        }
        System.out.println("After shuffle: " + String.valueOf(shuffledPassword));
        return new String(shuffledPassword);
    }
}