package com.tatyushevms.countletters;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class SimpleLetterCounterTest {
    
    private final SimpleLetterCounter letterCounter = new SimpleLetterCounter();
    
    @Test
    @DisplayName("Letters are counted")
    void count() {
        assertThat(letterCounter.count("aabbcc"), is(equalTo("a2b2c2")));
        assertThat(letterCounter.count("aaaabc"), is(equalTo("a4b1c1")));
        assertThat(letterCounter.count("abc"), is(equalTo("a1b1c1")));
        assertThat(letterCounter.count("abbbaaaacc"), is(equalTo("a5b3c2")));
        assertThat(letterCounter.count("azc"), is(equalTo("a1z1c1")));
    }
    
    @Test
    @DisplayName("Order is kept")
    void order() {
        assertThat(letterCounter.count("azc"), is(equalTo("a1z1c1")));
    }
    
}
