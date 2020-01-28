import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoTest {
    
    @Test
    void toString_valid_success() {
        assertEquals("[T][✘] word1 word2", new Todo("word1 word2").toString());
    }
    
    @Test
    void getFileFormattedLine_valid_success() {
        assertEquals("T|0|word1 word2", new Todo("word1 word2").getFileFormattedLine());
    }
}
