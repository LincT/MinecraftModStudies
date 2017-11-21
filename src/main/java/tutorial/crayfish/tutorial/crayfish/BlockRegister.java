package tutorial.crayfish.tutorial.crayfish;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import tutorial.crayfish.BlockCheese;
import tutorial.crayfish.BlockTable;
import tutorial.crayfish.MyBlock;
import tutorial.crayfish.didactic.BlockArenaPortal;
import tutorial.crayfish.didactic.GUIBlock;

public class BlockRegister {
    public static Block blockCheese;
    public static Block blockArenaPortal;
    private static Block myBlock;
    public static Block blockTable; //like items but with blocks
    private static Block guiBlock;

    public BlockRegister(){
        //blocks


        //Blocks
        blockTable = new BlockTable(Material.wood)
                .setBlockName("BlockTable")
                .setBlockTextureName("cftm:blocktable")
                .setCreativeTab(CreativeTabRegister.tabcftm);

        blockCheese = new BlockCheese(Material.rock)
                .setBlockName("BlockCheese")
                .setCreativeTab(CreativeTabRegister.tabcftm)
                .setBlockTextureName("cftm:blockcheese");

        guiBlock = new GUIBlock(Material.iron)
                .setBlockName("BlockGUI")
                .setCreativeTab(CreativeTabRegister.tabcftm);

        blockArenaPortal = new BlockArenaPortal()
                .setBlockName("BlockArenaPortal")
                .setCreativeTab(CreativeTabRegister.tabcftm)
                .setBlockTextureName("portal");

        myBlock = new MyBlock(Material.iron)
                .setBlockName("myBlock")
                .setCreativeTab(CreativeTabRegister.tabcftm)
                .setBlockTextureName("stone");

        //register block
        GameRegistry.registerBlock(blockTable,blockTable.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockCheese,blockCheese.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(guiBlock,guiBlock.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(myBlock,myBlock.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockArenaPortal,blockArenaPortal.getUnlocalizedName().substring(5));
        //Format: GameRegistry.registerBlock(name,name.getUnlocalizedName().substring(5));
    }
}
