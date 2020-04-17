
package warypug.tts.crimsoncraft.item;

import warypug.tts.crimsoncraft.procedures.UltracrimswordMobIsHitWithToolProcedure;
import warypug.tts.crimsoncraft.itemgroup.CrimsonCraftItemGroup;
import warypug.tts.crimsoncraft.CrimsonCraftElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.LivingEntity;

@CrimsonCraftElements.ModElement.Tag
public class UltracrimswordItem extends CrimsonCraftElements.ModElement {
	@ObjectHolder("crimsoncraft:ultracrimsword")
	public static final Item block = null;
	public UltracrimswordItem(CrimsonCraftElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2500;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 148f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 5;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CrimsoningotItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(CrimsonCraftItemGroup.tab)) {
			@Override
			public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity entity2) {
				boolean retval = super.hitEntity(itemstack, entity, entity2);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				World world = entity.world;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					UltracrimswordMobIsHitWithToolProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}

			@Override
			@OnlyIn(Dist.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setRegistryName("ultracrimsword"));
	}
}
