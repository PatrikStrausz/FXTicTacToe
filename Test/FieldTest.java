import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sample.Field;
import sample.Tile;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {
    private Field field;

    @BeforeEach
    void setUp() {
        field = new Field();


    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isWinner() {

        assertTrue(field.isWinner());
        field.getArr()[1][1].setValue(true);
        assertFalse(field.isWinner());


    }
}