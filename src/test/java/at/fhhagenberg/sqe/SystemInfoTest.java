package at.fhhagenberg.sqe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public class SystemInfoTest {
    @Test
    public void testJavaVersion() {
        assertEquals("13", SystemInfo.javaVersion());
    }

    @Test
    public void testJavafxVersion() {
        assertEquals("11", SystemInfo.javafxVersion());
    }
}