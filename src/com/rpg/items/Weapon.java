package com.rpg.items;

public class Weapon extends Item {

    private double dmg;
    private double manaUsage;

    public Weapon(String name, double dmg, double manaUsage) {
        super(name, ItemType.WEAPON);
        this.dmg = dmg;
        this.manaUsage = manaUsage;
    }

    public double getDmg() {
        return dmg;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    public double getManaUsage() {
        return manaUsage;
    }

    public void setManaUsage(double manaUsage) {
        this.manaUsage = manaUsage;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", itemType=" + itemType +
                ", dmg=" + dmg +
                ", manaUsage=" + manaUsage +
                '}';
    }
}
