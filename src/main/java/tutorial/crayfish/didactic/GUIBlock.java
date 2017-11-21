package tutorial.crayfish.didactic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class GUIBlock extends Block {

    private IIcon[] icons = new IIcon[6];

    public GUIBlock( Material material)
    {
        super(material);
        this.setBlockTextureName( "cftm:blockgui");
        this.setHardness(2.0F);
        this.setResistance(6.0F);
        this.setStepSound(soundTypeGlass);
    }

    @Override
    public void registerBlockIcons(IIconRegister reg) {

        for (int i = 0; i < 6; i++) {
            this.icons[i] = reg.registerIcon(this.textureName + "_" + i);
        }
    }
    @Override
    public IIcon getIcon(int side, int meta) {
        return this.icons[side];
    }
    @Override
    public boolean isOpaqueCube(){
        //if one has transparent or hollow textures, stop mod from x-ray render
        return false;
    }
}

