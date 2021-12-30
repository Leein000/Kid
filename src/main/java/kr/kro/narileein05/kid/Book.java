package kr.kro.narileein05.kid;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class Book extends JavaPlugin {

    @Override
    public void onEnable() {
            System.out.println("플러그인이 활성화되었습니다");
        }

    @Override
    public void onDisable() {
            System.out.println("플러그인이 비활성화되었습니다");
        }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("플레이어가 쳐주세요");
        }

        if (cmd.getName().equalsIgnoreCase("realRandom")) {

            Random r = new Random();
            Player p = (Player) sender;

            List<Material> list = Arrays.asList(
                    Material.DIAMOND_PICKAXE,
                    Material.DIAMOND_SWORD,
                    Material.DIAMOND_AXE);
            new Random().nextInt(3);
            list.get(3);
            int rInt = new Random(3).nextInt(list.size());
            ItemStack item = new ItemStack(list.get(rInt));
            p.getInventory().addItem(item);

        }

        if(cmd.getName().equalsIgnoreCase("random")) {

            Random r = new Random();
            Player p = (Player) sender;
            Inventory inv = p.getInventory();
            switch (r.nextInt(3)) {//0 ~ 450 20 0 19

                case 0 -> inv.addItem(new ItemStack(Material.DIAMOND_PICKAXE));
                case 1 -> inv.addItem(new ItemStack(Material.DIAMOND_SWORD));
                case 2 -> inv.addItem(new ItemStack(Material.DIAMOND_AXE));
                }
            }

            return false;
        }

    }
