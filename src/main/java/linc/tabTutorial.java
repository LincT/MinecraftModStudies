//package linc;
//
//import net.minecraft.creativetab.CreativeTabs;
//
//import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemStack;
//import cpw.mods.fml.relauncher.Side;
//import cpw.mods.fml.relauncher.SideOnly;
//
//public class tabTutorial extends CreativeTabs {
//
//    public tabTutorial(int par1, String par2Str) {
//        super(par1, par2Str);
//
//    }
//
//    @Override
//    public Item getTabIconItem() {
//        return null;
//    }
//
//    @Override
//    @SideOnly(Side.CLIENT)
//    public ItemStack getIconItemStack(){
//// Here you make the Icon of the creative Tab
//        return new ItemStack(linc.BasicBlock.getBlockById(95));
//    }
//    public String getTranslatedTabLabel(){
//// Here the Name
//        return "Tutorial Blocks";
//    }
//
//}