package com.leviathan143.ellipsis.client;

import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.leviathan143.ellipsis.common.CommonProxy;
import com.leviathan143.ellipsis.common.blocks.EllipsisBlocks;
import com.leviathan143.ellipsis.common.items.EllipsisItems;

public class ClientProxy extends CommonProxy
{
	SoundEventHandler soundEventHandler = new SoundEventHandler();
	
	@Override
	public void preInit(FMLPreInitializationEvent event) 
	{	
		super.preInit(event);
	}

	@Override
	public void init(FMLInitializationEvent event) 
	{
		super.init(event);
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) 
	{
		super.postInit(event);
		MinecraftForge.EVENT_BUS.register(soundEventHandler);
	}
	
	@Override
	public void registerModels()
	{
		for(Block block : EllipsisBlocks.blockList)
		{
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
		}
		for(Item item : EllipsisItems.itemList)
		{
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		}
	}
}