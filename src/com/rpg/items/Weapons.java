package com.rpg.items;

public enum Weapons {
    SWORD(new Weapon("Sword", Weapons.dmg, Weapons.manaUsage)),
    BOW(new Weapon("Bow", Weapons.dmg * 0.7, Weapons.manaUsage * 0.7)),
    STAFF(new Weapon("Staff", Weapons.dmg * 0.5, Weapons.manaUsage * 0.5));

    private Item item;
    private static final double dmg = 10;
    private static final double manaUsage = 20;

    Weapons(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Weapons{" +
                "item=" + item +
                '}';
    }
}
