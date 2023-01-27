package std.init.event.wateristoxic;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import org.abstruck.qwq.library.event.ModEvent;
import org.abstruck.qwq.library.event.SubscribeEvent;
import org.abstruck.qwq.library.events.entity.LivingEntityEvent;

/**
 * @author Goulixiaoji
 */
@ModEvent
public class TouchingWaterEventHandle {
    @SubscribeEvent
    public static void touchingWater(LivingEntityEvent.TickEvent event) {
        LivingEntity entity = event.getEntity();
        if (entity.world.isClient) {
            return;
        }
        if (entity instanceof PlayerEntity player) {
            if (player.isTouchingWater()){
                player.damage(DamageSource.MAGIC, 2);
            }
        }
    }
}
