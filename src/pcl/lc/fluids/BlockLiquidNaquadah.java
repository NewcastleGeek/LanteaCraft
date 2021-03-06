package pcl.lc.fluids;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fluids.BlockFluidClassic;
import pcl.lc.LanteaCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLiquidNaquadah extends BlockFluidClassic {

	public BlockLiquidNaquadah(int id) {
		super(id, LanteaCraft.Fluids.fluidLiquidNaquadah, Material.water);
		LanteaCraft.Fluids.fluidLiquidNaquadah.setBlockID(blockID);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return Block.waterMoving.getIcon(side, meta);
	}

	@Override
	public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z) {
		return 0x22FF00;
	}
}
