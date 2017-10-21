//package linc;
//
//import com.example.examplemod.ExampleMod;
//import cpw.mods.fml.common.Mod;
//import cpw.mods.fml.common.event.FMLInitializationEvent;
//import cpw.mods.fml.common.eventhandler.SubscribeEvent;
//import cpw.mods.fml.common.registry.GameRegistry;
//import javafx.scene.paint.Material;
//import net.minecraft.block.Block;
//import net.minecraft.block.BlockDirt;
//import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.init.Blocks;
//import cpw.mods.fml.common.Mod.EventHandler;
//import net.minecraft.init.Items;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemBlock;
//import net.minecraft.util.*;
//
////@Mod(modid = com.example.examplemod.ExampleMod.MODID, version = com.example.examplemod.ExampleMod.VERSION)
//public class main {
//    public static final String MODID = "PrimaMod";
//    public static final String VERSION = "1.0";
//
//
//
//    public static final CreativeTabs PrimaMod = new CreativeTabs("Prima Mod") {
//        @Override public Item getTabIconItem() {
//            return Items.clock;
//        }
//    };
//
//
//    public static void main(String[] args) {
//
//        BasicBlock block = new BasicBlock("eldritch");
//
//        ItemBlock itemBlock = new ItemBlock(block).setUnlocalizedName(block.getUnlocalizedName());
//        itemBlock.setCreativeTab(PrimaMod);
//        GameRegistry.registerBlock(block,"eldritch");
//
//
//    }
//    public static Block TutoriaBlock =
//            new BasicBlock("TutorialBlock").setCreativeTab(CreativeTabs.tabBlock);
//
//    @Mod.EventHandler
//    public void init(FMLInitializationEvent event) {
//        // some example code
//        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());
//    }
//
//}
