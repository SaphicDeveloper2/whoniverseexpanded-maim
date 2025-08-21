package com.sapphic.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;
import wcore.sapphic.ai.AbstractDalekEntity;

public class DalekEntityPaladin extends AbstractDalekEntity {
    public DalekEntityPaladin(EntityType<? extends Monster> type, Level level) {
        super(type, level);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes().add(Attributes.MAX_HEALTH, (double)100.0F).add(Attributes.MOVEMENT_SPEED, 0.18).add(Attributes.KNOCKBACK_RESISTANCE, (double)1.0F).add(Attributes.FOLLOW_RANGE, (double)24.0F).add(Attributes.ATTACK_DAMAGE, (double)5.0F);
    }
}
