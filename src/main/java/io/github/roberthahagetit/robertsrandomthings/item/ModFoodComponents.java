package io.github.roberthahagetit.robertsrandomthings.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent GOLDEN_BEETROOT_COMPONENT = (new FoodComponent.Builder().nutrition(1).saturationModifier(0.6F).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 1), 0.5F).build());
    public static final FoodComponent GOLDEN_POTATO_COMPONENT = (new FoodComponent.Builder().nutrition(1).saturationModifier(.3F).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1200, 0), 1.0F).build());
    public static final FoodComponent GOLDEN_SWEET_BERRIES_COMPONENT = (new FoodComponent.Builder().nutrition(3).saturationModifier(0.6F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20, 0), 1.0F).build());
    public static final FoodComponent GOLDEN_GLOW_BERRIES_COMPONENT = (new FoodComponent.Builder().nutrition(3).saturationModifier(0.6F).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 600, 0), 1.0F).build());

}
