/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio32;

import java.util.Objects;

/**
 *
 * @author julia
 */
public class Thing {
    double weight;
    String name;
    
    public Thing(String name, double weight)
    {
        if(weight<0)
        {
            throw new IllegalArgumentException(Double.toString(weight));
        }
        this.name = name;
        this.weight = weight;
    }
    
    public Thing(String name)
    {
        this.name = name;
    }

    @Override
    public int hashCode() {
        if(this.name == null)
        {
            return 7;
        }
        return name.hashCode();
    }
    
    @Override
    public boolean equals(Object object)
    {
        if(getClass()!=object.getClass())
        {
            return false;
        }
        
        Thing thing = (Thing) object;
        
        if(this.name == null || !this.name.equals(thing.name))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
