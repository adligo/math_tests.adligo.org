package org.adligo.math.shared.huge;

import java.math.BigInteger;
import java.util.Iterator;

import org.adligo.i_math.shared.huge.HugeConstants;
import org.adligo.tests4j.shared.asserts.reference.CircularDependencies;
import org.adligo.tests4j.system.shared.trials.SourceFileScope;
import org.adligo.tests4j4jj.JjSourceFileTrial;
import org.junit.jupiter.api.Test;

/**
 * Tests for {@link HugeConstants}
 *
 * 
 * @author scott<br/>
 *         <br/>
 * 
 * <pre><code>
 * ---------------- Apache ICENSE-2.0 --------------------------
 *
 * Copyright 2025 Adligo Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </code><pre>
 */
@SourceFileScope (sourceClass = HugeConstants.class, minCoverage = 100, allowedCircularDependencies = CircularDependencies.Na)
public class HugeConstantsSourceFileTrial extends JjSourceFileTrial {

	/**
	 * Notes to self 
	 * BigInteger has a constructor that takes bytes, however this is the BigInteger's
	 * strange format, this hexadecimal toString and constructor makes a lot more sense to me! 
	 */
	@Test
	public void testMaxChunkAllFs() {
		String hex = HugeConstants.MAX_CHUNK.toString(16);
		for (int i = 0; i < hex.length(); i++) {
			char c = hex.charAt(i);
			equals('f', c);
		}
		equals(HugeConstants.MAX_CHUNK, new BigInteger(hex, 16));
		equals(HugeConstants.MAX_CHUNK_BYTES, hex.length() / 2);
	}
}
