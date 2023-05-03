package com.fosanzdev.T11.Ej5Adv.Items.Consumables.Potions;

import com.fosanzdev.T11.Ej5Adv.ItemCore.Consumables;
import com.fosanzdev.T11.Ej5Adv.ItemCore.Modifier;

import java.util.HashMap;
import java.util.Map;

public abstract class Potion extends Consumables {
    private HashMap<Modifier, Integer> modifiers;
    private int duration;

    public Potion(Map<Modifier, Integer> args, int duration){
        super("Potion", 0);
        this.modifiers = new HashMap<>(args);
        this.duration = duration;
    }

    public HashMap<Modifier, Integer> getModifiers(){
        return modifiers;
    }
}
