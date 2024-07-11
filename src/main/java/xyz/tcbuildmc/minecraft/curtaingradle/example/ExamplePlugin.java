package xyz.tcbuildmc.minecraft.curtaingradle.example;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.tcbuildmc.minecraft.devmetadata.annotation.BukkitPlugin;

@BukkitPlugin(
        name = "CurtainGradleExamplePlugin",
        version = "1.0-SNAPSHOT"
)
public class ExamplePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Hello World!");
    }
}
