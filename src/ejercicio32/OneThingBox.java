/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio32;

/**
 *
 * @author julia
 */
public class OneThingBox extends Box {
    
    Thing containedThing;
    
    public void add(Thing thing)
    {
        if(containedThing==null)
        {
            containedThing = thing;
        }
    }
    
    public boolean isInTheBox(Thing thing)
    {
        return thing.equals(this.containedThing);
    }
}
