package dev.cloudy.hub.util;

import dev.cloudy.hub.Atlas;
import lombok.experimental.UtilityClass;

/**
 * @author Emmy
 * @project Atlas
 * @date 10/09/2024 - 20:36
 */
@UtilityClass
public class ProjectInfo {

    private final Atlas plugin = Atlas.getInstance();

    public String NAME = plugin.getDescription().getName();
    public String FANCY_NAME = "&d[&5" + NAME + "&d] ";
    public String ERROR_NAME = "&c[&4" + NAME + "&c] ";
    public String VERSION = plugin.getDescription().getVersion();
    public String AUTHOR = plugin.getDescription().getAuthors().get(0);
    public String WEBSITE = plugin.getDescription().getWebsite();
    public String DESCRIPTION = plugin.getDescription().getDescription();

}
