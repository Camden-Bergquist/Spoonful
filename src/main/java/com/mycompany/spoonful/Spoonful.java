package com.mycompany.spoonful;

public class Spoonful {

    private static final int TEASPOONS_IN_A_TABLESPOON = 3;

    private int tablespoons;
    private int teaspoons;

    public Spoonful( int tablespoons, int teaspoons ) {
	this.tablespoons = tablespoons;
	this.teaspoons = teaspoons;
    } // Spoonful( int, int )

    public Spoonful add( Spoonful otherSpoonful ) {
	int tbsp = this.tablespoons + otherSpoonful.tablespoons;
	int tsp = this.teaspoons + otherSpoonful.teaspoons;
	Spoonful sum = new Spoonful( tbsp + tsp/TEASPOONS_IN_A_TABLESPOON,
				 tsp % TEASPOONS_IN_A_TABLESPOON );
        return sum;
    } // add( Spoonful )

    @Override
    public String toString() {
	return this.tablespoons + " tbsp, " + this.teaspoons + " tsp";
    } // toString()

    public static void main( String[] args ) {
	Spoonful sugar = new Spoonful( 1, 5 );
	Spoonful medicine = new Spoonful( 2, 2 );
	Spoonful mix = sugar.add( medicine );
	System.out.println(sugar + " + " + medicine + " = " + mix );
    } // main( String[] )

    
}