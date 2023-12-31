package net.alrreddy.tutorialmod.item;

import net.alrreddy.tutorialmod.TutorialMod;
import net.alrreddy.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.RUBY_TEAR_ORE.get());
                        pOutput.accept(ModBlocks.TURQUOISE_TEAR_ORE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_TEAR_ORE.get());
                        pOutput.accept(ModBlocks.TOPAZ_TEAR_ORE.get());
                        pOutput.accept(ModBlocks.AMETHYST_TEAR_ORE.get());
                        pOutput.accept(ModBlocks.PINK_DIAMOND_TEAR_ORE.get());
                        pOutput.accept(ModBlocks.WHITE_DIAMOND_TEAR_ORE.get());
                        pOutput.accept(ModBlocks.RAW_BLACK_QUARTZ.get());
                        pOutput.accept(ModItems.OBSIDIAN_SHARD.get());
                        pOutput.accept(ModItems.RUBY_TEAR.get());
                        pOutput.accept(ModItems.TURQUOISE_TEAR.get());
                        pOutput.accept(ModItems.SAPPHIRE_TEAR.get());
                        pOutput.accept(ModItems.TOPAZ_TEAR.get());
                        pOutput.accept(ModItems.AMETHYST_TEAR.get());
                        pOutput.accept(ModItems.PINK_DIAMOND_TEAR.get());
                        pOutput.accept(ModItems.WHITE_DIAMOND_TEAR.get());
                        pOutput.accept(ModItems.BLACK_QUARTZ.get());
                        pOutput.accept(ModItems.LEGENDARY_QUARTZ.get());
                        pOutput.accept(ModBlocks.RUBY_TEAR_BLOCK.get());
                        pOutput.accept(ModBlocks.TURQUOISE_TEAR_BLOCK.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_TEAR_BLOCK.get());
                        pOutput.accept(ModBlocks.TOPAZ_TEAR_BLOCK.get());
                        pOutput.accept(ModBlocks.AMETHYST_TEAR_BLOCK.get());
                        pOutput.accept(ModBlocks.PINK_DIAMOND_TEAR_BLOCK.get());
                        pOutput.accept(ModBlocks.WHITE_DIAMOND_TEAR_BLOCK.get());
                        pOutput.accept(ModItems.BLACK_QUARTZ_ROD.get());
                        pOutput.accept(ModItems.OBSIDIAN_ROD.get());
                        pOutput.accept(ModItems.DRACONIC_RIBBON.get());
                        pOutput.accept(ModItems.EMPTY_VIAL.get());
                        pOutput.accept(ModItems.THABM_SAP.get());

                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                        pOutput.accept(ModItems.SAPPHIRE.get());



                        pOutput.accept(Items.OBSIDIAN);
                        pOutput.accept(Items.QUARTZ);
                        pOutput.accept(Items.DIAMOND);

                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());

                        pOutput.accept(Items.COMMAND_BLOCK);
                        pOutput.accept(Items.CHAIN_COMMAND_BLOCK);
                        pOutput.accept(Items.REPEATING_COMMAND_BLOCK);
                        pOutput.accept(Items.BARRIER);
                        pOutput.accept(Items.SPAWNER);

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
