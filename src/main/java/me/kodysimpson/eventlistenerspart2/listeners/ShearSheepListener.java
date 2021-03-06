package me.kodysimpson.eventlistenerspart2.listeners;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class ShearSheepListener implements Listener {

    @EventHandler
    public void onSheepShear(PlayerShearEntityEvent e){

        //get the player who sheared the sheep
        Player player = e.getPlayer();

        //check to see if the entity that was sheared was a sheep
        //if it was, cancel the event to prevent it from being sheared
        //if it wasnt, let it be sheared
        if (e.getEntity().getType() == EntityType.SHEEP){
            player.sendMessage("This is a sheep. You can't do that.");
            e.setCancelled(true); //cancel the event. Provided by Cancellable interface
        }else{
            player.sendMessage("This is not a sheep.");
        }

    }

}
