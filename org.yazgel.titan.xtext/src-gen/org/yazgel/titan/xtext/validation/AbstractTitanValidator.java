/*
 * generated by Xtext
 */
package org.yazgel.titan.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractTitanValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.yazgel.titan.xtext.titan.TitanPackage.eINSTANCE);
		return result;
	}
}
