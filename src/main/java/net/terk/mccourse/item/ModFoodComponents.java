package net.terk.mccourse.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CAULIFOWER = new FoodComponent.Builder().hunger(5).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 300, 2), 0.50f).build();
}
