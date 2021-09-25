package stories.villagerlimit;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.VillagerAcquireTradeEvent;
import org.bukkit.inventory.MerchantRecipe;

public class VillagerTrade implements Listener {
    @EventHandler
    private void VillagerEvent(VillagerAcquireTradeEvent e){
        Villager v = (Villager) e.getEntity();
        Villager.Profession pro = v.getProfession();
        Integer i = -1;
        FileConfiguration c = VillagerLimit.config;
        if(pro.equals(Villager.Profession.ARMORER)){
            i = c.getInt("armorer",-1);
        }else if(pro.equals(Villager.Profession.BUTCHER)){
            i = c.getInt("butcher",-1);
        }else if(pro.equals(Villager.Profession.CARTOGRAPHER)){
            i = c.getInt("cartographer",-1);
        }else if(pro.equals(Villager.Profession.CLERIC)){
            i = c.getInt("cleric",-1);
        }else if(pro.equals(Villager.Profession.FARMER)){
            i = c.getInt("farmer",-1);
        }else if(pro.equals(Villager.Profession.FISHERMAN)){
            i = c.getInt("fisherman",-1);
        }else if(pro.equals(Villager.Profession.FLETCHER)){
            i = c.getInt("fletcher",-1);
        }else if(pro.equals(Villager.Profession.LEATHERWORKER)){
            i = c.getInt("leatherworker",-1);
        }else if(pro.equals(Villager.Profession.LIBRARIAN)){
            i = c.getInt("librarian",-1);
        }else if(pro.equals(Villager.Profession.MASON)){
            i = c.getInt("mason",-1);
        }else if(pro.equals(Villager.Profession.NITWIT)){
            i = c.getInt("nitwit",-1);
        }else if(pro.equals(Villager.Profession.SHEPHERD)){
            i = c.getInt("sheperd",-1);
        }else if(pro.equals(Villager.Profession.TOOLSMITH)){
            i = c.getInt("toolsmith",-1);
        }else if(pro.equals(Villager.Profession.WEAPONSMITH)){
            i = c.getInt("weaponsmith",-1);
        }
        if(i >= 0){
            MerchantRecipe r = e.getRecipe();
            r.setMaxUses(i);
            e.setRecipe(r);
        }
    }
}
