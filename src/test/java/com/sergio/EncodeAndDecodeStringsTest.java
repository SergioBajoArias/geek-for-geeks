package com.sergio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EncodeAndDecodeStringsTest {
    EncodeAndDecodeStrings encodeAndDecodeStrings = new EncodeAndDecodeStrings();

    @Test
    public void testEncodeAndDecodeStrings() {
        assertEquals(new String[] {"Hello","World"});
        assertEquals(new String[] {"abc","!@"});
    }

    private void assertEquals(String[] array) {
        Assertions.assertArrayEquals(array, encodeAndDecodeStrings.decode(encodeAndDecodeStrings.encode(array)));
    }

}