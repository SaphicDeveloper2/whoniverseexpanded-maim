package net.sapphic.whoniverseexpanded;

import net.minecraft.world.entity.EntityType;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.sapphic.whoniverseexpanded.init.WhoniverseexpandedModTabs;
import net.sapphic.whoniverseexpanded.init.WhoniverseexpandedModItems;
import net.sapphic.whoniverseexpanded.init.WhoniverseexpandedModBlocks;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.util.thread.SidedThreadGroups;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import wcore.sapphic.entities.DalekEntityPaladin;
import wcore.sapphic.entities.DalekRegistryFactory;
import wcore.sapphic.entities.ExampleDalekEntity;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.AbstractMap;

@Mod("whoniverseexpanded")
public class WhoniverseexpandedMod {
	public static final Logger LOGGER = LogManager.getLogger(WhoniverseexpandedMod.class);
	public static final String MODID = "whoniverseexpanded";
    private static final DalekRegistryFactory DALEK_FACTORY = new DalekRegistryFactory(MODID);


    // ... inside your main mod class ...

    public static final RegistryObject<EntityType<ExampleDalekEntity>> EXAMPLE_DALEK = DalekRegistryFactory.registerDalek(
            "example_dalek",         // The name used in commands, e.g., /summon yourmodid:example_dalek
            ExampleDalekEntity::new,   // The constructor for our new class
            "example_dalek.png"      // The texture file it will use
    );
    public static final RegistryObject<EntityType<DalekEntityPaladin>> DALEKPALADIN =DalekRegistryFactory.registerDalek(
            "paladin_dalek",
            DalekEntityPaladin::new,"example_dalek.png" //intended to change. placeholder texture
            );

    @SubscribeEvent
    public static void onAttributeCreate(EntityAttributeCreationEvent event) {
        // This connects the attributes from the entity class to the entity type
        event.put(WhoniverseexpandedMod.EXAMPLE_DALEK.get(), ExampleDalekEntity.createAttributes().build());
        event.put(WhoniverseexpandedMod.DALEKPALADIN.get(), DalekEntityPaladin.createAttributes().build());
    }

// ... rest of your class ...

	public WhoniverseexpandedMod() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		MinecraftForge.EVENT_BUS.register(this);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		WhoniverseexpandedModBlocks.REGISTRY.register(bus);

		WhoniverseexpandedModItems.REGISTRY.register(bus);

		WhoniverseexpandedModTabs.REGISTRY.register(bus);

        DALEK_FACTORY.register(bus);

        //SoundEventsInit.register(bus);





		// Start of user code block mod init
		// End of user code block mod init
	}

	// Start of user code block mod methods
	// End of user code block mod methods
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	public static void queueServerWork(int tick, Runnable action) {
		if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
			workQueue.add(new AbstractMap.SimpleEntry<>(action, tick));
	}

	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
			workQueue.forEach(work -> {
				work.setValue(work.getValue() - 1);
				if (work.getValue() == 0)
					actions.add(work);
			});
			actions.forEach(e -> e.getKey().run());
			workQueue.removeAll(actions);
		}
	}
}
