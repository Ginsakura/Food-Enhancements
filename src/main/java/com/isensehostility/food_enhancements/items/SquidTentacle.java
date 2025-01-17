package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class SquidTentacle extends Item {

    public SquidTentacle() {
        super(new Item.Properties()
                .tab(FoodEnhancements.TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(3)
                        .saturationMod(0.83F)
                        .effect(()-> new MobEffectInstance(MobEffects.BLINDNESS,100,1),1)
                        .build())

        );
    }
}
