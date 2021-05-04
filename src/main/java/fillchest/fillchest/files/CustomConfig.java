package fillchest.fillchest.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class CustomConfig   {
    private static File file;
    private static FileConfiguration customFile;

    public static void setup(){
        file = new File(Bukkit.getServer().getPluginManager().getPlugin("RandomChestFill").getDataFolder(), "config.yaml");

        if(!file.exists()){
            try{
                file.createNewFile()
            }catch(IOException e){

            }
        }
        customFile = YamlConfiguration.loadConfiguration(file);
    }
}
