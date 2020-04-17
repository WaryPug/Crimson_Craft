package warypug.tts.crimsoncraft.procedures;

import warypug.tts.crimsoncraft.potion.CrimpoiPotion;
import warypug.tts.crimsoncraft.entity.CrimsonwarroirEntity;
import warypug.tts.crimsoncraft.CrimsonCraftElements;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

@CrimsonCraftElements.ModElement.Tag
public class CrimsonwarroirEntityIsHurtProcedure extends CrimsonCraftElements.ModElement {
	public CrimsonwarroirEntityIsHurtProcedure(CrimsonCraftElements instance) {
		super(instance, 29);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CrimsonwarroirEntityIsHurt!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof PlayerEntity)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(CrimpoiPotion.potion, (int) 70, (int) 1, (false), (false)));
		} else if ((entity instanceof CrimsonwarroirEntity.CustomEntity)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_HEALTH, (int) 70, (int) 1, (false), (false)));
		}
	}
}
