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
        if (this.armorType == 2){
            return "cftm:textures/models/armor/cheese_layer_2.png";

        }
        return "cftm:textures/models/armor/cheese_layer_1.png";
    }
}
