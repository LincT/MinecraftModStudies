//package tutorial.crayfish.didactic;
//
//import net.minecraft.world.WorldProvider;
//import net.minecraft.world.biome.BiomeGenEnd;
//import net.minecraft.world.biome.WorldChunkManagerHell;
//import net.minecraft.world.chunk.IChunkProvider;
//
//public class WorldProviderPrima extends WorldProvider {
//    public WorldProviderPrima() {
//    }
//
//    public void registerWorldChunkManager(){
//        this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenEnd.sky,0.00F);
//        this.dimensionId = DimensionRegistry.dimensionId;
//    }
//
//    @Override
//    public IChunkProvider createChunkGenerator() {
//        //return super.createChunkGenerator();
//        return null;
//    }
//
//    @Override
//    protected void generateLightBrightnessTable() {
//        super.generateLightBrightnessTable();
//    }
//
//    @Override
//    public String getDimensionName() {
//        return "Eldritch Arena";
//    }
//}
