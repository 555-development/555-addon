package org.capy.fivefivefive;

import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.capy.fivefivefive.modules.module;
import org.slf4j.Logger;

public class fivefivefive extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        LOG.info("Initializing Client Chat Addon");

        Modules.get().add(new module());
    }

    @Override
    public String getPackage() {
        return "org.capy.fivefivefive";
    }
}
