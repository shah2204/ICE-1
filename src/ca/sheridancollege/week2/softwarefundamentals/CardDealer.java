/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 * Name:-Shreyaben Kamleshbhai Shah
 * SID:-991631315
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("diamonds", 9);
        nineClubs.setSuit("diamonds");
        Card queen = new Card("clubs", 9);
        queen.setSuit("clubs");
        Card king = new Card("spades", 9);
        king.setSuit("spades");
        Card white = new Card("hearts", 9);
        white.setSuit("hearts");
        System.out.println("queen.getSuit()");
        System.out.println("black.getSuit()");
    }
}
