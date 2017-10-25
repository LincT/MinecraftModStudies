package tutorial.crayfish;
//This is the main class. should be the name of the mod.

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import tutorial.crayfish.didactic.BlockArenaPortal;
import tutorial.crayfish.didactic.CommandTutorial;
import tutorial.crayfish.didactic.GUIBlock;


@Mod(modid = "cftm",name = "Tutorial Mod",version = "1.0")

public class TutorialMod {

    // wash rinse repeat for each item.
    // public static Item itemName (must be static)
    // make sure there's a GameRegistry.registerItem line
    // create class. make sure it extends item.
    // set unlocalized name and texture(must be .png, store in textures folder.)
    // define item name in en_US.lang


    //basic items
    public static Item itemTable; //itemTable = name of item;
    public static Item itemCheeseStick;
    public static Item itemCheese; //demo food (cookable)
    public static Item itemGrilledCheese; //demo cooked food

    //tools/weapons
    public static Item cheesePickaxe;
    public static Item cheeseAxe;
    public static Item cheeseShovel;
    public static Item cheeseHoe;
    public static Item cheeseSword;

    //armor
    public static Item cheeseHelm;
    public static Item cheeseChestPlate;
    public static Item cheeseLeggings;
    public static Item cheeseBoots;

    //blocks
    public static Block blockCheese;
    public static Block blockArenaPortal;

    public static final Item.ToolMaterial cheeseToolMaterial =
            EnumHelper.addToolMaterial(
                    "cheeseToolMaterial", //must be tool material name
                    4,//3 = dia hardness,2 iron, 1 stone, 0 wood.
                    2000, //dia = either 1k or 1561(check later)
                    20.0F, //dia 8F, Fe 6F, Stone 4F
                    5.00F, //dia 3F, Fe 2F, Stone 1F
                    20); //dia 10

    public static final ItemArmor.ArmorMaterial cheeseArmorMaterial =
            EnumHelper.addArmorMaterial(
                    "cheeseArmorMaterial",
                    5000,
                    new int[]{4,14,10,6},//{H,C,L,B} int 1/2 hearts, max 20 per param, reduces dur by amt absorbed.
                    20
            );

    // wash rinse repeat for each block.
    // public static Block itemName (must be static)
    // make sure there's a GameRegistry.registerItem line
    // create class. make sure it extends item.
    // set unlocalized name and texture(must be .png, store in textures folder.)
    // define block name in en_US.lang tile.BlockTable.name=Table

    public static Block blockTable; //like items but with blocks
    public static Block guiBlock;

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

        itemCheeseStick = new ItemCheeseStick().setUnlocalizedName("ItemCheeseStick")
                .setTextureName("blaze_rod")//using existing texture from minecraft vanilla.
                .setCreativeTab(tabcftm);

        //food items
        itemCheese = new ItemFood
                (8,0.5F,false)//(hunger int 0-20,saturation float 0-1,wolf food)
                .setUnlocalizedName("ItemCheese")
                .setTextureName("cftm:itemcheese")
                .setCreativeTab(tabcftm);

        itemGrilledCheese = new ItemFood
                (16,1.0F,true)
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
        cheesePickaxe = new ItemCheesePickAxe(cheeseToolMaterial)
                .setCreativeTab(tabcftm)
                .setTextureName("cftm:itemcheesepickaxe")
                .setUnlocalizedName("ItemCheesePickaxe");
        cheeseShovel = new ItemCheeseShovel(cheeseToolMaterial)
                .setCreativeTab(tabcftm)
                .setTextureName("cftm:itemcheeseshovel")
                .setUnlocalizedName("ItemCheeseShovel"); //use ItemSpade class for shovels.
        cheeseSword = new ItemCheeseSword(cheeseToolMaterial)
                .setCreativeTab(tabcftm)
                .setTextureName("cftm:itemcheesesword")
                .setUnlocalizedName("ItemCheeseSword");

        //armors
        cheeseHelm = new ItemCheeseArmor(cheeseArmorMaterial,0,0)
                .setCreativeTab(tabcftm)
                .setTextureName("cftm:itemcheesehelm")
                .setUnlocalizedName("ItemCheeseHelm");
        cheeseChestPlate = new ItemCheeseArmor(cheeseArmorMaterial,0,1)
                .setCreativeTab(tabcftm)
                .setTextureName("cftm:itemcheesechest")
                .setUnlocalizedName("ItemCheeseChest");
        cheeseLeggings = new ItemCheeseArmor(cheeseArmorMaterial,0,2)
                .setCreativeTab(tabcftm)
                .setTextureName("cftm:itemcheeselegs")
                .setUnlocalizedName("ItemCheeseLeggings");
        cheeseBoots = new ItemCheeseArmor(cheeseArmorMaterial,0,3)
                .setCreativeTab(tabcftm)
                .setTextureName("cftm:itemcheeseboots")
                .setUnlocalizedName("ItemCheeseBoots");

