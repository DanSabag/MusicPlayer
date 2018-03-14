package com.dan.musicPlayer.utils.files.resources;

public class Resource {
    String filePath;
    ResourceType type;

    public Resource(String filePath, ResourceType type) {
        this.filePath = filePath;
        this.type = type;
    }
}
