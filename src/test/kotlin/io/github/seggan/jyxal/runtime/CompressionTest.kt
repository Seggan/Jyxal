package io.github.seggan.jyxal.runtime

import io.github.seggan.jyxal.runtime.text.Compression.decompress
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CompressionTest {
    @Test
    fun testCompress() {
        Assertions.assertEquals("Hello, World!", decompress("\u0188\u1E61, \u019B\u20AC!"))
        Assertions.assertEquals(
            "This is a test String to decompress.",
            decompress("\u03BB\u00AB is a \u2228\u1E0A \u00F8\u1E8F to de\u2022\u215B\u27D1\u013F.")
        )
        Assertions.assertEquals("A test string.", decompress("A test string."))
    }
}