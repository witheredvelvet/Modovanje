
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modovanje.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.modovanje.block.WazowskiBlock;
import net.mcreator.modovanje.ModovanjeMod;

public class ModovanjeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ModovanjeMod.MODID);
	public static final RegistryObject<Block> WAZOWSKI = REGISTRY.register("wazowski", () -> new WazowskiBlock());
}
