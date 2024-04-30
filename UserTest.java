import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void testCreateUser() {
        User user = new User("john_doe", "securepassword", "ADMIN");
        Assertions.assertEquals("john_doe", user.getUsername());
        Assertions.assertEquals("securepassword", user.getPassword());
        Assertions.assertEquals("ADMIN", user.getRole());
    }
}
