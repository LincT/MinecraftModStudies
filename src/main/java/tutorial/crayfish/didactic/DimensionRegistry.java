package tutorial.crayfish.didactic;


import net.minecraft.world.WorldProviderEnd;
import net.minecraftforge.common.DimensionManager;

public class DimensionRegistry {
    public static void mainRegistry(String[] args) {
        registerDimension();

    }

    static final int dimensionId = 88;

    private static void registerDimension(){
        DimensionManager.registerProviderType(dimensionId, WorldProviderEnd.class,false);
        DimensionManager.registerDimension(dimensionId,dimensionId);
    }
}
