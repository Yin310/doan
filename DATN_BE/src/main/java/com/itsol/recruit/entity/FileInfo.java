package com.itsol.recruit.entity;

import lombok.Data;

@Data
public class FileInfo {
    private String name;
    private String url;

    public FileInfo(String filename, String url) {
    }
}
