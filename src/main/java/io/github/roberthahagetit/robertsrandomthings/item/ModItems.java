package io.github.roberthahagetit.robertsrandomthings.item;

import io.github.roberthahagetit.robertsrandomthings.RobertsRandomItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    public static final Item GOLDEN_BEETROOT = registerItem("golden_beetroot", new Item(new Item.Settings().food(ModFoodComponents.GOLDEN_BEETROOT_COMPONENT)));
    public static final Item GOLDEN_POTATO = registerItem("golden_potato", new Item(new Item.Settings().food(ModFoodComponents.GOLDEN_POTATO_COMPONENT)));
    public static final Item GOLDEN_SWEET_BERRIES = registerItem("golden_sweet_berries", new Item(new Item.Settings().food(ModFoodComponents.GOLDEN_SWEET_BERRIES_COMPONENT)));
    public static final Item GOLDEN_GLOW_BERRIES = registerItem("golden_glow_berries", new Item(new Item.Settings().food(ModFoodComponents.GOLDEN_GLOW_BERRIES_COMPONENT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RobertsRandomItems.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RobertsRandomItems.LOGGER.info("Registering Mod Items for " + RobertsRandomItems.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(GOLDEN_BEETROOT);
        });
    }
}
