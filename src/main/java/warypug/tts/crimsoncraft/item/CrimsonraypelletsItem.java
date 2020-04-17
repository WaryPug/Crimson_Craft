
package warypug.tts.crimsoncraft.item;

import warypug.tts.crimsoncraft.itemgroup.CrimsonCraftItemGroup;
import warypug.tts.crimsoncraft.CrimsonCraftElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@CrimsonCraftElements.ModElement.Tag
public class CrimsonraypelletsItem extends CrimsonCraftElements.ModElement {
	@ObjectHolder("crimsoncraft:crimsonraypellets")
	public static final Item block = null;
	public CrimsonraypelletsItem(CrimsonCraftElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CrimsonCraftItemGroup.tab).maxStackSize(64));
			setRegistryName("crimsonraypellets");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
