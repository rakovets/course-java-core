

import com.rakovets.course.java.core.practice.TextMonitoring;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TextMonitoringTest {
    @Test
    void textMonitoringTest() {
        String text = "This is testing Program testing Program";
        TextMonitoring textMonitoring = new TextMonitoring();
        textMonitoring.researchText(text);
        assertEquals(4, textMonitoring.getCountUniqueWords());
        assertEquals("[Program, testing, This, is]", textMonitoring.getUniqueWords().toString());
        assertEquals(2, textMonitoring.getFrequencyWord("Program"));
        assertEquals("{This=1, is=1, Program=2, testing=2}",
                textMonitoring.getFrequencyWords(true).toString());
        assertEquals("{Program=2, testing=2, This=1, is=1}",
                textMonitoring.getFrequencyWords(false).toString());
}
