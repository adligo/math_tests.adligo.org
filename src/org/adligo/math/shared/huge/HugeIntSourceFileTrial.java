package org.adligo.math.shared.huge;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

import org.adligo.i_math.shared.huge.HugeConstants;
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
	public void testByteConstructor() {
		isTrue(new HugeInt((byte) 7).isByte());
		isTrue(new HugeInt((byte) 7).isShort());
		isTrue(new HugeInt((byte) 7).isInt());
		isTrue(new HugeInt((byte) 7).isLong());
		isTrue(new HugeInt((byte) 7).isBig());
		equals((byte) 7, new HugeInt((byte) 7).toByte());
		isTrue(new HugeInt((byte) 7).isPositive());
		Iterator<BigInteger> sbi = new HugeInt((byte) 7).toStream().iterator();
		equals(BigInteger.valueOf(7), sbi.next());
		isNull(sbi.next());
		
		isTrue(new HugeInt((byte) 0).isByte());
		isTrue(new HugeInt((byte) 0).isShort());
		isTrue(new HugeInt((byte) 0).isInt());
		isTrue(new HugeInt((byte) 0).isLong());
		isTrue(new HugeInt((byte) 0).isBig());
		equals((byte) 0, new HugeInt((byte) 0).toByte());
		isTrue(new HugeInt((byte) 0).isPositive());
		sbi = new HugeInt((byte) 0).toStream().iterator();
		equals(BigInteger.valueOf(0), sbi.next());
		isNull(sbi.next());
		
		isTrue(new HugeInt((byte) 1).isByte());
		isTrue(new HugeInt((byte) 1).isShort());
		isTrue(new HugeInt((byte) 1).isInt());
		isTrue(new HugeInt((byte) 1).isLong());
		isTrue(new HugeInt((byte) 1).isBig());
		equals((byte) 1, new HugeInt((byte) 1).toByte());
		isTrue(new HugeInt((byte) 1).isPositive());
		sbi = new HugeInt((byte) 1).toStream().iterator();
		equals(BigInteger.valueOf(1), sbi.next());
		isNull(sbi.next());
		
		isTrue(new HugeInt((byte) 2).isByte());
		isTrue(new HugeInt((byte) 2).isShort());
		isTrue(new HugeInt((byte) 2).isInt());
		isTrue(new HugeInt((byte) 2).isLong());
		isTrue(new HugeInt((byte) 2).isBig());
		equals((byte) 2, new HugeInt((byte) 2).toByte());
		isTrue(new HugeInt((byte) 2).isPositive());
		sbi = new HugeInt((byte) 2).toStream().iterator();
		equals(BigInteger.valueOf(2), sbi.next());
		isNull(sbi.next());
		
		isTrue(new HugeInt((byte) 10).isByte());
		isTrue(new HugeInt((byte) 10).isShort());
		isTrue(new HugeInt((byte) 10).isInt());
		isTrue(new HugeInt((byte) 10).isLong());
		isTrue(new HugeInt((byte) 10).isBig());
		equals((byte) 10, new HugeInt((byte) 10).toByte());
		isTrue(new HugeInt((byte) 10).isPositive());
		sbi = new HugeInt((byte) 10).toStream().iterator();
		equals(BigInteger.valueOf(10), sbi.next());
		isNull(sbi.next());
		
		isTrue(new HugeInt((byte) -7).isByte());
		isTrue(new HugeInt((byte) -7).isShort());
		isTrue(new HugeInt((byte) -7).isInt());
		isTrue(new HugeInt((byte) -7).isLong());
		isTrue(new HugeInt((byte) -7).isBig());
		equals((byte) -7, new HugeInt((byte) -7).toByte());
		isFalse(new HugeInt((byte) -7).isPositive());
		sbi = new HugeInt((byte) -7).toStream().iterator();
		equals(BigInteger.valueOf(7), sbi.next());
		isNull(sbi.next());
		
		isTrue(new HugeInt((byte) -1).isByte());
		isTrue(new HugeInt((byte) -1).isShort());
		isTrue(new HugeInt((byte) -1).isInt());
		isTrue(new HugeInt((byte) -1).isLong());
		isTrue(new HugeInt((byte) -1).isBig());
		equals((byte) -1, new HugeInt((byte) -1).toByte());
		isFalse(new HugeInt((byte) -1).isPositive());
		sbi = new HugeInt((byte) -1).toStream().iterator();
		equals(BigInteger.valueOf(1), sbi.next());
		isNull(sbi.next());
		
		isTrue(new HugeInt((byte) -2).isByte());
		isTrue(new HugeInt((byte) -2).isShort());
		isTrue(new HugeInt((byte) -2).isInt());
		isTrue(new HugeInt((byte) -2).isLong());
		isTrue(new HugeInt((byte) -2).isBig());
		equals((byte) -2, new HugeInt((byte) -2).toByte());
		isFalse(new HugeInt((byte) -2).isPositive());
		sbi = new HugeInt((byte) -2).toStream().iterator();
		equals(BigInteger.valueOf(2), sbi.next());
		isNull(sbi.next());
		
		isTrue(new HugeInt((byte) -10).isByte());
		isTrue(new HugeInt((byte) -10).isShort());
		isTrue(new HugeInt((byte) -10).isInt());
		isTrue(new HugeInt((byte) -10).isLong());
		isTrue(new HugeInt((byte) -10).isBig());
		equals((byte) -10, new HugeInt((byte) -10).toByte());
		isFalse(new HugeInt((byte) -10).isPositive());
		sbi = new HugeInt((byte) -10).toStream().iterator();
		equals(BigInteger.valueOf(10), sbi.next());
		isNull(sbi.next());
	}
	
	
	@Test
	public void testToByteExceptions() {
		short minMone= ((short) Byte.MIN_VALUE) - 1;
		thrown(List.of(new IllegalStateException(HugeInt.THIS_HUGE_INT_DOESN_T_FIT_INTO_A_BYTE)), () -> {
			new HugeInt(minMone).toByte();
		});
		
		short minPone= ((short) Byte.MAX_VALUE) + 1;
		thrown(List.of(new IllegalStateException(HugeInt.THIS_HUGE_INT_DOESN_T_FIT_INTO_A_BYTE)), () -> {
			new HugeInt(minPone).toByte();
		});
	}
	
	
	@Test
	public void testShortConstructor() {
		isTrue(new HugeInt((short) 7).isByte());
		isTrue(new HugeInt((short) 7).isShort());
		isTrue(new HugeInt((short) 7).isInt());
		isTrue(new HugeInt((short) 7).isLong());
		isTrue(new HugeInt((short) 7).isBig());
		equals((byte) 7, new HugeInt((short) 7).toByte());
		isTrue(new HugeInt((short) 7).isPositive());
		Iterator<BigInteger> sbi = new HugeInt((short) 7).toStream().iterator();
		equals(BigInteger.valueOf(7), sbi.next());
		isNull(sbi.next());
		
		isTrue(new HugeInt((short) 0).isByte());
		isTrue(new HugeInt((short) 0).isShort());
		isTrue(new HugeInt((short) 0).isInt());
		isTrue(new HugeInt((short) 0).isLong());
		isTrue(new HugeInt((short) 0).isBig());
		equals((byte) 0, new HugeInt((short) 0).toByte());
		isTrue(new HugeInt((short) 0).isPositive());
		sbi = new HugeInt((short) 0).toStream().iterator();
		equals(BigInteger.valueOf(0), sbi.next());
		isNull(sbi.next());
		
		isTrue(new HugeInt((short) 1).isByte());
		isTrue(new HugeInt((short) 1).isShort());
		isTrue(new HugeInt((short) 1).isInt());
		isTrue(new HugeInt((short) 1).isLong());
		isTrue(new HugeInt((short) 1).isBig());
		equals((byte) 1, new HugeInt((short) 1).toByte());
		isTrue(new HugeInt((short) 1).isPositive());
		sbi = new HugeInt((short) 1).toStream().iterator();
		equals(BigInteger.valueOf(1), sbi.next());
		isNull(sbi.next());
		
		isTrue(new HugeInt((short) 2).isByte());
		isTrue(new HugeInt((short) 2).isShort());
		isTrue(new HugeInt((short) 2).isInt());
		isTrue(new HugeInt((short) 2).isLong());
		isTrue(new HugeInt((short) 2).isBig());
		equals((byte) 2, new HugeInt((short) 2).toByte());
		isTrue(new HugeInt((short) 2).isPositive());
		sbi = new HugeInt((short) 2).toStream().iterator();
		equals(BigInteger.valueOf(2), sbi.next());
		isNull(sbi.next());		
		
		isTrue(new HugeInt((short) 10).isByte());
		isTrue(new HugeInt((short) 10).isShort());
		isTrue(new HugeInt((short) 10).isInt());
		isTrue(new HugeInt((short) 10).isLong());
		isTrue(new HugeInt((short) 10).isBig());
		equals((byte) 10, new HugeInt((short) 10).toByte());
		isTrue(new HugeInt((short) 10).isPositive());
		sbi = new HugeInt((short) 10).toStream().iterator();
		equals(BigInteger.valueOf(10), sbi.next());
		isNull(sbi.next());		
		
		short minMone= ((short) Byte.MIN_VALUE) - 1;
		isFalse(new HugeInt(minMone).isByte());
		isTrue(new HugeInt(minMone).isShort());
		isTrue(new HugeInt(minMone).isInt());
		isTrue(new HugeInt(minMone).isLong());
		isTrue(new HugeInt(minMone).isBig());
		equals(minMone, new HugeInt(minMone).toShort());
		isFalse(new HugeInt(minMone).isPositive());
		sbi = new HugeInt(minMone).toStream().iterator();
		equals(BigInteger.valueOf(minMone).abs(), sbi.next());
		isNull(sbi.next());		
		
		short minPone= ((short) Byte.MAX_VALUE) + 1;
		isFalse(new HugeInt(minPone).isByte());
		isTrue(new HugeInt(minPone).isShort());
		isTrue(new HugeInt(minPone).isInt());
		isTrue(new HugeInt(minPone).isLong());
		isTrue(new HugeInt(minPone).isBig());
		equals(minPone, new HugeInt(minPone).toShort());
		isTrue(new HugeInt(minPone).isPositive());
		sbi = new HugeInt(minPone).toStream().iterator();
		equals(BigInteger.valueOf(minPone), sbi.next());
		isNull(sbi.next());		
	}

	@Test
	public void testToShortExceptions() {
		int minMone= ((int) Short.MIN_VALUE) - 1;
		thrown(List.of(new IllegalStateException(HugeInt.THIS_HUGE_INT_DOESN_T_FIT_INTO_A_SHORT)), () -> {
			new HugeInt(minMone).toShort();
		});
		
		int minPone= ((int) Short.MAX_VALUE) + 1;
		thrown(List.of(new IllegalStateException(HugeInt.THIS_HUGE_INT_DOESN_T_FIT_INTO_A_SHORT)), () -> {
			new HugeInt(minPone).toShort();
		});
	}
	
	@Test
	public void testIntConstructor() {
		isTrue(new HugeInt(  7).isByte());
		isTrue(new HugeInt(  7).isShort());
		isTrue(new HugeInt(  7).isInt());
		isTrue(new HugeInt(  7).isLong());
		isTrue(new HugeInt(  7).isBig());
		equals((byte) 7, new HugeInt(7).toByte());
		isTrue(new HugeInt(7).isPositive());
		Iterator<BigInteger> sbi = new HugeInt(7).toStream().iterator();
		equals(BigInteger.valueOf(7), sbi.next());
		isNull(sbi.next());
		
		isTrue(new HugeInt(  0).isByte());
		isTrue(new HugeInt(  0).isShort());
		isTrue(new HugeInt(  0).isInt());
		isTrue(new HugeInt(  0).isLong());
		isTrue(new HugeInt(  0).isBig());
		equals((byte) 0, new HugeInt(  0).toByte());
		isTrue(new HugeInt(  0).isPositive());
		sbi = new HugeInt(  0).toStream().iterator();
		equals(BigInteger.valueOf(0), sbi.next());
		isNull(sbi.next());
		
		isTrue(new HugeInt(  1).isByte());
		isTrue(new HugeInt(  1).isShort());
		isTrue(new HugeInt(  1).isInt());
		isTrue(new HugeInt(  1).isLong());
		isTrue(new HugeInt(  1).isBig());
		equals((byte) 1, new HugeInt(  1).toByte());
		isTrue(new HugeInt(  1).isPositive());
		sbi = new HugeInt(  1).toStream().iterator();
		equals(BigInteger.valueOf(1), sbi.next());
		isNull(sbi.next());
		
		isTrue(new HugeInt(  2).isByte());
		isTrue(new HugeInt(  2).isShort());
		isTrue(new HugeInt(  2).isInt());
		isTrue(new HugeInt(  2).isLong());
		isTrue(new HugeInt(  2).isBig());
		equals((byte) 2, new HugeInt(  2).toByte());
		isTrue(new HugeInt(  2).isPositive());
		sbi = new HugeInt(  2).toStream().iterator();
		equals(BigInteger.valueOf(2), sbi.next());
		isNull(sbi.next());		
		
		isTrue(new HugeInt(  10).isByte());
		isTrue(new HugeInt(  10).isShort());
		isTrue(new HugeInt(  10).isInt());
		isTrue(new HugeInt(  10).isLong());
		isTrue(new HugeInt(  10).isBig());
		equals((byte) 10, new HugeInt((byte) 10).toByte());
		isTrue(new HugeInt(  10).isPositive());
		sbi = new HugeInt(  10).toStream().iterator();
		equals(BigInteger.valueOf(10), sbi.next());
		isNull(sbi.next());		
		
		int minMone= (  Byte.MIN_VALUE) - 1;
		isFalse(new HugeInt(minMone).isByte());
		isTrue(new HugeInt(minMone).isShort());
		isTrue(new HugeInt(minMone).isInt());
		isTrue(new HugeInt(minMone).isLong());
		isTrue(new HugeInt(minMone).isBig());
		equals((short) minMone, new HugeInt(minMone).toShort());
		isFalse(new HugeInt(minMone).isPositive());
		sbi = new HugeInt(minMone).toStream().iterator();
		equals(BigInteger.valueOf(minMone).abs(), sbi.next());
		isNull(sbi.next());		
		
		int minPone= (  Byte.MAX_VALUE) + 1;
		isFalse(new HugeInt(minPone).isByte());
		isTrue(new HugeInt(minPone).isShort());
		isTrue(new HugeInt(minPone).isInt());
		isTrue(new HugeInt(minPone).isLong());
		isTrue(new HugeInt(minPone).isBig());
		equals((short) minPone, new HugeInt(minPone).toShort());
		isTrue(new HugeInt(minPone).isPositive());
		sbi = new HugeInt(minPone).toStream().iterator();
		equals(BigInteger.valueOf(minPone), sbi.next());
		isNull(sbi.next());	
		
		int minMoneI= ((int)  Short.MIN_VALUE) - 1;
		isFalse(new HugeInt(minMoneI).isByte());
		isFalse(new HugeInt(minMoneI).isShort());
		isTrue(new HugeInt(minMoneI).isInt());
		isTrue(new HugeInt(minMoneI).isLong());
		isTrue(new HugeInt(minMoneI).isBig());
		equals(minMoneI, new HugeInt(minMoneI).toInt());
		isFalse(new HugeInt(minMoneI).isPositive());
		sbi = new HugeInt(minMoneI).toStream().iterator();
		equals(BigInteger.valueOf(minMoneI).abs(), sbi.next());
		isNull(sbi.next());		
		
		int minPoneI = ((int)  Short.MAX_VALUE) + 1;
		isFalse(new HugeInt(minPoneI).isByte());
		isFalse(new HugeInt(minPoneI).isShort());
		isTrue(new HugeInt(minPoneI).isInt());
		isTrue(new HugeInt(minPoneI).isLong());
		isTrue(new HugeInt(minPoneI).isBig());
		equals(minPoneI, new HugeInt(minPoneI).toInt());
		isTrue(new HugeInt(minPoneI).isPositive());
		sbi = new HugeInt(minPoneI).toStream().iterator();
		equals(BigInteger.valueOf(minPoneI), sbi.next());
		isNull(sbi.next());	
	}
	
	@Test
	public void testToIntExceptions() {
		long minMone= ((long) Integer.MIN_VALUE) - 1;
		thrown(List.of(new IllegalStateException(HugeInt.THIS_HUGE_INT_DOESN_T_FIT_INTO_A_INT)), () -> {
			new HugeInt(minMone).toInt();
		});
		
		long minPone= ((long) Integer.MAX_VALUE) + 1;
		thrown(List.of(new IllegalStateException(HugeInt.THIS_HUGE_INT_DOESN_T_FIT_INTO_A_INT)), () -> {
			new HugeInt(minPone).toInt();
		});
	}
	

	@Test
	public void testLongConstructor() {
		isTrue(new HugeInt((long) 7).isByte());
		isTrue(new HugeInt((long) 7).isShort());
		isTrue(new HugeInt((long) 7).isInt());
		isTrue(new HugeInt((long) 7).isLong());
		isTrue(new HugeInt((long) 7).isBig());
		equals((byte) 7, new HugeInt((long) 7).toByte());
		isTrue(new HugeInt((long) 7).isPositive());
		Iterator<BigInteger> sbi = new HugeInt((long) 7).toStream().iterator();
		equals(BigInteger.valueOf((long) 7), sbi.next());
		isNull(sbi.next());
		
		isTrue(new HugeInt((long) 0).isByte());
		isTrue(new HugeInt((long) 0).isShort());
		isTrue(new HugeInt((long) 0).isInt());
		isTrue(new HugeInt((long) 0).isLong());
		isTrue(new HugeInt((long) 0).isBig());
		equals((byte) 0, new HugeInt((long) 0).toByte());
		isTrue(new HugeInt((long) 0).isPositive());
		sbi = new HugeInt((long) 0).toStream().iterator();
		equals(BigInteger.valueOf(0), sbi.next());
		isNull(sbi.next());
		
		isTrue(new HugeInt((long) 1).isByte());
		isTrue(new HugeInt((long) 1).isShort());
		isTrue(new HugeInt((long) 1).isInt());
		isTrue(new HugeInt((long) 1).isLong());
		isTrue(new HugeInt((long) 1).isBig());
		equals((byte) 1, new HugeInt((long) 1).toByte());
		isTrue(new HugeInt((long) 1).isPositive());
		sbi = new HugeInt((long) 1).toStream().iterator();
		equals(BigInteger.valueOf(1), sbi.next());
		isNull(sbi.next());
		
		isTrue(new HugeInt((long) 2).isByte());
		isTrue(new HugeInt((long) 2).isShort());
		isTrue(new HugeInt((long) 2).isInt());
		isTrue(new HugeInt((long) 2).isLong());
		isTrue(new HugeInt((long) 2).isBig());
		equals((byte) 2, new HugeInt((long) 2).toByte());
		isTrue(new HugeInt((long) 2).isPositive());
		sbi = new HugeInt((long) 2).toStream().iterator();
		equals(BigInteger.valueOf(2), sbi.next());
		isNull(sbi.next());		
		
		isTrue(new HugeInt((long) 10).isByte());
		isTrue(new HugeInt((long) 10).isShort());
		isTrue(new HugeInt((long) 10).isInt());
		isTrue(new HugeInt((long) 10).isLong());
		isTrue(new HugeInt((long) 10).isBig());
		equals((byte) 10, new HugeInt((long) 10).toByte());
		isTrue(new HugeInt((long) 10).isPositive());
		sbi = new HugeInt((long) 10).toStream().iterator();
		equals(BigInteger.valueOf(10), sbi.next());
		isNull(sbi.next());		
		
		int minMone= (  Byte.MIN_VALUE) - 1;
		isFalse(new HugeInt(minMone).isByte());
		isTrue(new HugeInt(minMone).isShort());
		isTrue(new HugeInt(minMone).isInt());
		isTrue(new HugeInt(minMone).isLong());
		isTrue(new HugeInt(minMone).isBig());
		equals((short) minMone, new HugeInt(minMone).toShort());
		isFalse(new HugeInt(minMone).isPositive());
		sbi = new HugeInt(minMone).toStream().iterator();
		equals(BigInteger.valueOf(minMone).abs(), sbi.next());
		isNull(sbi.next());		
		
		int minPone= (  Byte.MAX_VALUE) + 1;
		isFalse(new HugeInt(minPone).isByte());
		isTrue(new HugeInt(minPone).isShort());
		isTrue(new HugeInt(minPone).isInt());
		isTrue(new HugeInt(minPone).isLong());
		isTrue(new HugeInt(minPone).isBig());
		equals((short) minPone, new HugeInt(minPone).toShort());
		isTrue(new HugeInt(minPone).isPositive());
		sbi = new HugeInt(minPone).toStream().iterator();
		equals(BigInteger.valueOf(minPone), sbi.next());
		isNull(sbi.next());	
		
		int minMoneI= ((int)  Short.MIN_VALUE) - 1;
		isFalse(new HugeInt(minMoneI).isByte());
		isFalse(new HugeInt(minMoneI).isShort());
		isTrue(new HugeInt(minMoneI).isInt());
		isTrue(new HugeInt(minMoneI).isLong());
		isTrue(new HugeInt(minMoneI).isBig());
		equals(minMoneI, new HugeInt(minMoneI).toInt());
		isFalse(new HugeInt(minMoneI).isPositive());
		sbi = new HugeInt(minMoneI).toStream().iterator();
		equals(BigInteger.valueOf(minMoneI).abs(), sbi.next());
		isNull(sbi.next());		
		
		int minPoneI = ((int)  Short.MAX_VALUE) + 1;
		isFalse(new HugeInt(minPoneI).isByte());
		isFalse(new HugeInt(minPoneI).isShort());
		isTrue(new HugeInt(minPoneI).isInt());
		isTrue(new HugeInt(minPoneI).isLong());
		isTrue(new HugeInt(minPoneI).isBig());
		equals(minPoneI, new HugeInt(minPoneI).toInt());
		isTrue(new HugeInt(minPoneI).isPositive());
		sbi = new HugeInt(minPoneI).toStream().iterator();
		equals(BigInteger.valueOf(minPoneI), sbi.next());
		isNull(sbi.next());	
		
		long minMoneL= ((long) Integer.MIN_VALUE) - 1;
		isFalse(new HugeInt(minMoneL).isByte());
		isFalse(new HugeInt(minMoneL).isShort());
		isFalse(new HugeInt(minMoneL).isInt());
		isTrue(new HugeInt(minMoneL).isLong());
		isTrue(new HugeInt(minMoneL).isBig());
		equals(minMoneL, new HugeInt(minMoneL).toLong());
		isFalse(new HugeInt(minMoneL).isPositive());
		sbi = new HugeInt(minMoneL).toStream().iterator();
		equals(BigInteger.valueOf(minMoneL).abs(), sbi.next());
		isNull(sbi.next());		
		
		long minPoneL = ((long) Integer.MAX_VALUE) + 1;
		isFalse(new HugeInt(minPoneL).isByte());
		isFalse(new HugeInt(minPoneL).isShort());
		isFalse(new HugeInt(minPoneL).isInt());
		isTrue(new HugeInt(minPoneL).isLong());
		isTrue(new HugeInt(minPoneL).isBig());
		equals(minPoneL, new HugeInt(minPoneL).toLong());
		isTrue(new HugeInt(minPoneL).isPositive());
		sbi = new HugeInt(minPoneL).toStream().iterator();
		equals(BigInteger.valueOf(minPoneL), sbi.next());
		isNull(sbi.next());	
	}
	
	@Test
	public void testToLongExceptions() {
		BigInteger minMone= BigInteger.valueOf(Long.MIN_VALUE).subtract(BigInteger.ONE);
		thrown(List.of(new IllegalStateException(HugeInt.THIS_HUGE_INT_DOESN_T_FIT_INTO_A_LONG)), () -> {
			new HugeInt(minMone).toLong();
		});
		
		BigInteger minPone= BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
		thrown(List.of(new IllegalStateException(HugeInt.THIS_HUGE_INT_DOESN_T_FIT_INTO_A_LONG)), () -> {
			new HugeInt(minPone).toLong();
		});
	}
	

	@Test
	public void testSmallBigIntegerConstructor() {
		isTrue(new HugeInt(BigInteger.valueOf(7)).isByte());
		isTrue(new HugeInt(BigInteger.valueOf(7)).isShort());
		isTrue(new HugeInt(BigInteger.valueOf(7)).isInt());
		isTrue(new HugeInt(BigInteger.valueOf(7)).isLong());
		isTrue(new HugeInt(BigInteger.valueOf(7)).isBig());
		equals((byte) 7, new HugeInt(BigInteger.valueOf(7)).toByte());
		isTrue(new HugeInt(BigInteger.valueOf(7)).isPositive());
		Iterator<BigInteger> sbi = new HugeInt(BigInteger.valueOf(7)).toStream().iterator();
		equals(BigInteger.valueOf(7), sbi.next());
		isNull(sbi.next());
		
		isTrue(new HugeInt(BigInteger.ZERO).isByte());
		isTrue(new HugeInt(BigInteger.ZERO).isShort());
		isTrue(new HugeInt(BigInteger.ZERO).isInt());
		isTrue(new HugeInt(BigInteger.ZERO).isLong());
		isTrue(new HugeInt(BigInteger.ZERO).isBig());
		equals((byte) 0, new HugeInt(BigInteger.ZERO).toByte());
		isTrue(new HugeInt(BigInteger.ZERO).isPositive());
		sbi = new HugeInt(BigInteger.ZERO).toStream().iterator();
		equals(BigInteger.valueOf(0), sbi.next());
		isNull(sbi.next());
		
		isTrue(new HugeInt(BigInteger.ONE).isByte());
		isTrue(new HugeInt(BigInteger.ONE).isShort());
		isTrue(new HugeInt(BigInteger.ONE).isInt());
		isTrue(new HugeInt(BigInteger.ONE).isLong());
		isTrue(new HugeInt(BigInteger.ONE).isBig());
		equals((byte) 1, new HugeInt(BigInteger.ONE).toByte());
		isTrue(new HugeInt(BigInteger.ONE).isPositive());
		sbi = new HugeInt(BigInteger.ONE).toStream().iterator();
		equals(BigInteger.valueOf(1), sbi.next());
		isNull(sbi.next());
		
		isTrue(new HugeInt(BigInteger.TWO).isByte());
		isTrue(new HugeInt(BigInteger.TWO).isShort());
		isTrue(new HugeInt(BigInteger.TWO).isInt());
		isTrue(new HugeInt(BigInteger.TWO).isLong());
		isTrue(new HugeInt(BigInteger.TWO).isBig());
		equals((byte) 2, new HugeInt(BigInteger.TWO).toByte());
		isTrue(new HugeInt(BigInteger.TWO).isPositive());
		sbi = new HugeInt(BigInteger.TWO).toStream().iterator();
		equals(BigInteger.valueOf(2), sbi.next());
		isNull(sbi.next());		
		
		isTrue(new HugeInt(BigInteger.TEN).isByte());
		isTrue(new HugeInt(BigInteger.TEN).isShort());
		isTrue(new HugeInt(BigInteger.TEN).isInt());
		isTrue(new HugeInt(BigInteger.TEN).isLong());
		isTrue(new HugeInt(BigInteger.TEN).isBig());
		equals((byte) 10, new HugeInt(BigInteger.TEN).toByte());
		isTrue(new HugeInt(BigInteger.TEN).isPositive());
		sbi = new HugeInt(BigInteger.TEN).toStream().iterator();
		equals(BigInteger.valueOf(10), sbi.next());
		isNull(sbi.next());		
		
		BigInteger minMone = BigInteger.valueOf((  Byte.MIN_VALUE) - 1);
		isFalse(new HugeInt(minMone).isByte());
		isTrue(new HugeInt(minMone).isShort());
		isTrue(new HugeInt(minMone).isInt());
		isTrue(new HugeInt(minMone).isLong());
		isTrue(new HugeInt(minMone).isBig());
		equals( minMone.shortValue(), new HugeInt(minMone).toShort());
		isFalse(new HugeInt(minMone).isPositive());
		sbi = new HugeInt(minMone).toStream().iterator();
		equals(minMone.abs(), sbi.next());
		isNull(sbi.next());		
		
		BigInteger minPone= BigInteger.valueOf((  Byte.MAX_VALUE) + 1);
		isFalse(new HugeInt(minPone).isByte());
		isTrue(new HugeInt(minPone).isShort());
		isTrue(new HugeInt(minPone).isInt());
		isTrue(new HugeInt(minPone).isLong());
		isTrue(new HugeInt(minPone).isBig());
		equals(minPone.shortValue(), new HugeInt(minPone).toShort());
		isTrue(new HugeInt(minPone).isPositive());
		sbi = new HugeInt(minPone).toStream().iterator();
		equals(minPone, sbi.next());
		isNull(sbi.next());	
		
		BigInteger minMoneI= BigInteger.valueOf(((int)  Short.MIN_VALUE) - 1);
		isFalse(new HugeInt(minMoneI).isByte());
		isFalse(new HugeInt(minMoneI).isShort());
		isTrue(new HugeInt(minMoneI).isInt());
		isTrue(new HugeInt(minMoneI).isLong());
		isTrue(new HugeInt(minMoneI).isBig());
		equals(minMoneI.intValueExact(), new HugeInt(minMoneI).toInt());
		isFalse(new HugeInt(minMoneI).isPositive());
		sbi = new HugeInt(minMoneI).toStream().iterator();
		equals(minMoneI.abs(), sbi.next());
		isNull(sbi.next());		
		
		BigInteger minPoneI = BigInteger.valueOf(((int)  Short.MAX_VALUE) + 1);
		isFalse(new HugeInt(minPoneI).isByte());
		isFalse(new HugeInt(minPoneI).isShort());
		isTrue(new HugeInt(minPoneI).isInt());
		isTrue(new HugeInt(minPoneI).isLong());
		isTrue(new HugeInt(minPoneI).isBig());
		equals(minPoneI.intValueExact(), new HugeInt(minPoneI).toInt());
		isTrue(new HugeInt(minPoneI).isPositive());
		sbi = new HugeInt(minPoneI).toStream().iterator();
		equals(minPoneI, sbi.next());
		isNull(sbi.next());	
		
		BigInteger minMoneL= BigInteger.valueOf(((long) Integer.MIN_VALUE) - 1);
		isFalse(new HugeInt(minMoneL).isByte());
		isFalse(new HugeInt(minMoneL).isShort());
		isFalse(new HugeInt(minMoneL).isInt());
		isTrue(new HugeInt(minMoneL).isLong());
		isTrue(new HugeInt(minMoneL).isBig());
		equals(minMoneL.longValueExact(), new HugeInt(minMoneL).toLong());
		isFalse(new HugeInt(minMoneL).isPositive());
		sbi = new HugeInt(minMoneL).toStream().iterator();
		equals(minMoneL.abs(), sbi.next());
		isNull(sbi.next());		
		
		BigInteger minPoneL = BigInteger.valueOf(((long) Integer.MAX_VALUE) + 1);
		isFalse(new HugeInt(minPoneL).isByte());
		isFalse(new HugeInt(minPoneL).isShort());
		isFalse(new HugeInt(minPoneL).isInt());
		isTrue(new HugeInt(minPoneL).isLong());
		isTrue(new HugeInt(minPoneL).isBig());
		equals(minPoneL.longValueExact(), new HugeInt(minPoneL).toLong());
		isTrue(new HugeInt(minPoneL).isPositive());
		sbi = new HugeInt(minPoneL).toStream().iterator();
		equals(minPoneL, sbi.next());
		isNull(sbi.next());	
		
		BigInteger minMoneB= BigInteger.valueOf(Long.MIN_VALUE).subtract(BigInteger.ONE);
		isFalse(new HugeInt(minMoneB).isByte());
		isFalse(new HugeInt(minMoneB).isShort());
		isFalse(new HugeInt(minMoneB).isInt());
		isFalse(new HugeInt(minMoneB).isLong());
		isTrue(new HugeInt(minMoneB).isBig());
		equals(minMoneB, new HugeInt(minMoneB).toBig());
		isFalse(new HugeInt(minMoneB).isPositive());
		sbi = new HugeInt(minMoneB).toStream().iterator();
		equals(minMoneB.abs(), sbi.next());
		isNull(sbi.next());		
		
		BigInteger minPoneB = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
		isFalse(new HugeInt(minPoneB).isByte());
		isFalse(new HugeInt(minPoneB).isShort());
		isFalse(new HugeInt(minPoneB).isInt());
		isFalse(new HugeInt(minPoneB).isLong());
		isTrue(new HugeInt(minPoneB).isBig());
		equals(minPoneB, new HugeInt(minPoneB).toBig());
		isTrue(new HugeInt(minPoneB).isPositive());
		sbi = new HugeInt(minPoneB).toStream().iterator();
		equals(minPoneB, sbi.next());
		isNull(sbi.next());	
	}

	@Test
	public void testAdd0_23() {
		HugeInt hi = new HugeInt(0);
		for (int i = 0; i < 24; i++) {
			//System.out.println("testAdd0_23 at i " + i);
			HugeInt n = new HugeInt(i);
			assertInt(i, hi.add(n));
		}
	}
	
	@Test
	public void testIncrement0_23() {
		I_HugeInt hi = new HugeInt(0);
		for (int i = 1; i < 24; i++) {
			//System.out.println("testIncrement0_23 at i " + i);
			hi = hi.add(HugeInt.ONE);
			assertInt(i, hi);
		}
	}

	
	@Test
	public void testBigBigIntegerConstructor() {
		BigInteger b1 = HugeConstants.MAX_CHUNK.add(BigInteger.ONE);
		/*
		isFalse(new HugeInt(minPoneL).isByte());
		isFalse(new HugeInt(minPoneL).isShort());
		isFalse(new HugeInt(minPoneL).isInt());
		isFalse(new HugeInt(minPoneL).isLong());
		isTrue(new HugeInt(minPoneL).isBig());
		equals(minPoneL.longValueExact(), new HugeInt(minPoneL).toLong());
		isTrue(new HugeInt(minPoneL).isPositive());
		sbi = new HugeInt(minPoneL).toStream().iterator();
		equals(minPoneL, sbi.next());
		isNull(sbi.next());	
		*/
	}
	
	private void assertInt(int expected, I_HugeInt hi) {
		isTrue(hi.isInt());
		equals(expected, hi.toInt());
	}
}
