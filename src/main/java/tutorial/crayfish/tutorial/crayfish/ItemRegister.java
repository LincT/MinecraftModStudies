package tutorial.crayfish.tutorial.crayfish;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import tutorial.crayfish.ItemCheeseStick;
import tutorial.crayfish.ItemTable;

public class ItemRegister {
    static Item itemTable; //itemTable = name of item;
    static Item itemCheeseStick;
    public static Item itemCheese; //demo food (smelting recipe)
    static Item itemGrilledCheese; //demo cooked food

    public ItemRegister(){
        //basic items


        //Items
        //TODO figure out why generated texture string fails to compile.
//        String textureString =
//                TutorialMod.MODID + ":"+ TutorialMod.itemTable.getUnlocalizedName().toLowerCase().substring(5);
        String textureString = "cftm:itemtable";
        itemTable = new ItemTable().setUnlocalizedName("ItemTable") //item.itemTable
                //can be tacked onto end of above line, newline for reference.
                // naming is modid:imgName, no extension, all lowercase

                .setTextureName(textureString)
                //substring 5 returns itemTable (item.itemTable - item.)
                .setCreativeTab(CreativeTabRegister.tabcftm);

        itemCheeseStick = new ItemCheeseStick().setUnlocalizedName("ItemCheeseStick")
                .setTextureName("blaze_rod")//using existing texture from minecraft vanilla.
                .setCreativeTab(CreativeTabRegister.tabcftm);

        //food items
        itemCheese = new ItemFood
                (8,0.5F,false)//(hunger int 0-20,saturation float 0-1,wolf food)
                .setUnlocalizedName("ItemCheese")
                .setTextureName("cftm:itemcheese")
                .setCreativeTab(CreativeTabRegister.tabcftm);

        itemGrilledCheese = new ItemFood
                (16,1.0F,true)
                .setUnlocalizedName("ItemGrilledCheese")
                .setTextureName("cftm:itemgrilledcheese")
                .setCreativeTab(CreativeTabRegister.tabcftm);

        //register everything
        GameRegistry.registerItem(itemTable,itemTable.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemCheeseStick,itemCheeseStick.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemCheese,itemCheese.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemGrilledCheese,itemGrilledCheese.getUnlocalizedName().substring(5));

    }

}
