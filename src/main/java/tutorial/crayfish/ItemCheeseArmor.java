package tutorial.crayfish;


import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemCheeseArmor extends ItemArmor {
    public ItemCheeseArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType) {
        super(armorMaterial, renderIndex, armorType);
    }
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity,int slot, String type){
        //from class on 24/Oct/2017
        return TutorialMod.MODID + ":textures/armor/cheese_layer_" + (this.armorType == 2 ? "2" : "1")+".png";
    }

}
