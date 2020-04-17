package warypug.tts.crimsoncraft.procedures;

import warypug.tts.crimsoncraft.CrimsonCraftElements;

import net.minecraft.entity.Entity;

@CrimsonCraftElements.ModElement.Tag
public class CrimsonCraftMobIsHitWithToolProcedure extends CrimsonCraftElements.ModElement {
	public CrimsonCraftMobIsHitWithToolProcedure(CrimsonCraftElements instance) {
		super(instance, 22);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CrimsonCraftMobIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 10);
	}
}
