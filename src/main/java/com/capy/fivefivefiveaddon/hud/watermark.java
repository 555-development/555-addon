package com.capy.fivefivefiveaddon.hud;

import com.capy.fivefivefiveaddon.FiveFiveFiveAddon;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.utils.render.color.Color;

public class watermark extends HudElement {
    public SettingGroup sgGeneral = settings.getDefaultGroup();

    private final Setting<Boolean> shadow = sgGeneral.add(new BoolSetting.Builder()
        .name("shadow")
        .description("render a shadow")
        .defaultValue(true)
        .build()
    );

    public static final HudElementInfo<watermark> INFO = new HudElementInfo<>(FiveFiveFiveAddon.HUD_GROUP, "555-watermark", "The 555", watermark::new);

    public watermark() {
        super(INFO);
    }

    @Override
    public void render(HudRenderer renderer) {
        String text = "555 addon" + " " + FiveFiveFiveAddon.VERSION;
        setSize(renderer.textWidth(text, shadow.get()), renderer.textHeight(shadow.get()));

        renderer.text(text, x, y, Color.WHITE, shadow.get());
    }
}
