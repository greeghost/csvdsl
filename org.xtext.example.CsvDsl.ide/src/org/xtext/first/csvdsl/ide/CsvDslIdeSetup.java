/*
 * generated by Xtext 2.28.0
 */
package org.xtext.first.csvdsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.first.csvdsl.CsvDslRuntimeModule;
import org.xtext.first.csvdsl.CsvDslStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class CsvDslIdeSetup extends CsvDslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new CsvDslRuntimeModule(), new CsvDslIdeModule()));
	}
	
}
