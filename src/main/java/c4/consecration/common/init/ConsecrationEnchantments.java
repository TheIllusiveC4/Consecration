/*
 * Copyright (c) 2018 <C4>
 *
 * This Java class is distributed as a part of Consecration.
 * Consecration is open source and licensed under the GNU General Public License v3.
 * A copy of the license can be found here: https://www.gnu.org/licenses/gpl.txt
 */

package c4.consecration.common.init;

import c4.consecration.Consecration;
import c4.consecration.common.enchantments.EnchantmentBlessing;
import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber(modid = Consecration.MODID)
@GameRegistry.ObjectHolder("consecration")
public class ConsecrationEnchantments {

    @GameRegistry.ObjectHolder("blessing")
    public static final Enchantment blessing = null;

    @SubscribeEvent
    public static void init(RegistryEvent.Register<Enchantment> evt) {
        evt.getRegistry().register(new EnchantmentBlessing());
    }
}
