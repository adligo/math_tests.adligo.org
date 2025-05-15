package org.adligo.math.shared.huge;

import java.math.BigInteger;
import java.util.List;

import org.adligo.i_math.shared.IntType;
import org.adligo.tests4j.shared.asserts.reference.CircularDependencies;
import org.adligo.tests4j.system.shared.trials.SourceFileScope;
import org.adligo.tests4j4jj.JjSourceFileTrial;
import org.junit.jupiter.api.Test;

/**
 * Tests of  <br/>
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
@SourceFileScope (sourceClass = HugeIntCounter.class, minCoverage = 100, allowedCircularDependencies = CircularDependencies.AllowInPackage )
public class HugeCounterSourceFileTrial extends JjSourceFileTrial {

	@Test
	public void test120_140() {
		HugeCounter hc = new HugeCounter(120);
		equals(ByteCounter.class.getName(), hc.getDelegate().getClass().getName());
		for (int i = 1; i < 17; i++) {
			hc.increment();
			equals(i + 120, hc.toInt());
		}
		equals(ShortCounter.class.getName(), hc.getDelegate().getClass().getName());
	}
	
	@Test
	public void test0_1000() {
		HugeCounter hc = new HugeCounter();
		for (int i = 0; i < 1001; i++) {
			//System.out.println("i is " + i );
			hc.increment();
			equals(i + 1, hc.toInt());
		}
	}
	
	@Test
	public void testShortToInt() {
		int j = Short.MAX_VALUE - 25;
		HugeCounter hc = new HugeCounter(j);
		equals(ShortCounter.class.getName(), hc.getDelegate().getClass().getName());
		for (int i = 1; i < 50; i++) {
			hc.increment();
			equals(i + j, hc.toInt());
		}
		equals(IntCounter.class.getName(), hc.getDelegate().getClass().getName());
	}

	@Test
	public void testIntToLong() {
		long j = Integer.MAX_VALUE - 50;
		HugeCounter hc = new HugeCounter(j);
		equals(IntCounter.class.getName(), hc.getDelegate().getClass().getName());
		for (long i = 1; i < 150; i++) {
			hc.increment();
			equals(i + j, hc.toLong());
		}
		equals(LongCounter.class.getName(), hc.getDelegate().getClass().getName());
	}
	
	@Test
	public void testLongToBig() {
		//BigInteger j = BigInteger.valueOf(Long.MAX_VALUE - 5500090999999000000L);
		BigInteger j = BigInteger.valueOf(Long.MAX_VALUE - 1500000L);
		HugeCounter hc = new HugeCounter(j);
		equals(LongCounter.class.getName(), hc.getDelegate().getClass().getName());
		for (long i = 1; i < 1500000L; i++) {
			hc.increment();
			equals(j.add(BigInteger.valueOf(i)), hc.toBig());
		}
		equals(BigCounter.class.getName(), hc.getDelegate().getClass().getName());
	}
	
	@Test
	public void testByteCounter() {
		ByteCounter bc = new ByteCounter();
		isTrue(bc.isByte());
		equals((byte) 0, bc.toByte());
		equals((short) 0, bc.toShort());
		equals((int) 0, bc.toInt());
		equals((long) 0, bc.toLong());
		equals(BigInteger.ZERO, bc.toBig());
		//HugeIntByteDelegate not yet implemented TODO!
		bc.increment();
		equals((byte) 1, bc.toByte());
		equals(IntType.Byte, bc.getType());
	}
	
	@Test
	public void testShortCounter() {
		short p1 = ((short) Byte.MAX_VALUE) + 1;
		ShortCounter sc = new ShortCounter(p1);
		isFalse(sc.isByte());
		isTrue(sc.isShort());
		thrown(List.of(new IllegalStateException(ShortCounter.THE_CURRENT_VALUE_DOES_NOT_FIT_INTO_A_BYTE)), () -> 
			{ sc.toByte(); });
		equals(p1, sc.toShort());
		equals((int) p1, sc.toInt());
		equals((long) p1, sc.toLong());
		equals(BigInteger.valueOf(p1), sc.toBig());
		//HugeIntShortDelegate not yet implemented TODO!
		sc.increment();
		equals((short) 129, sc.toShort());
		equals(IntType.Short, sc.getType());
	}
	
	@Test
	public void testIntCounter() {
		int p1 = ((int) Short.MAX_VALUE) + 1;
		IntCounter sc = new IntCounter(p1);
		isFalse(sc.isByte());
		isFalse(sc.isShort());
		isTrue(sc.isInt());
		thrown(List.of(new IllegalStateException(ShortCounter.THE_CURRENT_VALUE_DOES_NOT_FIT_INTO_A_BYTE)), () -> 
			{ sc.toByte(); });
		thrown(List.of(new IllegalStateException(ShortCounter.THE_CURRENT_VALUE_DOES_NOT_FIT_INTO_A_SHORT)), () -> 
			{ sc.toShort(); });
		equals(p1, sc.toInt());
		equals((long) p1, sc.toLong());
		equals(BigInteger.valueOf(p1), sc.toBig());
		//HugeIntShortDelegate not yet implemented TODO!
		sc.increment();
		equals(32769, sc.toInt());
		equals(IntType.Int, sc.getType());
	}
	
	@Test
	public void testLongCounter() {
		long p1 = ((long) Integer.MAX_VALUE) + 1;
		LongCounter sc = new LongCounter(p1);
		isFalse(sc.isByte());
		isFalse(sc.isShort());
		isFalse(sc.isInt());
		isTrue(sc.isLong());
		thrown(List.of(new IllegalStateException(ShortCounter.THE_CURRENT_VALUE_DOES_NOT_FIT_INTO_A_BYTE)), () -> 
			{ sc.toByte(); });
		thrown(List.of(new IllegalStateException(ShortCounter.THE_CURRENT_VALUE_DOES_NOT_FIT_INTO_A_SHORT)), () -> 
			{ sc.toShort(); });
		thrown(List.of(new IllegalStateException(ShortCounter.THE_CURRENT_VALUE_DOES_NOT_FIT_INTO_AN_INT)), () -> 
			{ sc.toInt(); });
		equals(p1, sc.toLong());
		equals(BigInteger.valueOf(p1), sc.toBig());
		//HugeIntShortDelegate not yet implemented TODO!
		sc.increment();
		long t = 2147483649L;
		equals(t, sc.toLong());
		equals(IntType.Long, sc.getType());
	}
	
	@Test
	public void testBigCounter() {
		BigInteger p1 = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
		BigCounter bc = new BigCounter(p1);
		isFalse(bc.isByte());
		isFalse(bc.isShort());
		isFalse(bc.isInt());
		isFalse(bc.isLong());
		isTrue(bc.isBig());
		thrown(List.of(new IllegalStateException(ShortCounter.THE_CURRENT_VALUE_DOES_NOT_FIT_INTO_A_BYTE)), () -> 
			{ bc.toByte(); });
		thrown(List.of(new IllegalStateException(ShortCounter.THE_CURRENT_VALUE_DOES_NOT_FIT_INTO_A_SHORT)), () -> 
			{ bc.toShort(); });
		thrown(List.of(new IllegalStateException(ShortCounter.THE_CURRENT_VALUE_DOES_NOT_FIT_INTO_AN_INT)), () -> 
			{ bc.toInt(); });
		thrown(List.of(new IllegalStateException(ShortCounter.THE_CURRENT_VALUE_DOES_NOT_FIT_INTO_A_LONG)), () -> 
			{ bc.toLong(); });
		equals(p1, bc.toBig());
		//HugeIntShortDelegate not yet implemented TODO!
		bc.increment();
		equals(p1.add(BigInteger.ONE), bc.toBig());
		equals(IntType.Big, bc.getType());
	}
	
	@Test
	public void testHugeCounter() {
		//todo HugeInt isn't working now
	}
}
