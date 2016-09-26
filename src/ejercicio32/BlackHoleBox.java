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
public class BlackHoleBox extends Box{
    public void add(Thing thing)
    {
        System.out.println("GoodBye Thing!");
    }
    
    public boolean isInTheBox(Thing thing)
    {
        return false;
    }
}
