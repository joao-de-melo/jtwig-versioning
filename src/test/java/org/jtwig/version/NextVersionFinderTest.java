package org.jtwig.version;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NextVersionFinderTest {
    private NextVersionFinder underTest = new NextVersionFinder();

    @Test
    public void nextVersion() throws Exception {
        String result = underTest.nextVersion("1.10");

        assertThat(result, is("1.11"));
    }
}