package org.jtwig.version;

import com.jfrog.bintray.client.impl.BintrayClient;

import java.io.IOException;

public class GetVersion {
    public static final String SUBJECT = "jtwig";
    public static final String REPOSITORY = "maven";
    public static final NextVersionFinder NEXT_VERSION_FINDER = new NextVersionFinder();

    public static String version (String user, String key, String repository) throws IOException {
        String latestVersion = BintrayClient.create(user, key).subject(SUBJECT)
                .repository(REPOSITORY)
                .pkg(repository)
                .get().latestVersion();

        return NEXT_VERSION_FINDER.nextVersion(latestVersion);
    }
}
