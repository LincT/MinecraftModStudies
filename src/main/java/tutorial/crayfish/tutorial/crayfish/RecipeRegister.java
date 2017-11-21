package tutorial.crayfish.tutorial.crayfish;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipeRegister {
    public RecipeRegister(){
        //recipes
        GameRegistry.addRecipe(new ItemStack(ItemRegister.itemTable),
                "WWW"," W "," W ", 'W', Blocks.planks);
        GameRegistry.addRecipe(new ItemStack(BlockRegister.blockTable,1),//(output,qty)
                "CRC","RRR","CRC",'C', Blocks.coal_block,'R', Items.redstone);//multi material
        GameRegistry.addRecipe(new ItemStack(ToolRegister.cheeseAxe),
                "CC","SC","S ",'C',ItemRegister.itemCheese,'S',Items.stick);
        GameRegistry.addRecipe(new ItemStack(ToolRegister.cheeseSword),
                "C","C","S",'C',ItemRegister.itemCheese,'S',Items.stick);
        GameRegistry.addRecipe(new ItemStack(ToolRegister.cheeseHoe),
                "CC","S ","S ",'C',ItemRegister.itemCheese,'S',Items.stick);
        GameRegistry.addRecipe(new ItemStack(ToolRegister.cheeseShovel),
                "C","S","S",'C',ItemRegister.itemCheese,'S',Items.stick);//if spaces line up, can omit from recipe.
        GameRegistry.addRecipe(new ItemStack(ToolRegister.cheesePickaxe),
                "CCC"," S "," S ",'C',ItemRegister.itemCheese,'S',Items.stick);
        GameRegistry.addRecipe(new ItemStack(BlockRegister.blockCheese),
                "CCC","CCC","CCC",'C',ItemRegister.itemCheese);
        GameRegistry.addRecipe(new ItemStack(ItemRegister.itemCheeseStick),
                "C "," C",'C',ItemRegister.itemCheese);
        GameRegistry.addRecipe(new ItemStack(ArmorRegister.cheeseHelm),
                "CCC","C C",'C',ItemRegister.itemCheese);
        GameRegistry.addRecipe(new ItemStack(ArmorRegister.cheeseChestPlate),
                "C C","CCC","CCC",'C',ItemRegister.itemCheese);
        GameRegistry.addRecipe(new ItemStack(ArmorRegister.cheeseLeggings),
                "CCC","C C","C C",'C',ItemRegister.itemCheese);
        GameRegistry.addRecipe(new ItemStack(ArmorRegister.cheeseBoots),
                "C C","C C",'C',ItemRegister.itemCheese);

        //Shapeless recipes
        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegister.itemCheese,8),
                Items.fermented_spider_eye,
                Items.milk_bucket);//returns 8 cheese and empty bucket.

        //smelting recipes
        GameRegistry.addSmelting(ItemRegister.itemCheese,new ItemStack(ItemRegister.itemGrilledCheese),1.0F);

    }
}
