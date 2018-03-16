package com.dan.musicPlayer.utils.files;

import com.dan.musicPlayer.utils.constants.OSParameters;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;

public class ConfigReader {
    // Constants
    private static final String DEFAULT_SETTINGS = "{\n" +
            "\ttheme: dark\n" +
    "}\n";

    // Members
    private static ConfigReader instance = new ConfigReader();
    public static JsonObject configuration;

    public static ConfigReader getInstance() {
        return instance;
    }

    private ConfigReader() {
        configuration = new JsonObject();
        File configFile = new File(OSParameters.getDocumentsPath() + "/musicPlayer.config");

        try {
            if (configFile.createNewFile()) {
                writeDefaultSettings(configFile);
            }

            try (BufferedReader reader = new BufferedReader(new FileReader(configFile))) {
                StringBuilder config = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    config.append(line);
                }

                configuration = new JsonParser().parse(config.toString()).getAsJsonObject();
            } catch (Exception e) {

            }
        } catch (IOException e) {
            System.out.println("Failed to create config file: " + e.getMessage());
        }
    }

    private void writeDefaultSettings(File configFile) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(configFile));
            writer.write(DEFAULT_SETTINGS);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public JsonElement getParameter(String property) {
        return (configuration.get(property));
    }
}
