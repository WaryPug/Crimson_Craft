
package warypug.tts.crimsoncraft.item;

import warypug.tts.crimsoncraft.itemgroup.CrimsonCraftItemGroup;
import warypug.tts.crimsoncraft.CrimsonCraftElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@CrimsonCraftElements.ModElement.Tag
public class CrimsonPickaxeItem extends CrimsonCraftElements.ModElement {
	@ObjectHolder("crimsoncraft:crimsonpickaxe")
	public static final Item block = null;
	public CrimsonPickaxeItem(CrimsonCraftElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2000;
			}

			public float getEfficiency() {
				return 14f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 8;
			}

			public int getEnchantability() {
				return 5;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CrimsoningotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(CrimsonCraftItemGroup.tab)) {
		}.setRegistryName("crimsonpickaxe"));
	}
}
