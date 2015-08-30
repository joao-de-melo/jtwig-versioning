package org.jtwig.version;

public class NextVersionFinder {
    public String nextVersion (String currentVersion) {
        int indexOfDot = currentVersion.lastIndexOf(".") + 1;
        String prefix = currentVersion.substring(0, indexOfDot);
        int number = Integer.valueOf(currentVersion.substring(indexOfDot));

        return prefix + (number + 1);
    }
}
