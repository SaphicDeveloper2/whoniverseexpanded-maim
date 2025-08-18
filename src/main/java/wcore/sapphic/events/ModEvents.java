package wcore.sapphic.events;// Inside your ModEvents.java file

import net.sapphic.whoniverseexpanded.WhoniverseexpandedMod; // <-- Make sure this is imported
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import wcore.sapphic.ai.AbstractDalekEntity;

@Mod.EventBusSubscriber(modid = WhoniverseexpandedMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {

    @SubscribeEvent
    public static void onAttributeCreate(EntityAttributeCreationEvent event) {
        // THE FIX IS HERE:
        event.put(WhoniverseexpandedMod.EXAMPLE_DALEK.get(), AbstractDalekEntity.createAttributes().build());
    }
}