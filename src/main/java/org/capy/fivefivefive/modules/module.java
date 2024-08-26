package org.capy.fivefivefive.modules;

import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Categories;
import meteordevelopment.meteorclient.systems.modules.Module;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

public class module extends Module {
    public SettingGroup sgGeneral = settings.getDefaultGroup();

    private final Setting<Boolean> setting = sgGeneral.add(new BoolSetting.Builder()
        .name("enable-555")
        .description("555 setting")
        .defaultValue(true)
        .build()
    );

    public module() {
        super(Categories.Misc, "555", "the 555");
    }

    @Override
    public void onActivate() {
        if (setting.get()) {
            if (mc.player == null) return;
            mc.inGameHud.getChatHud().addMessage(Text.of("555 is now enabled"));
        }
    }
}
