package com.fosanzdev.T11.Ej5Adv.Items;

import com.fosanzdev.T11.Ej5Adv.Items.Consumables.Apple;
import com.fosanzdev.T11.Ej5Adv.Items.Consumables.Axe;
import com.fosanzdev.T11.Ej5Adv.Items.Consumables.GoldenBoots;
import com.fosanzdev.T11.Ej5Adv.Items.Consumables.IronSword;
import com.fosanzdev.T11.Ej5Adv.Items.Consumables.Potions.HealingPotion;
import com.fosanzdev.T11.Ej5Adv.Items.Consumables.Potions.LargeHealingPotion;
import com.fosanzdev.T11.Ej5Adv.Items.Consumables.Potions.NightVisionPotion;
import com.fosanzdev.T11.Ej5Adv.Items.Generators.AcaciaBoat;
import com.fosanzdev.T11.Ej5Adv.Items.Generators.Bow;
import com.fosanzdev.T11.Ej5Adv.Items.Objects.Book;
import com.fosanzdev.T11.Ej5Adv.Items.Objects.EnchantedBook;
import com.fosanzdev.T11.Ej5Adv.Items.Objects.Leather;

public class Correspondences {

    public static final Class<?>[] classes = {
            HealingPotion.class,
            LargeHealingPotion.class,
            NightVisionPotion.class,
            Apple.class,
            Axe.class,
            GoldenBoots.class,
            IronSword.class,
            AcaciaBoat.class,
            Bow.class,
            Book.class,
            EnchantedBook.class,
            Leather.class
    };

    public static int findID(Object a){
        for (int i = 0; i < classes.length; i++) {
            if (classes[i] == a.getClass()) {
                return i;
            }
        }
        return -1;
    }

    public static boolean compare(Object a, Object b){
        if (a == null || b == null) return false;
        return findID(a) == findID(b);
    }
}
