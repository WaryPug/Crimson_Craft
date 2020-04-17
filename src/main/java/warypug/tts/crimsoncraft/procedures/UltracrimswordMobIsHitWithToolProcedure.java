package warypug.tts.crimsoncraft.procedures;

import warypug.tts.crimsoncraft.potion.CrimpoiPotion;
import warypug.tts.crimsoncraft.CrimsonCraftElements;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

@CrimsonCraftElements.ModElement.Tag
public class UltracrimswordMobIsHitWithToolProcedure extends CrimsonCraftElements.ModElement {
	public UltracrimswordMobIsHitWithToolProcedure(CrimsonCraftElements instance) {
		super(instance, 30);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure UltracrimswordMobIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 10);
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(CrimpoiPotion.potion, (int) 200, (int) 1));
	}
}
