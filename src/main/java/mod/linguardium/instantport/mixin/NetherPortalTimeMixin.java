package mod.linguardium.instantport.mixin;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(PlayerEntity.class)
public class NetherPortalTimeMixin {
    @Overwrite
    public int getMaxNetherPortalTime() {
        return 1;
    }
}
