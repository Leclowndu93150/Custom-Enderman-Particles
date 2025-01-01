package com.leclowndu93150.enderman_particles.mixin;

import com.leclowndu93150.enderman_particles.ModParticles;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(EnderMan.class)
public abstract class EndermanMixin {

    @Redirect(method = "aiStep", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;addParticle(Lnet/minecraft/core/particles/ParticleOptions;DDDDDD)V"))
    private void redirectParticle(Level level, ParticleOptions type, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
        if (type == ParticleTypes.PORTAL) {
            level.addParticle(ModParticles.CUSTOM_ENDERMAN_PORTAL.get(), x, y, z, xSpeed, ySpeed, zSpeed);
        }
    }
}
