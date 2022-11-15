import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

@DisplayName("Minimal penalty points")
@SuppressWarnings("unused")
class Task01Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(1, 2, 1),
                Arguments.of(2, 1, 1),
                Arguments.of(-3, 2, -3),
                Arguments.of(2, -3, -3),
                Arguments.of(-5, -4, -5),
                Arguments.of(0, 0, 0)
        );
    }
