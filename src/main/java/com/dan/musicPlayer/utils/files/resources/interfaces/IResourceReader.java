package com.dan.musicPlayer.utils.files.resources.interfaces;

@FunctionalInterface
public interface IResourceReader {
    Object read(String filePath);
}
