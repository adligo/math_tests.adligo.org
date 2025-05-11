package org.adligo.math_tests.shared;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

import org.adligo.math.shared.HugeInt;
import org.adligo.math.shared.IntArrayLink;
import org.adligo.tests4j4jj.JjSourceFileTrial;
import org.junit.jupiter.api.Test;
/**
 * Tests for the <{@link IntArrayLink} class.
 * <br/>
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
public class IntArrayLinkSourceFileTrial extends JjSourceFileTrial {

	/**
	 * I think there is a bug in BigInteger here potentially, 2 ^ (32*8) should result in a even bit number but 
	 * BigInteger is giving a odd number, weird
	 */
	public static final BigInteger BI = new BigInteger("2").pow(32 * 8).subtract(BigInteger.ONE);
	
	@Test
	public void testConstructors() {
		equals("This should match", BigInteger.ZERO, new IntArrayLink(new int[] {0}).toBig());
		equals("This should match", BigInteger.ONE, new IntArrayLink(new int[] {1}).toBig());
		equals("This should match", BI, new IntArrayLink(BI).toBig());
		
	}
	
	@Test
	public void testAdd() {
		int [] na = new int[1];
		na[0] = 7;
		
		int [] nb = new int[1];
		nb[0] = 17;
		
		equals("This should match", new BigInteger("24"), 
				new IntArrayLink(na).add(new IntArrayLink(nb)));
		
		System.out.println("hey bi is " + BI);
		equals("This should match", new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639942"), 
				new IntArrayLink(na).add(new IntArrayLink(BI)));
	}
	
	
	@Test
	public void testIncrementFromZeroTo1000() {
		for (int i = 0; i < 1000; i++) {
			int [] na = new int[1];
			na[0] = i;
			equals("This should be the max value all ones", new BigInteger("" + i), 
					new IntArrayLink(na).toBig());
		}
	}

	@Test
	public void testDecrementFromMaxMinus1000() {
		//String result = Integer.toHexString(IntArrayLink.ALL_ONES);
		//System.out.print("result is " + result);
		int [] eightOnes = new int [8];
		for (int i = 0; i < 8; i++) {
			eightOnes[i] = IntArrayLink.ALL_ONES;
			
		}
		IntArrayLink l1 = new IntArrayLink(eightOnes);
		equals("This should be the max value all ones", new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639935"), l1.toBig());
		
	}
}
