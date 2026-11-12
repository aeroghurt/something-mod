package devghurt.something;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class ModItemIds {
    public static ResourceKey<Item> create(String name) {
        return ResourceKey.create(Registries.ITEM, Main.id(name));
    }

    public static final ResourceKey<Item> SUSPICIOUS_SUBSTANCE = create("suspicious_substance");

    public static final ResourceKey<Item> POISONOUS_APPLE = create("poisonous_apple");
}
