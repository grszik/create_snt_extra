package dev.grosik.create_snt_extra;

import dev.grosik.create_snt_extra.init.Blocks;
import dev.grosik.create_snt_extra.init.CreativeTab;
import dev.grosik.create_snt_extra.init.Fluids;
import dev.grosik.create_snt_extra.init.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CreateSNTE.MODID)
public class CreateSNTE {
    public static final String MODID = "create_snt_extra";

    public CreateSNTE() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        Items.ITEMS.register(bus);
        CreativeTab.TABS.register(bus);
        Blocks.BLOCKS.register(bus);
        Fluids.FLUID_TYPES.register(bus);
        Fluids.FLUIDS.register(bus);
    }
}
