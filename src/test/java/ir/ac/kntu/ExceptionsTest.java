package ir.ac.kntu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author S.Shayan Daneshvar
 */
public class ExceptionsTest {
    @Test
    public void testNoSuchAccountNumberException() {
        Assertions.assertTrue(RuntimeException.class
                .isAssignableFrom(NoSuchAccountNumberException.class));
    }

    @Test
    public void testOperationFailedException() {
        Assertions.assertFalse(RuntimeException.class
                .isAssignableFrom(OperationFailedException.class));
        Assertions.assertTrue(Exception.class
                .isAssignableFrom(OperationFailedException.class));
    }
}
