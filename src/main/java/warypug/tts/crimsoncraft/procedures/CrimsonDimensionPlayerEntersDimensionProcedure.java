package warypug.tts.crimsoncraft.procedures;

import warypug.tts.crimsoncraft.CrimsonCraftElements;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.PlayerEntity;

@CrimsonCraftElements.ModElement.Tag
public class CrimsonDimensionPlayerEntersDimensionProcedure extends CrimsonCraftElements.ModElement {
	public CrimsonDimensionPlayerEntersDimensionProcedure(CrimsonCraftElements instance) {
		super(instance, 32);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CrimsonDimensionPlayerEntersDimension!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CrimsonDimensionPlayerEntersDimension!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CrimsonDimensionPlayerEntersDimension!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CrimsonDimensionPlayerEntersDimension!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.playSound((PlayerEntity) null, x, y, z,
				(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")), SoundCategory.NEUTRAL,
				(float) 1, (float) 1);
		{
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new StringTextComponent("Welcome to the Crimson. Good luck, Mortal..."));
		}
	}
}
