package tutorial.crayfish;

import com.mojang.realmsclient.dto.PlayerInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionHelper;
import net.minecraft.world.World;

public class ItemCheeseStick extends Item{
    public ItemCheeseStick(){
        this.setFull3D(); //render like tool, w/out renders like item
        this.setNoRepair();//disable repair crafting recipe or anvil
        //this.setContainerItem(Items.bucket); // was it a liquid and you want the bucket back? only for crafting table
        this.setMaxStackSize(16); //how many items in a single stack
        //this.setMaxDamage(1000); //if a machine can damage item, sets item health bar, TODO:MORE LATER
        this.setPotionEffect(PotionHelper.blazePowderEffect);//effect added to potions when brewing.
        //this.createEntity();
    }
}
