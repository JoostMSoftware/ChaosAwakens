package io.github.chaosawakens.data;

import java.util.function.BiConsumer;

import io.github.chaosawakens.ChaosAwakens;
import net.minecraft.data.loot.GiftLootTables;
import net.minecraft.loot.LootTable;
import net.minecraft.util.ResourceLocation;

public class CAGiftLootTable extends GiftLootTables {
	public String getName() {
		return ChaosAwakens.MODNAME + ": Gift Loot Tables";
	}

	@Override
	public void accept(BiConsumer<ResourceLocation, LootTable.Builder> consumer) {
//        consumer.accept(CALootTables.ODDITIES_PURVEYOR_GIFT,
//                LootTable.lootTable()
//                        .withPool(LootPool.lootPool()
//                                .setRolls(ConstantRange.exactly(1))
//                                .add(ItemLootEntry.lootTableItem(Items.EMERALD))
//                                .add(ItemLootEntry.lootTableItem(CAItems.TIN_LUMP.get()))
//                                .add(ItemLootEntry.lootTableItem(CAItems.COPPER_LUMP.get()))
//                                .add(ItemLootEntry.lootTableItem(CAItems.PINK_TOURMALINE_INGOT.get()))
//                                .add(ItemLootEntry.lootTableItem(CAItems.CATS_EYE_INGOT.get()))
//                                .add(ItemLootEntry.lootTableItem(CAItems.PLATINUM_LUMP.get()))));
	}
}
