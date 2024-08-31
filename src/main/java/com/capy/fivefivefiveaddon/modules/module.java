package com.capy.fivefivefiveaddon.modules;

import com.capy.fivefivefiveaddon.FiveFiveFiveAddon;
import meteordevelopment.meteorclient.systems.modules.Module;
import net.minecraft.text.Text;

public class module extends Module {
    public module() {
        super(FiveFiveFiveAddon.MISC, "555", "the 555");
    }

    public void onActivate() {
        if (mc.player == null) return;
        mc.inGameHud.getChatHud().addMessage(Text.of("555 activated"));
    }
}
