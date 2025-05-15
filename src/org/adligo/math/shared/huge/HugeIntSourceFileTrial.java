package org.adligo.math.shared.huge;

import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.stream.IntStream;

import org.adligo.i_math.shared.huge.I_HugeInt;
import org.adligo.tests4j4jj.JjSourceFileTrial;
import org.junit.jupiter.api.Test;

/**
 * Tests for the <{@link HugeInt} class.
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

public class HugeIntSourceFileTrial extends JjSourceFileTrial {

	@Test
	public void testIntConstructor() {
		equals(7, new HugeInt(7).toInt());
		equals(0, new HugeInt(0).toInt());
		equals(1, new HugeInt(1).toInt());
		equals(2, new HugeInt(2).toInt());
	}
	
	@Test
	public void testStreamConstructor0_23Singles() {
		for (int i = 0; i < 24; i++) {
			System.out.println("testStreamConstructor0_23Singles at i " + i);
			HugeInt hi = new HugeInt(false, IntStream.of(i));
			isTrue(hi.isInt());
			equals(i, hi.toInt());
		}
	}
	
	@Test
	public void testStreamConstructor0_23() {
		HugeInt hi = new HugeInt(false, IntStream.range(0, 23));
	}
	
	@Test
	public void testAdd0_23() {
		HugeInt hi = new HugeInt(0);
		for (int i = 0; i < 24; i++) {
			System.out.println("testAdd0_23 at i " + i);
			HugeInt n = new HugeInt(i);
			assertInt(i, hi.add(n));
		}
	}
	
	@Test
	public void testIncrement0_23() {
		I_HugeInt hi = new HugeInt(0);
		for (int i = 1; i < 24; i++) {
			System.out.println("testIncrement0_23 at i " + i);
			hi = hi.add(HugeInt.ONE);
			assertInt(i, hi);
		}
	}

	
	@Test
	public void testLittleToBigIntStream(){
		LittleToBigIntStream s = new LittleToBigIntStream(new HugeInt(3));
		isTrue(s.isNotDone().test(0));
		equals(3, s.getAsInt());
		isTrue(s.isNotDone().test(3));
		isFalse(s.isNotDone().test(0));
	}

	@Test
	public void testAddStream0_plus_0() {
		AddStream as = new AddStream(IntStream.of(0).iterator(), IntStream.of(0).iterator());
		assertNext(0, as);
		//this is called in takeWhile so that 
		isTrue(as.isNotDone().test(0));
		isFalse(as.isNotDone().test(0));
	}
	
	@Test
	public void testAddStream0_plus_0takeWhile() {
		AddStream as = new AddStream(HugeInt.ZERO.toStream().iterator(), HugeInt.ZERO.toStream().iterator());
		PrimitiveIterator.OfInt it = IntStream.generate(as).takeWhile(as.isNotDone()).iterator();
		isTrue(it.hasNext());
		equals(0, it.next());
		isFalse(it.hasNext());
	}
	
	@Test
	public void testAddStream9_plus_2() {
		AddStream as = new AddStream(IntStream.of(9).iterator(), IntStream.of(2).iterator());
		assertNext(11, as);
		isTrue(as.isNotDone().test(11));
		isFalse(as.isNotDone().test(0));
	}
	
	@Test
	public void testAddStream0_9_plus_0_2() {
		AddStream as = new AddStream(IntStream.range(0, 10).iterator(), IntStream.range(0, 3).iterator());
		assertNext(0, as);
		assertNext(2, as);
		assertNext(4, as);
		assertNext(3, as);
		for (int i = 4; i < 10; i++) {
			assertNext(i, as);
		}
		isTrue(as.isNotDone().test(9));
		isFalse(as.isNotDone().test(0));
	}

	private void assertInt(int expected, I_HugeInt hi) {
		isTrue(hi.isInt());
		equals(expected, hi.toInt());
	}
	
	private void assertNext(int expected, AddStream as) {
		isTrue(as.isNotDone().test(0));
		equals(expected, as.getAsInt());
	}
}
