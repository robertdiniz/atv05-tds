import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IdentifierTest {

    private final Identifier identifier = new Identifier();

    @Test
    void testValidIdentifiers() {
        assertTrue(identifier.validateIdentifier("abc123"));
        assertTrue(identifier.validateIdentifier("A12345"));
        assertTrue(identifier.validateIdentifier("zA1"));
        assertTrue(identifier.validateIdentifier("Cuite"));
        assertTrue(identifier.validateIdentifier("Z"));
    }

    @Test
    void testInvalidIdentifiers() {
        assertFalse(identifier.validateIdentifier("123abc"));
        assertFalse(identifier.validateIdentifier("!@#$"));
        assertFalse(identifier.validateIdentifier("umastringmuitolonga"));
    }

    @Test
    void testEmptyString() {
        assertFalse(identifier.validateIdentifier(""));
    }

    @Test
    void testSingleCharacterInvalid() {
        assertFalse(identifier.validateIdentifier("1"));
        assertFalse(identifier.validateIdentifier("%"));
    }
}
