package com.capy.fivefivefiveaddon;

import com.capy.fivefivefiveaddon.hud.watermark;
import com.capy.fivefivefiveaddon.modules.module;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class FiveFiveFiveAddon extends MeteorAddon {
    public static final String NAME = "FiveFiveFive";
    public static final String VERSION = "1.0.0";

    public static final Logger LOG = LogUtils.getLogger();
    public static final Category MISC = new Category("The 555");
    public static final HudGroup HUD_GROUP = new HudGroup("The 555");

    @Override
    public void onInitialize() {
        LOG.info("Initializing 555 addon");

        Modules.get().add(new module());

        Hud.get().register(watermark.INFO);
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(MISC);
    }

    @Override
    public String getPackage() {
        return "com.capy.fivefivefiveaddon";
    }
}
