package pcl.lc.guis;

import net.minecraft.entity.player.EntityPlayer;
import pcl.common.base.GenericContainerGUI;
import pcl.lc.LanteaCraft;
import pcl.lc.containers.ContainerNaquadahGenerator;
import pcl.lc.tileentity.TileEntityNaquadahGenerator;

public class ScreenNaquadahGenerator extends GenericContainerGUI {

	private static final int guiWidth = 177;
	private static final int guiHeight = 208;

	private final TileEntityNaquadahGenerator tileEntity;

	public ScreenNaquadahGenerator(TileEntityNaquadahGenerator te, EntityPlayer player) {
		super(new ContainerNaquadahGenerator(te, player), guiWidth, guiHeight);
		tileEntity = te;
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

	@Override
	protected void drawBackgroundLayer() {
		bindTexture(LanteaCraft.getInstance().getResource("textures/gui/naquadah_generator_128.png"), 256, 256);
		drawTexturedRectUV(0, 0, 177, 208, 0, 0, (double) (177d / 256d), (double) (208d / 256d));

	}

	@Override
	protected void drawForegroundLayer() {
		// TODO Auto-generated method stub

	}

}
