/**
 * 
 */
package com.thoughtworks.assignment;

import com.thoughtworks.assignment.exception.MerchantGalaxyException;

/**
 * @author Kashif
 *
 */
public class GalaxyLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws MerchantGalaxyException{
		String inputFile = null;
		if(args.length > 0){
			inputFile = args[0];
			System.out.println("Command line Input file parameter: "+ inputFile);
		}
	}
}
