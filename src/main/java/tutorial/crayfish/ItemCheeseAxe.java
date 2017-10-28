package tutorial.crayfish;

import net.minecraft.item.*;


public class ItemCheeseAxe extends ItemAxe {

    public ItemCheeseAxe(ToolMaterial material) {


        super(material);
        this.setCreativeTab(TutorialMod.tabcftm)
                .setTextureName("cftm:itemcheeseaxe")
                .setUnlocalizedName("ItemCheeseAxe");
    }
}
