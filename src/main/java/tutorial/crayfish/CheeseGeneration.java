package tutorial.crayfish;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class CheeseGeneration implements IWorldGenerator {
    public CheeseGeneration() {
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
                         IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId){
            case 1: //End
                generateEnd(world,random,chunkX,chunkZ);
                break;
            case 0: //OverWorld
                generateOverWorld(world,random,chunkX,chunkZ);
                break;
            case -1: //Nether
                generateNether(world,random,chunkX,chunkZ);
                break;

        }

    }


    public void generateOverWorld(World world,Random random,int x,int z){
        generateOre(TutorialMod.blockCheese,world,random,x,z,
                2,10,5,11,100, Blocks.sandstone);
    }

    public void generateNether(World world,Random random,int x,int z){
        generateOre(TutorialMod.blockCheese,world,random,x,z,
                2,10,5,11,100, Blocks.netherrack);
    }

    public void generateEnd(World world,Random random,int x,int z){
        generateOre(TutorialMod.blockCheese,world,random,x,z,
                2,10,5,11,100, Blocks.end_stone);
    }
    public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVeinSize,
                            int maxVeinSize,int chance, int minY, int maxY,Block generateIn){
        int veinSize = minVeinSize + random.nextInt(maxVeinSize-minVeinSize);
        int heightRange = minY + random.nextInt(maxY-minY);

        WorldGenMinable gen = new WorldGenMinable(block,veinSize,generateIn);
        for (int i = 0;i<chance;i++){
            int xRand = chunkX * 16 + random.nextInt(16),
                    yRand = random.nextInt(heightRange) + minY,
                    zRand = chunkZ*16 + random.nextInt(16);
            gen.generate(world,random,xRand,yRand,zRand);
        }

    }
}
