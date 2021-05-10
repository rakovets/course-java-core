
import com.rakovets.course.java.core.practice.io.FileAnalyzeUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

class FileAnalyzeUtilTest {
    @Test
    void getTextInLinesListTest() {
        Path filePath = Paths.get("src", "main", "resources", "practice", "listWithTextSource");

        List<String> actual = FileAnalyzeUtil.getTextInLinesList(filePath);

        Assertions.assertEquals("[Africa, It-academy, Java]", actual.toString());
    }

    @Test
    void getWordStartWithVowelListTest() {
        Path filePath = Paths.get("src", "main", "resources", "practice", "getWordStartWithVowelListSource");

        List<String> actual = FileAnalyzeUtil.getWordStartWithVowelList(filePath);

        Assertions.assertEquals("[Africa, africa, it-academy, y, ycademy]", actual.toString());
    }

    @Test
    void getWordLastCharEqualFirstCharNextWordTest() {
        Path filePath = Paths.get("src", "main", "resources", "practice", "getWordStartWithVowelListSource");

        List<String> actual = FileAnalyzeUtil.getWordLastCharEqualFirstCharNextWord(filePath);

        Assertions.assertEquals("[frica, it-academy, y]", actual.toString());
    }

    @Test
    void listOfLargestNumberCombinationTest() {
        Path filePath = Paths.get("src", "main", "resources", "practice", "listOfLargestNumberCombinationSource");

        List<String> actual = FileAnalyzeUtil.listOfLargestNumberCombination(filePath);

        Assertions.assertEquals("[[1, 2, 3], [1, 2, 3], [1, 2, 3], [1, 2, 3, 4, 5]]", actual.toString());
    }

    @Test
    void getCharFrequencyTest() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("p", 4);
        expected.put("r", 1);
        expected.put("i", 1);
        expected.put("v", 1);
        expected.put("e", 1);
        expected.put("t", 2);

        Path filePath = Paths.get("src", "main", "resources", "practice", "getCharFrequencySource");

        Map<Character, Integer> actual = FileAnalyzeUtil.getCharFrequency(filePath);

        Assertions.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void getStringFrequency() {
        Path filePath = Paths.get("src", "main", "resources", "practice", "getStringFrequencySource");

        Map<String, Integer> actual = FileAnalyzeUtil.getStringFrequency(filePath);

        Assertions.assertEquals("{Mother=5, Father=3, I=2}", actual.toString());
    }
}
