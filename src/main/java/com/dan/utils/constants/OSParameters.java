package com.dan.utils.constants;

import java.util.HashMap;
import java.util.Map;

public class OSParameters {
    // Operating systems
    private static final int LINUX = 0;

    // OS data
    private static final String[] mOSDocumentPaths = {"/Documents"};

    private static int getOperatingSystem() {
        String operatingSystem = System.getProperty("os.name").toLowerCase();


        if (operatingSystem.contains("nix") || operatingSystem.contains("nux") || operatingSystem.indexOf("aix") > 0) {
            return (0);
        }

        return (-1);
    }

    public static String getDocumentsPath() {
        return (System.getProperty("user.home") + mOSDocumentPaths[getOperatingSystem()]);
    }
}