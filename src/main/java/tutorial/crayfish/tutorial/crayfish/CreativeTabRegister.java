package tutorial.crayfish.tutorial.crayfish;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabRegister {
    public CreativeTabRegister(){

    }
    public static CreativeTabs tabcftm = new CreativeTabs("CrayfishTutorial"){
        @Override
        public Item getTabIconItem() {
            return new ItemStack(ItemRegister.itemCheese).getItem();
        }
    };
}
