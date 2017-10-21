package tutorial.crayfish;
//This is the main class. should be the name of the mod.

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;


@Mod(modid = "cftm",name = "Tutorial Mod",version = "1.0")

public class TutorialMod {

    // wash rinse repeat for each item.
    // public static Item itemName (must be static)
    // make sure there's a GameRegistry.registerItem line
    // create class. make sure it extends item.
    // set unlocalized name and texture(must be .png, store in textures folder.)
    // define item name in en_US.lang



    public static Item itemTable; //itemTable = name of item;
    public static Item itemCheese; //demo food (cookable)
    public static Item itemGrilledCheese; //demo cooked food

    public static Item cheesePickAxe;
    public static Item cheeseAxe;
    public static Item cheeseShovel;
    public static Item cheeseHoe;
    public static Item cheeseSword;

    public static final Item.ToolMaterial cheeseToolMaterial =
            EnumHelper.addToolMaterial(
                    "cheeseToolMaterial", //must be tool material name
                    4,//3 = dia hardness,2 iron, 1 stone, 0 wood.
                    2000, //dia = either 1k or 1561(check later)
                    20.0F, //dia 8F, Fe 6F, Stone 4F
                    5.00F, //dia 3F, Fe 2F, Stone 1F
                    20); //dia 10

    // wash rinse repeat for each block.
    // public static Block itemName (must be static)
    // make sure there's a GameRegistry.registerItem line
    // create class. make sure it extends item.
    // set unlocalized name and texture(must be .png, store in textures folder.)
    // define block name in en_US.lang tile.BlockTable.name=Table
    public static Block blockTable; //like items but with blocks

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        //item/block init and reg.
        //cfg handling

        //Items
        itemTable = new ItemTable().setUnlocalizedName("ItemTable") //item.itemTable
        //can be tacked onto end of above line, newline for reference. naming is modid:imgName, no extension
                .setTextureName("cftm:itemtable")
                //substring 5 returns itemTable (item.itemTable - item.)
                .setCreativeTab(tabcftm);


        itemCheese = new ItemFood
                (8,0.5F,false)//(hunger int 0-20,saturation float 0-1,wolf food)
                .setUnlocalizedName("ItemCheese")
                .setTextureName("cftm:itemcheese")
                .setCreativeTab(tabcftm);

        itemGrilledCheese = new ItemFood(16,1.0F,true)
                .setUnlocalizedName("ItemGrilledCheese")
                .setTextureName("cftm:itemgrilledcheese")
                .setCreativeTab(tabcftm);

        //tool items
        cheeseAxe = new ItemCheeseAxe(cheeseToolMaterial)
                .setCreativeTab(tabcftm)
                .setTextureName("cftm:itemcheeseaxe")
                .setUnlocalizedName("ItemCheeseAxe");
        cheeseHoe = new ItemCheeseHoe(cheeseToolMaterial)
                .setCreativeTab(tabcftm)
                .setTextureName("cftm:itemcheesehoe")
                .setUnlocalizedName("ItemCheeseHoe");
        cheesePickAxe = new ItemCheesePickAxe(cheeseToolMaterial)
                .setCreativeTab(tabcftm)
                .setTextureName("cftm:itemcheesepickaxe")
                .setUnlocalizedName("ItemCheesePickAxe");
        cheeseShovel = new ItemCheeseShovel(cheeseToolMaterial)
                .setCreativeTab(tabcftm)
                .setTextureName("cftm:itemcheeseshovel")
                .setUnlocalizedName("ItemCheeseShovel"); //use ItemSpade class for shovels.
        cheeseSword = new ItemCheeseSword(cheeseToolMaterial)
                .setCreativeTab(tabcftm)
                .setTextureName("cftm:itemcheesesword")
                .setUnlocalizedName("ItemCheeseSword");

        //register item
        GameRegistry.registerItem(itemTable,itemTable.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemCheese,itemCheese.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemCheese,itemCheese.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemGrilledCheese,itemGrilledCheese.getUnlocalizedName().substring(5));
        GameRegistry.addSmelting(itemCheese,new ItemStack(itemGrilledCheese),1.0F); //smelting recipe

        //Blocks
        blockTable = new BlockTable(Material.wood)
                .setBlockName("BlockTable")
                .setBlockTextureName("cftm:blocktable")
                .setCreativeTab(tabcftm);

        //register block
        GameRegistry.registerBlock(blockTable,blockTable.getUnlocalizedName().substring(5));

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){
        //proxy, tileEntity, entity, gui, and pkt init/reg

        //recipes
        GameRegistry.addRecipe(new ItemStack(itemTable),
                new Object[]{"WWW"," W "," W ", 'W', Blocks.planks});
        GameRegistry.addRecipe(new ItemStack(blockTable,1),//(output,qty)
                new Object[]{"CRC","RRR","CRC",'C', Blocks.coal_block,'R', Items.redstone});//multi material

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){




    }
    public static CreativeTabs tabcftm = new CreativeTabs("CrayfishTutorial"){
        @Override
        public Item getTabIconItem() {
            return new ItemStack(itemCheese).getItem();
        }
    };
}
