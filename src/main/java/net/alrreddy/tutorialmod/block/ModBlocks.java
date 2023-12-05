package net.alrreddy.tutorialmod.block;

import net.alrreddy.tutorialmod.TutorialMod;
import net.alrreddy.tutorialmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);

    public static final RegistryObject<Block> AMETHYST_TEAR_BLOCK = registerBlock("amethyst_tear_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AMETHYST_TEAR_ORE = registerBlock("amethyst_tear_ore",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).sound(SoundType.AMETHYST_CLUSTER)));
    public static final RegistryObject<Block> PINK_DIAMOND_TEAR_BLOCK = registerBlock("pink_diamond_tear_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PINK_DIAMOND_TEAR_ORE = registerBlock("pink_diamond_tear_ore",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).sound(SoundType.AMETHYST_CLUSTER)));
    public static final RegistryObject<Block> RAW_BLACK_QUARTZ = registerBlock("raw_black_quartz",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).sound(SoundType.NETHER_GOLD_ORE)));
    public static final RegistryObject<Block> RAW_SAPPHIRE_BLOCK = registerBlock("raw_sapphire_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST_CLUSTER)));
    public static final RegistryObject<Block> RUBY_TEAR_BLOCK = registerBlock("ruby_tear_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RUBY_TEAR_ORE = registerBlock("ruby_tear_ore",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).sound(SoundType.AMETHYST_CLUSTER)));
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SAPPHIRE_TEAR_BLOCK = registerBlock("sapphire_tear_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SAPPHIRE_TEAR_ORE = registerBlock("sapphire_tear_ore",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).sound(SoundType.AMETHYST_CLUSTER)));
    public static final RegistryObject<Block> TOPAZ_TEAR_BLOCK = registerBlock("topaz_tear_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TOPAZ_TEAR_ORE = registerBlock("topaz_tear_ore",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).sound(SoundType.AMETHYST_CLUSTER)));
    public static final RegistryObject<Block> TURQUOISE_TEAR_BLOCK = registerBlock("turquoise_tear_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TURQUOISE_TEAR_ORE = registerBlock("turquoise_tear_ore",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).sound(SoundType.AMETHYST_CLUSTER)));
    public static final RegistryObject<Block> WHITE_DIAMOND_TEAR_BLOCK = registerBlock("white_diamond_tear_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> WHITE_DIAMOND_TEAR_ORE = registerBlock("white_diamond_tear_ore",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).sound(SoundType.AMETHYST_CLUSTER)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
