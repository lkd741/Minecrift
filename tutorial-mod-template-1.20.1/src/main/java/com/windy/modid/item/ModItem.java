package com.windy.modid.item;

import com.windy.modid.TutorialMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItem {

    public static final Item ICE_ETHER = registerItems("ice_ether", new Item(new Item.Settings()));
    public static final Item RAW_ICE_ETHER = registerItems("raw_ice_ether", new Item(new Item.Settings()));
    public static final Item HEART = registerItems("heart", new Item(new Item.Settings()));
    public static final Item RAW_HEART = registerItems("raw_heart", new Item(new Item.Settings()));

    public static Item registerItems(String id, Item item) {
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), new Identifier(TutorialMod.MOD_ID, id)), item);
    }

    public static void registerItems() {

    }

}
