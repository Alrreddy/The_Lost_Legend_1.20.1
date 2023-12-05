package net.alrreddy.tutorialmod.item;

import net.alrreddy.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> AMETHYST_TEAR = ITEMS.register("amethyst_tear",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLACK_QUARTZ = ITEMS.register("black_quartz",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLACK_QUARTZ_ROD = ITEMS.register("black_quartz_rod",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRACONIC_RIBBON = ITEMS.register("draconic_ribbon",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EMPTY_VIAL = ITEMS.register("empty_vial",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LEGENDARY_QUARTZ = ITEMS.register("legendary_quartz",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OBSIDIAN_ROD = ITEMS.register("obsidian_rod",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_SHARD = ITEMS.register("obsidian_shard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PINK_DIAMOND_TEAR = ITEMS.register("pink_diamond_tear",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY_TEAR = ITEMS.register("ruby_tear",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_TEAR = ITEMS.register("sapphire_tear",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> THABM_SAP = ITEMS.register("thabm_sap",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TOPAZ_TEAR = ITEMS.register("topaz_tear",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TURQUOISE_TEAR = ITEMS.register("turquoise_tear",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WHITE_DIAMOND_TEAR = ITEMS.register("white_diamond_tear",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
