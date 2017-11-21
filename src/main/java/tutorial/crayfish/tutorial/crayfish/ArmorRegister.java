package tutorial.crayfish.tutorial.crayfish;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import tutorial.crayfish.ItemCheeseArmor;

public class ArmorRegister {
    //armors and armor materials
    static Item cheeseHelm;
    static Item cheeseChestPlate;
    static Item cheeseLeggings;
    static Item cheeseBoots;
    public ArmorRegister(){

        cheeseHelm = new ItemCheeseArmor(cheeseArmorMaterial,0,0)
                .setCreativeTab(CreativeTabRegister.tabcftm)
                .setTextureName("cftm:itemcheesehelm")
                .setUnlocalizedName("ItemCheeseHelm");
        cheeseChestPlate = new ItemCheeseArmor(cheeseArmorMaterial,0,1)
                .setCreativeTab(CreativeTabRegister.tabcftm)
                .setTextureName("cftm:itemcheesechest")
                .setUnlocalizedName("ItemCheeseChest");
        cheeseLeggings = new ItemCheeseArmor(cheeseArmorMaterial,0,2)
                .setCreativeTab(CreativeTabRegister.tabcftm)
                .setTextureName("cftm:itemcheeselegs")
                .setUnlocalizedName("ItemCheeseLeggings");
        cheeseBoots = new ItemCheeseArmor(cheeseArmorMaterial,0,3)
                .setCreativeTab(CreativeTabRegister.tabcftm)
                .setTextureName("cftm:itemcheeseboots")
                .setUnlocalizedName("ItemCheeseBoots");

        GameRegistry.registerItem(cheeseHelm,cheeseHelm.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheeseChestPlate,cheeseChestPlate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheeseLeggings,cheeseLeggings.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheeseBoots,cheeseBoots.getUnlocalizedName().substring(5));
    }
    public static final ItemArmor.ArmorMaterial cheeseArmorMaterial =
            EnumHelper.addArmorMaterial(
                    "cheeseArmorMaterial",
                    5000,
                    new int[]{4,14,10,6},//{H,C,L,B} int 1/2 hearts, max 20 per param, reduces dur by amt absorbed.
                    20
            );
}
