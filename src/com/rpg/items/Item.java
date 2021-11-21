package com.rpg.items;

public class Item {

    public enum ItemType {
        WEAPON,
        ARMOR,
        POTION,
        SHIELD,
        HELMET,
        BOOTS,
        RING,
    }

    protected String name;
    protected ItemType itemType;

    public Item(String name, ItemType itemType) {
        this.name = name;
        this.itemType = itemType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", itemType=" + itemType +
                '}';
    }
}
