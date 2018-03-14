package com.dan.musicPlayer.utils.files.resources;

@FunctionalInterface
public interface IResourceReader {
    Object read(String filePath);
}
