package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.BOTH, ignore_permissions = false)
public class Command_firespread extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (args.length != 1)
        {
            return false;
        }

        if (args[0].equalsIgnoreCase("on"))
        {
            TotalFreedomMod.allowFireSpread = true;
            playerMsg("Fire spread is now enabled.");
        }
        else
        {
            TotalFreedomMod.allowFireSpread = false;
            playerMsg("Fire spread is now disabled.");
        }

        return true;
    }
}
