package tutorial.crayfish;

//import net.minecraft.block.BlockFence; //extra properties vs Block
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import java.util.Random;


public class BlockCheese extends Block {
    int metadata;

    public BlockCheese(Material material) {
        super(material);
//        this.setBlockUnbreakable(); //a la bedrock, onky affect player breaking
//        this.setResistance(2000.0F); //stop tnt, bedrock listed at 18,000,000
        this.setHardness(2.0F); //log 1.0, minecraft.gamepedia.com for others, materials determine tools/drop
        //this.setHarvestLevel("pickaxe",4); //only valid with items that need tools, (tool,level)
        this.setLightLevel(0.53F); //0-1F, 1 = level 15, 0.53 approx light lvl 5
        //this.setLightOpacity(1); //can light pass through? 16 opaque,0 transparent.
        this.setStepSound(soundTypeSnow); //sound different than material?




    }
    @Override
    public boolean isOpaqueCube(){
        //if one has transparent or hollow textures, stop mod from x-ray render
        return false;
    }
//    //these were in tutorial but not explained.
//    @Override
//    public boolean renderAsNormalBlock(){
//        return true; //do we want a normal 16 by 16 by 16 render?
//    }
//    @Override
//    public int getRenderType(){
//        return 11; //0-41? //custom shapes, ie fences,
//    }
//    @Override
//    public boolean canConnectFenceTo(){
//        //listed in crayfish code, apparently invalid
//        return false;
//    }

    @Override
    public Item getItemDropped(int metadata,Random random, int fortune){
        this.metadata = metadata;
        return TutorialMod.itemCheese;
    }
    @Override
    public int damageDropped(int metadata) {
        return this.metadata;
    }
    @Override
    public int quantityDropped(int metadata, int fortune, Random random){
        int minQty = 2,maxQty = 9;
        if (minQty >= maxQty) return maxQty;
        return minQty + random.nextInt((maxQty - minQty) + fortune + 1);
    }
}
