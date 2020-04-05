package me.meponder.infdim.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class footprint
{
    public static final Item FOOTPRINT = register("footprint", new Item(new Item.Settings().group(ItemGroup.MISC)));


    public static Item register(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier("infdim", name), item);
    }

    public static void init()
    {

    }

}