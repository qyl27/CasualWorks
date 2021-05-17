package cx.rain.mc.casualworks;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CasualWorks.MODID)
public class CasualWorks {
    public static final String MODID = "casualworks";
    public static final String NAME = "CasualWorks";
    public static final String MC_VERSION = "1.16.5";
    public static final String MOD_VERSION = "1.0.0";
    public static final String VERSION = MC_VERSION + "-" + MOD_VERSION;

    private static CasualWorks INSTANCE = null;

    private final Logger logger = LogManager.getLogger(CasualWorks.NAME);

    public CasualWorks() {
        INSTANCE = this;

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();


    }
}
