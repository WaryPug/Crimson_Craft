package warypug.tts.crimsoncraft.procedures;

import warypug.tts.crimsoncraft.CrimsonCraftElements;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.entity.effect.LightningBoltEntity;

@CrimsonCraftElements.ModElement.Tag
public class CrimstaffRightClickedInAirRightClickedInAirProcedure extends CrimsonCraftElements.ModElement {
	public CrimstaffRightClickedInAirRightClickedInAirProcedure(CrimsonCraftElements instance) {
		super(instance, 44);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CrimstaffRightClickedInAirRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CrimstaffRightClickedInAirRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CrimstaffRightClickedInAirRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CrimstaffRightClickedInAirRightClickedInAir!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (world instanceof ServerWorld)
			((ServerWorld) world).addLightningBolt(new LightningBoltEntity(world, (int) x, (int) y, (int) z, false));
	}
}
