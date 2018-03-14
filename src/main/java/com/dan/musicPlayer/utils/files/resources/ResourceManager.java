package com.dan.musicPlayer.utils.files.resources;

import javafx.scene.image.Image;

import java.util.HashMap;

public class ResourceManager {
    private static HashMap<String, Resource> mResources = new HashMap<>();
    private static HashMap<ResourceType, IResourceReader> mExtractor = new HashMap<>();

    static {
        mResources.put("imgHamburger", new Resource("blalba", ResourceType.IMG));

        mExtractor.put(ResourceType.IMG, ResourceManager::getImage);
    }

    public static <T> T get(String resourceName) {
        Resource resource = mResources.get(resourceName);

        return ((T) mExtractor.get(resource.type).read(resource.filePath));
    }

    private static Image getImage(String filePath) {
        return (new Image(ResourceManager.class.getResourceAsStream(filePath)));
    }
}
