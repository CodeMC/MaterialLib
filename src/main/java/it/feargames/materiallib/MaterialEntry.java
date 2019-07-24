package it.feargames.materiallib;

import org.bukkit.Material;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class MaterialEntry {
    private final List<MaterialVersion> versions;
    private Material handle;

    private MaterialEntry(List<MaterialVersion> versions) {
        this.versions = Collections.unmodifiableList(versions);
    }

    public List<MaterialVersion> getVersions() {
        return versions;
    }

    public void setHandle(Material material) {
        if (handle != null) {
            throw new IllegalStateException("Already initialized!");
        }
        handle = material;
    }

    public Optional<Material> get() {
        return Optional.ofNullable(handle);
    }

    public Optional<String> getName() {
        return get().map(material -> material.name().toLowerCase());

    }

    public static MaterialEntry fromVersions(MaterialVersion... versions) {
        if (versions.length == 0) {
            throw new IllegalArgumentException("Missing versions!");
        }
        return new MaterialEntry(Arrays.asList(versions));
    }
}
