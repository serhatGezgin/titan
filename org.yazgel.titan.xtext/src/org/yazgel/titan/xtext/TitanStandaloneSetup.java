/*
* generated by Xtext
*/
package org.yazgel.titan.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TitanStandaloneSetup extends TitanStandaloneSetupGenerated{

	public static void doSetup() {
		new TitanStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

