package devghurt.something;

public class ModItemIds {
    public static ResourceKey<Item> create(String name) {
        return ResourceKey.create(Registries.ITEM, ExampleMod.id(name));
    }
}
