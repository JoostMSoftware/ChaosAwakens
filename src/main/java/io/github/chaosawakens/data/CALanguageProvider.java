package io.github.chaosawakens.data;

import io.github.chaosawakens.ChaosAwakens;
import io.github.chaosawakens.common.registry.*;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.fml.RegistryObject;

public class CALanguageProvider {

    public static class EnglishAmerican extends LanguageProvider{
        @Override
        public String getName() {
            return ChaosAwakens.MODNAME + ": Language & Translations Entries (EN_US)";
        }

        public EnglishAmerican(DataGenerator gen) {
            super(gen, ChaosAwakens.MODID, "en_us");
        }

        //https://stackoverflow.com/questions/1892765/how-to-capitalize-the-first-character-of-each-word-in-a-string
        public static String capitalizeString(String string) {
            char[] chars = string.toLowerCase().toCharArray();
            boolean found = false;
            for (int i = 0; i < chars.length; i++) {
                if (!found && Character.isLetter(chars[i])) {
                    chars[i] = Character.toUpperCase(chars[i]);
                    found = true;
                } else if (Character.isWhitespace(chars[i]) || chars[i] == '.' || chars[i] == '_') {
                    found = false;
                }
            }
            return String.valueOf(chars);
        }

        private void localizeGeneralRegistryNames(String registryName) {
            if (registryName.isEmpty() || registryName == null) return;
            if (!registryName.contains(".")) return;

            String regNameTemp = registryName;
            String capitalised = capitalizeString(regNameTemp);
            String regName = capitalised.substring(capitalised.lastIndexOf(".") + 1).replaceAll("_", " ");

            add(registryName, regName);
            ChaosAwakens.debug(registryName, regName);
        }

        private void localizeItemGroupRegistryNames(String registryName) {
            if (registryName.isEmpty() || registryName == null) return;
            if (!registryName.contains(".")) return;

            String regNameTemp = registryName;
            String capitalised = capitalizeString(regNameTemp);
            String regName = ChaosAwakens.MODNAME.concat(": ".concat(capitalised.substring(capitalised.lastIndexOf(".") + 1).replaceAll("_", " ")));

            add(registryName, regName);
            ChaosAwakens.debug(registryName, regName);
        }

        private void localizeSubtitleRegistryNames(String registryName) {

        }

        private void automateRegNameGen() {
            for (RegistryObject<Item> itemRegEntry : CAItems.ITEMS.getEntries()) {
                Item item = itemRegEntry.get();
                String registryName = item.getDescriptionId();

                localizeGeneralRegistryNames(registryName);
            }

            for (RegistryObject<Block> blockGenEntry : CABlocks.BLOCKS.getEntries()) {
                Block block = blockGenEntry.get();
                String registryName = block.getDescriptionId();
                // Insert exceptions here
                if (registryName.contains("sign")) continue;
                if (registryName.contains("torch")) continue;

                localizeGeneralRegistryNames(registryName);
            }

            for (RegistryObject<EntityType<?>> entityGenEntry : CAEntityTypes.ENTITY_TYPES.getEntries()) {
                EntityType<?> type = entityGenEntry.get();
                String registryName = type.getDescriptionId();

                localizeGeneralRegistryNames(registryName);
            }

            CAItemGroups.GROUP.forEach(group -> localizeItemGroupRegistryNames("itemGroup." + group.getRecipeFolderName()));

		    for (RegistryObject<SoundEvent> soundEventGenEntry : CASoundEvents.SOUND_EVENTS.getEntries()) {
                SoundEvent event = soundEventGenEntry.get();
                String registryName = "subtitles.".concat(String.valueOf(event.getRegistryName()));

                localizeGeneralRegistryNames(registryName);
            }
        }

        @Override
        protected void addTranslations() {
            	automateRegNameGen();
        }
    }
}
