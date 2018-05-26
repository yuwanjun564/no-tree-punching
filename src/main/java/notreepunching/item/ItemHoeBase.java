package notreepunching.item;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import notreepunching.NoTreePunching;
import notreepunching.client.ModTabs;

public class ItemHoeBase extends ItemHoe {

    public String name;

    public ItemHoeBase(ToolMaterial material, String name){
        super(material);
        this.name = name;

        register();
    }

    public void register(){
        ModItems.addItemToRegistry(this, name, ModTabs.TOOLS_TAB);
        NoTreePunching.proxy.addModelToRegistry(new ItemStack(this), this.getRegistryName(), "inventory");
    }
}
