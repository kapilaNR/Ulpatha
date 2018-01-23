package com.ulpatha.util;

import java.util.Arrays;

/**
 * Created by Kapila on 1/22/2018.
 */
public class TemplateSchema {

    private String name;
    private String version;
    private String description;
    private String size;
    private Arrays metadata;

    public TemplateSchema() {
    }

    public TemplateSchema(String name, String version, String description, String size, Arrays metadata) {
        this.name = name;
        this.version = version;
        this.description = description;
        this.size = size;
        this.metadata = metadata;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Arrays getMetadata() {
        return metadata;
    }

    public void setMetadata(Arrays metadata) {
        this.metadata = metadata;
    }
}

