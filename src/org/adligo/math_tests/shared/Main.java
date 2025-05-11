package org.adligo.math_tests.shared;

import java.io.Writer;

import org.junit.platform.console.ConsoleLauncher;
import org.junit.platform.console.options.CommandLineOptions;
import org.junit.platform.console.options.CommandLineOptionsParser;

public class Main {

	public static void main(String [] args) {
		ConsoleLauncher.execute(System.out, System.err, 
				//"--scan-classpath -c org.adligo.math_tests.shared.MathCtxSorceFileTrial");
				//"--list-engines");
				" -cp bin/default:../i_math.adligo.org/bin/default:../math.adligo.org/bin/default");
	}
}
