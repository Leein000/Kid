package kr.kro.minestar

import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    companion object {
        var pl: Main? = null
        const val prefix = "§f§7MineCraftDefaultProject§f"
    }

    override fun onEnable() {
        pl = this
        logger.info("$prefix §aEnable")
        getCommand("cmd")?.setExecutor(CMD())
    }

    override fun onDisable() {
    }
}