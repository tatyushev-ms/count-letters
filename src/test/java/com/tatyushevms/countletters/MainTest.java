package com.tatyushevms.countletters;

import com.ginsberg.junit.exit.ExpectSystemExitWithStatus;
import com.github.blindpirate.extensions.CaptureSystemOutput;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("Execution tests")
class MainTest {
    
    @DisplayName("Handles invalid amount of parameters")
    @ParameterizedTest(name = ParameterizedTest.INDEX_PLACEHOLDER + ") " + ParameterizedTest.ARGUMENTS_PLACEHOLDER)
    @MethodSource("zeroOrMultipleParameters")
    @CaptureSystemOutput
    @ExpectSystemExitWithStatus(1)
    void handlesInvalidAmountOfParameters(String[] args, CaptureSystemOutput.OutputCapture outputCapture) {
        assertThrows(SecurityException.class, () -> Main.main(args));
        
        outputCapture.expect(containsString("An only input parameter was expected: a word"));
    }
    
    static Stream<Arguments> zeroOrMultipleParameters() {
        return Stream.of(
                arguments((Object) new String[]{}),
                arguments((Object) new String[]{"aaaabc", "abbbaaaacc"})
        );
    }
    
}
