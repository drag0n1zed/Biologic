package drag0n1zed.biologic;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Biologic implements ModInitializer {

    public static final String MOD_ID = "biologic";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.info("Biologic iiiiinitializing!");
        LOGGER.info("this log is for testing the git repo");
        ModItems.initialize();
    }



}
