/*
 * generated by Xtext 2.28.0
 */
package org.xtext.first.csvdsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.CsvDsl.ui.internal.CsvDslActivator;

public class CsvDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return CsvDslActivator.getInstance().getInjector("org.xtext.first.csvdsl.CsvDsl");
	}

}
