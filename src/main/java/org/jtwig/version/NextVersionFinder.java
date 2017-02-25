package org.jtwig.version;

public class NextVersionFinder {
    public String nextVersion (String currentVersion) {
        if (currentVersion == null) {
            return "1.0";
        } else if (currentVersion.endsWith(".RELEASE")) {
            return getVersion(currentVersion.substring(0, currentVersion.lastIndexOf("."))) + ".RELEASE";
        } else {
            return getVersion(currentVersion);
        }
    }

    private String getVersion(String currentVersion) {
        int indexOfDot = currentVersion.lastIndexOf(".") + 1;
        String prefix = currentVersion.substring(0, indexOfDot);
        int number = Integer.valueOf(currentVersion.substring(indexOfDot));
        return prefix + (number + 1);
    }
}
