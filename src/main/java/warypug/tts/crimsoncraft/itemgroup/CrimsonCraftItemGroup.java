
package warypug.tts.crimsoncraft.itemgroup;

import warypug.tts.crimsoncraft.item.CrimsonrayItem;
import warypug.tts.crimsoncraft.CrimsonCraftElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@CrimsonCraftElements.ModElement.Tag
public class CrimsonCraftItemGroup extends CrimsonCraftElements.ModElement {
	public CrimsonCraftItemGroup(CrimsonCraftElements instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcrimsoncraft") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CrimsonrayItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
