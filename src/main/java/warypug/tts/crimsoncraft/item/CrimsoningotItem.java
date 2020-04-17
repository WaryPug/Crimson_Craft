
package warypug.tts.crimsoncraft.item;

import warypug.tts.crimsoncraft.itemgroup.CrimsonCraftItemGroup;
import warypug.tts.crimsoncraft.CrimsonCraftElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@CrimsonCraftElements.ModElement.Tag
public class CrimsoningotItem extends CrimsonCraftElements.ModElement {
	@ObjectHolder("crimsoncraft:crimsoningot")
	public static final Item block = null;
	public CrimsoningotItem(CrimsonCraftElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CrimsonCraftItemGroup.tab).maxStackSize(64));
			setRegistryName("crimsoningot");
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
