package com.extremelyd1.command;

import com.extremelyd1.game.Game;
import com.extremelyd1.util.CommandUtil;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class EndCommand implements CommandExecutor {

    private final Game game;

    public EndCommand(Game game) {
        this.game = game;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (!CommandUtil.checkCommandSender(sender)) {
            return true;
        }

        Bukkit.broadcastMessage(
                Game.PREFIX + "-------------------------"
        );
        Bukkit.broadcastMessage(
                Game.PREFIX + "game has been force-ended"
        );
        Bukkit.broadcastMessage(
                Game.PREFIX + "-------------------------"
        );

        game.end();

        return true;
    }
}
