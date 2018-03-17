package com.dan.musicPlayer.utils.files.resources;

import com.dan.musicPlayer.utils.files.resources.interfaces.IResourceReader;

import java.io.InputStream;
import java.util.HashMap;

public class ResourceManager {
    private static HashMap<String, Resource> mResources = new HashMap<>();
    private static HashMap<ResourceType, IResourceReader> mReader = new HashMap<>();

    static {
        mResources.put("imgHamburger", new Resource("blalba", ResourceType.IMG));

        mReader.put(ResourceType.IMG, ResourceManager::getImage);
    }

    public static <T> T get(String resourceName) {
        Resource resource = mResources.get(resourceName);

        return ((T) mReader.get(resource.type).read(resource.filePath));
    }

    public static <T> T get(String filePath, ResourceType fileType) {
        return (T) mReader.get(fileType).read(filePath);
    }

    private static InputStream getImage(String filePath) {
        return (ResourceManager.class.getResourceAsStream(filePath));
    }
}
