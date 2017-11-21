package tutorial.crayfish;
//This is the main class. should be the name of the mod.

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

import tutorial.crayfish.didactic.CommandTutorial;
import tutorial.crayfish.didactic.DimensionRegistry;
import tutorial.crayfish.tutorial.crayfish.*;


@Mod(modid = TutorialMod.MODID,name = TutorialMod.NAME,version = TutorialMod.VERSION)


public class TutorialMod {
    //put annotation variables in a class so we can also call them in code.
    public final static String MODID = "cftm";
    public final static String NAME = "Tutorial Mod";
    public final static String VERSION = "1.0";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        //item/block init and reg.
        //cfg handling
        new ToolRegister();
        new ArmorRegister();
        new BlockRegister();
        new ItemRegister();
        //new DimensionRegistry();

        //TODO figure out weight parameter
        GameRegistry.registerWorldGenerator(new CheeseGeneration(),0);
    }

    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent event)
    {
        // register server commands
        event.registerServerCommand(new CommandTutorial());
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){
        //recipes, proxy, tileEntity, entity, gui, and pkt init/reg
        new RecipeRegister();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
    }


}
