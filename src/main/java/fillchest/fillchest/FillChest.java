package fillchest.fillchest;

import org.bukkit.plugin.java.JavaPlugin;

import fillchest.fillchest.files.CustomConfig;

public final class FillChest extends JavaPlugin {

    @Override
    public void onEnable() {

        CustomConfig.setup();
        CustomConfig.get().options().copyDefaults(true);
        CustomConfig.save();
    }
}
