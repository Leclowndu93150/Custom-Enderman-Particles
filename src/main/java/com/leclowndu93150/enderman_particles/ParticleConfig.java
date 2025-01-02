package com.leclowndu93150.enderman_particles;

import net.minecraftforge.common.ForgeConfigSpec;

public class ParticleConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.DoubleValue PARTICLE_SIZE;

    static {
        BUILDER.push("particle");

        PARTICLE_SIZE = BUILDER.comment("Size of the custom enderman particle")
                .defineInRange("size", 0.5D, 0.1D, 5.0D);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }

    public static float getParticleSize() {
        return PARTICLE_SIZE.get().floatValue();
    }
}