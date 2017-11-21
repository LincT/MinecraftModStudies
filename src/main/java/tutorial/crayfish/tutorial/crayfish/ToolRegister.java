package tutorial.crayfish.tutorial.crayfish;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import tutorial.crayfish.*;

public class ToolRegister {
    //tools and weapons
    static Item cheesePickaxe;
    static Item cheeseAxe;
    static Item cheeseShovel;
    static Item cheeseHoe;
    static Item cheeseSword;
    public ToolRegister(){


        cheeseAxe = new ItemCheeseAxe(cheeseToolMaterial)
                .setCreativeTab(CreativeTabRegister.tabcftm)
                .setTextureName("cftm:itemcheeseaxe")
                .setUnlocalizedName("ItemCheeseAxe");
        cheeseHoe = new ItemCheeseHoe(cheeseToolMaterial)
                .setCreativeTab(CreativeTabRegister.tabcftm)
                .setTextureName("cftm:itemcheesehoe")
                .setUnlocalizedName("ItemCheeseHoe");
        cheesePickaxe = new ItemCheesePickAxe(cheeseToolMaterial)
                .setCreativeTab(CreativeTabRegister.tabcftm)
                .setTextureName("cftm:itemcheesepickaxe")
                .setUnlocalizedName("ItemCheesePickaxe");
        cheeseShovel = new ItemCheeseShovel(cheeseToolMaterial)
                .setCreativeTab(CreativeTabRegister.tabcftm)
                .setTextureName("cftm:itemcheeseshovel")
                .setUnlocalizedName("ItemCheeseShovel"); //use ItemSpade class for shovels.
        cheeseSword = new ItemCheeseSword(cheeseToolMaterial)
                .setCreativeTab(CreativeTabRegister.tabcftm)
                .setTextureName("cftm:itemcheesesword")
                .setUnlocalizedName("ItemCheeseSword");


        //register item

        GameRegistry.registerItem(cheeseAxe,cheeseAxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheeseSword,cheeseSword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheeseShovel,cheeseShovel.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheesePickaxe, cheesePickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheeseHoe,cheeseHoe.getUnlocalizedName().substring(5));

    }

    private static final Item.ToolMaterial cheeseToolMaterial =
            EnumHelper.addToolMaterial(
                    "cheeseToolMaterial", //must be tool material name
                    4,//3 = dia hardness,2 iron, 1 stone, 0 wood.
                    2000, //dia = either 1k or 1561(check later)
                    20.0F, //dia 8F, Fe 6F, Stone 4F
                    5.00F, //dia 3F, Fe 2F, Stone 1F
                    20); //dia 10
}
