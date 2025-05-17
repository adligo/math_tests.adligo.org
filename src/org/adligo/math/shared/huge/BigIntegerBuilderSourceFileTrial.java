package org.adligo.math.shared.huge;

import java.math.BigInteger;
import java.util.Iterator;

import org.adligo.i_math.shared.huge.HugeConstants;
import org.adligo.tests4j.shared.asserts.reference.CircularDependencies;
import org.adligo.tests4j.system.shared.trials.SourceFileScope;
import org.adligo.tests4j4jj.JjSourceFileTrial;
import org.junit.jupiter.api.Test;

/**
 * Tests for {@link BigIntegerBuilder}
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
@SourceFileScope (sourceClass = BigIntegerBuilder.class, minCoverage = 100, allowedCircularDependencies = CircularDependencies.Na)
public class BigIntegerBuilderSourceFileTrial extends JjSourceFileTrial {

	@Test
	public void testFromSingleByte() {
		for (int i = Byte.MIN_VALUE; i <= Byte.MAX_VALUE; i++) {
			BigInteger b = BigInteger.valueOf(i);
			byte [] ba = b.toByteArray();
			BigInteger bi = BigIntegerBuilder.from(ba);		
			equals(b, bi);
		}
	}
	
	@Test
	public void testFromSingleShort() {
		for (int i = Short.MIN_VALUE; i <= Short.MAX_VALUE; i++) {
			BigInteger b = BigInteger.valueOf(i);
			byte [] ba = b.toByteArray();
			BigInteger bi = BigIntegerBuilder.from(ba);		
			equals("bytes are " + ba,  b, bi);
		}
	}

	
	@Test
	public void testToStream() {
		BigInteger b = HugeConstants.MAX_CHUNK.add(BigInteger.TEN);
		Iterator<BigInteger> s = BigIntegerBuilder.split(b).iterator();
		BigInteger b1 = s.next();
		equals(BigInteger.valueOf(9), b1);
		BigInteger b2 = s.next();
		equals(BigInteger.valueOf(1), b2);
		isFalse(s.hasNext());
		
		String s1 = BigIntegerBuilder.toHexWithPad(b1);
		String s2 = b2.toString(16);
		equals(b.toString(16), s2 + s1);
	}
	
	@Test
	public void testToHexWithPad() {
		String s = BigIntegerBuilder.toHexWithPad(BigInteger.TWO, HugeConstants.MAX_CHUNK_BYTES * 2);
		int len = HugeConstants.MAX_CHUNK_BYTES * 2;
		equals(len, s.length());
		for (int i = 0; i < len - 1; i++) {
			equals('0', s.charAt(i));
		}
		equals('2', s.charAt(95));
		
		
	}
}
