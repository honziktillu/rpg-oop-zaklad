package com.rpg;

import com.rpg.items.Item;
import com.rpg.items.Weapons;

public class Main {

    public static void main(String[] args) {
        Item weapon = Weapons.SWORD.getItem();
        System.out.println(weapon);
    }
}
