/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package parser;

import java.util.ArrayList;

/**
 *
 * @author GBEMIRO
 */
public final class PermutationOperator extends BinaryOperator{


    
//Р

/**
 * Creates an object of class
 * PermutationOperator
 *
 * @param index the index of this object in its
 * parent Function object's scanner.
 * @param scan the Function object in which this
 * PermutationOperator exists.
 *
 */
    public PermutationOperator( int index,ArrayList<String>scan){
        super(PERMUTATION, index, scan);
    }//end constructor


   

}
