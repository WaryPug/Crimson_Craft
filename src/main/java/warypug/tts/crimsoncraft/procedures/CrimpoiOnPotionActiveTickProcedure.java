package warypug.tts.crimsoncraft.procedures;

import warypug.tts.crimsoncraft.CrimsonCraftElements;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

@CrimsonCraftElements.ModElement.Tag
public class CrimpoiOnPotionActiveTickProcedure extends CrimsonCraftElements.ModElement {
	public CrimpoiOnPotionActiveTickProcedure(CrimsonCraftElements instance) {
		super(instance, 27);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CrimpoiOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.LAVA, (float) 1);
	}
}