        //register item
        GameRegistry.registerItem(itemTable,itemTable.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemCheeseStick,itemCheeseStick.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemCheese,itemCheese.getUnlocalizedName().substring(5));

        GameRegistry.registerItem(cheeseAxe,cheeseAxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheeseSword,cheeseSword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheeseShovel,cheeseShovel.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheesePickaxe, cheesePickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheeseHoe,cheeseHoe.getUnlocalizedName().substring(5));

        GameRegistry.registerItem(cheeseHelm,cheeseHelm.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheeseChestPlate,cheeseChestPlate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheeseLeggings,cheeseLeggings.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheeseBoots,cheeseBoots.getUnlocalizedName().substring(5));

        GameRegistry.registerItem(itemGrilledCheese,itemGrilledCheese.getUnlocalizedName().substring(5));

        GameRegistry.registerWorldGenerator(
                //TODO figure out weight parameter
                new CheeseGeneration(),0);


        //Blocks
        blockTable = new BlockTable(Material.wood)
                .setBlockName("BlockTable")
                .setBlockTextureName("cftm:blocktable")
                .setCreativeTab(tabcftm);

        blockCheese = new BlockCheese(Material.rock)
                .setBlockName("BlockCheese")
                .setCreativeTab(tabcftm)
                .setBlockTextureName("cftm:blockcheese");

        guiBlock = new GUIBlock(Material.glass)
                .setBlockName("BlockGUI")
                .setCreativeTab(tabcftm);

        blockArenaPortal = new BlockArenaPortal()
                .setBlockName("BlockArenaPortal")
                .setCreativeTab(tabcftm)
                .setBlockTextureName("portal");

        //register block
        GameRegistry.registerBlock(blockTable,blockTable.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockCheese,blockCheese.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(guiBlock,guiBlock.getUnlocalizedName().substring(5));

    }
    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent event)
    {
        // register server commands

        event.registerServerCommand(new CommandTutorial());
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){
        //proxy, tileEntity, entity, gui, and pkt init/reg

        //recipes
        GameRegistry.addRecipe(new ItemStack(itemTable),
                new Object[]{"WWW"," W "," W ", 'W', Blocks.planks});
        GameRegistry.addRecipe(new ItemStack(blockTable,1),//(output,qty)
                new Object[]{"CRC","RRR","CRC",'C', Blocks.coal_block,'R', Items.redstone});//multi material
        GameRegistry.addRecipe(new ItemStack(cheeseAxe),
                new Object[]{"CC","SC","S ",'C',itemCheese,'S',Items.stick});
        GameRegistry.addRecipe(new ItemStack(cheeseSword),
                new Object[]{"C","C","S",'C',itemCheese,'S',Items.stick});
        GameRegistry.addRecipe(new ItemStack(cheeseHoe),
                new Object[]{"CC","S ","S ",'C',itemCheese,'S',Items.stick});
        GameRegistry.addRecipe(new ItemStack(cheeseShovel),
                new Object[]{"C","S","S",'C',itemCheese,'S',Items.stick});//if spaces line up, can omit from recipe.
        GameRegistry.addRecipe(new ItemStack(cheesePickaxe),
                new Object[]{"CCC"," S "," S ",'C',itemCheese,'S',Items.stick});
        GameRegistry.addRecipe(new ItemStack(blockCheese),
                new Object[]{"CCC","CCC","CCC",'C',itemCheese});
        GameRegistry.addRecipe(new ItemStack(itemCheeseStick),
                new Object[]{"C "," C",'C',itemCheese});
        GameRegistry.addRecipe(new ItemStack(cheeseHelm),
                new Object[]{"CCC","C C",'C',itemCheese});
        GameRegistry.addRecipe(new ItemStack(cheeseChestPlate),
                new Object[]{"C C","CCC","CCC",'C',itemCheese});
        GameRegistry.addRecipe(new ItemStack(cheeseLeggings),
                new Object[]{"CCC","C C","C C",'C',itemCheese});
        GameRegistry.addRecipe(new ItemStack(cheeseBoots),
                new Object[]{"C C","C C",'C',itemCheese});

        //Shapeless recipes
        GameRegistry.addShapelessRecipe(new ItemStack(itemCheese,8),
                Items.fermented_spider_eye,
                Items.milk_bucket);//returns 8 cheese and empty bucket.

        //smelting recipes
        GameRegistry.addSmelting(itemCheese,new ItemStack(itemGrilledCheese),1.0F); //smelting recipe


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
