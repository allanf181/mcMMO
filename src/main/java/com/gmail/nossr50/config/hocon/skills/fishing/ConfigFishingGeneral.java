package com.gmail.nossr50.config.hocon.skills.fishing;

import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;

@ConfigSerializable
public class ConfigFishingGeneral {

    private static final boolean ALWAYS_CATCH_FISH_DEFAULT = true;
    private static final boolean OVERRIDE_VANILLA_TREASURES = true;
    public static final double LURE_MODIFIER_DEFAULT = 4.0D;

    @Setting(value = "Always-Catch-Fish", comment = "Enables fish to be caught alongside treasure." +
            "\nDefault value: "+ALWAYS_CATCH_FISH_DEFAULT)
    private boolean alwaysCatchFish = ALWAYS_CATCH_FISH_DEFAULT;

    @Setting(value = "Override-Vanilla-Fishing-Treasures", comment = "When set to true, mcMMO fishing loot tables will be used instead of vanilla." +
            "\nIt is recommended you use vanilla mcMMO fishing tables, as they are configurable." +
            "\nDefault value: "+OVERRIDE_VANILLA_TREASURES)
    private boolean overrideVanillaTreasures = OVERRIDE_VANILLA_TREASURES;

    @Setting(value = "Lure-Luck-Modifier", comment = "Lure luck modifier is used to determine how much to" +
            " increase drop chance by for fishing rods with the Luck enchantment." +
            "\nDefault value: "+LURE_MODIFIER_DEFAULT)
    private double lureLuckModifier = LURE_MODIFIER_DEFAULT;

    public double getLureLuckModifier() {
        return lureLuckModifier;
    }

    public boolean isAlwaysCatchFish() {
        return alwaysCatchFish;
    }

    public boolean isOverrideVanillaTreasures() {
        return overrideVanillaTreasures;
    }
}