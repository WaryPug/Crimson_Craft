
package warypug.tts.crimsoncraft.item;

import warypug.tts.crimsoncraft.procedures.CrimsonappleFoodEatenProcedure;
import warypug.tts.crimsoncraft.itemgroup.CrimsonCraftItemGroup;
import warypug.tts.crimsoncraft.CrimsonCraftElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

@CrimsonCraftElements.ModElement.Tag
public class CrimsonappleItem extends CrimsonCraftElements.ModElement {
	@ObjectHolder("crimsoncraft:crimsonapple")
	public static final Item block = null;
	public CrimsonappleItem(CrimsonCraftElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(CrimsonCraftItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(4).saturation(0.3f).setAlwaysEdible().build()));
			setRegistryName("crimsonapple");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemStack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemStack, world, entity);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				CrimsonappleFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
