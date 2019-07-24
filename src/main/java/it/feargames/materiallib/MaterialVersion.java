package it.feargames.materiallib;

import it.feargames.materiallib.utilities.ServerVersion;
import it.feargames.materiallib.utilities.ServerVersionInterval;

public class MaterialVersion {
    private final String name;
    private final ServerVersionInterval validVersions;

    private MaterialVersion(String name, ServerVersionInterval validVersions) {
        this.name = name;
        this.validVersions = validVersions;
    }

    public String getName() {
        return name;
    }

    public ServerVersionInterval getValidVersions() {
        return validVersions;
    }

    public static MaterialVersion sinceRelease(String name) {
        return since(name, null);
    }

    public static MaterialVersion since(String name, ServerVersion since) {
        return new MaterialVersion(name, ServerVersionInterval.since(since));
    }

    public static MaterialVersion until(String name, ServerVersion until) {
        return new MaterialVersion(name, ServerVersionInterval.until(until));
    }

    public static MaterialVersion between(String name, ServerVersion since, ServerVersion until) {
        return new MaterialVersion(name, ServerVersionInterval.between(since, until));
    }
}
