// 
// Decompiled by the rizzer xd
// 

package dev.lvstrng.argon.mixin;

import net.minecraft.client.network.ClientPlayerInteractionManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({ClientPlayerInteractionManager.class})
public interface ClientPlayerInteractionManagerAccessor {
    @Invoker("syncSelectedSlot")
    void syncSlot();
}