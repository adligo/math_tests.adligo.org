package org.adligo.math_tests.shared;

import org.adligo.math.shared.HugeInt;
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
}
