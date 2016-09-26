/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio32;

import java.util.Collection;
import java.util.ArrayList;

/**
 *
 * @author julia
 */
public class MaxWeightBox extends Box {

    double maxWeight;
    double currentWeight = 0;
    Collection<Thing> things = new ArrayList<>();

    //Constructor
    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    //Metodo add
    public void add(Thing thing) {
        if (thing.weight + this.currentWeight <= maxWeight) {
            things.add(thing);
            currentWeight += thing.weight;
        }
    }

    //Definiendo is in the box
    @Override
    public boolean isInTheBox(Thing thing) {
        for (Thing x : things) {
            if (x.equals(thing)) {
                return true;
            }
        }
        return false;
    }
}
