package me.meponder.infdim;


import me.meponder.infdim.items.footprint;
import me.meponder.infdim.items.fine_item;
import net.fabricmc.api.ModInitializer;

public class main implements ModInitializer
{
    @Override
    public void onInitialize() {
        //Items
        footprint.init();
        fine_item.init();
    }

}
