package io.github.roberthahagetit.robertsrandomthings.item;

import io.github.roberthahagetit.robertsrandomthings.RobertsRandomItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ROBERTS_RANDOM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RobertsRandomItems.MOD_ID, "roberts_random_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.GOLDEN_BEETROOT))
                    .displayName(Text.translatable("itemgroup.robertsrandomitems.roberts_random_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.GOLDEN_BEETROOT);
                        entries.add(ModItems.GOLDEN_POTATO);
                        entries.add(ModItems.GOLDEN_SWEET_BERRIES);
                        entries.add(ModItems.GOLDEN_GLOW_BERRIES);
                    }).build());

    public static void registerItemGroups() {
        RobertsRandomItems.LOGGER.info("Registering Item Groups for " + RobertsRandomItems.MOD_ID);
    }
}
