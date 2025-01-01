package com.leclowndu93150.enderman_particles;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(EndermanParticles.MODID)
public class EndermanParticles {

    public static final String MODID = "enderman_particles";
    private static final Logger LOGGER = LogUtils.getLogger();

    public EndermanParticles() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModParticles.register(modEventBus);
    }

}
