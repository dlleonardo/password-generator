import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordGeneratorTest {

    @Test
    public void testGeneratedPasswordLength() {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        int length = 24; // Change this based on your actual password length
        String generatedPassword = passwordGenerator.generatePassword();

        assertEquals(length, generatedPassword.length());
    }

    @Test
    public void testGeneratedPasswordNotNull() {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        String generatedPassword = passwordGenerator.generatePassword();

        assertNotNull(generatedPassword);
    }

    // More tests

}
