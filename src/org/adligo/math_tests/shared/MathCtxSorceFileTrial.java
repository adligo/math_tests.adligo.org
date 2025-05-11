package org.adligo.math_tests.shared;

import java.math.BigInteger;

import org.adligo.i_math.shared.I_EgcdResult;
import org.adligo.math.shared.MathCtx;
import org.adligo.tests4j4jj.JjSourceFileTrial;
import org.junit.jupiter.api.Test;

public class MathCtxSorceFileTrial extends JjSourceFileTrial {

  @Test
  public void testEgcd() {
    MathCtx ctx = new MathCtx();
    
    assert240_46(ctx.egcd(BigInteger.valueOf(240),BigInteger.valueOf(46)));
    assert240_46(ctx.egcd(BigInteger.valueOf(46),BigInteger.valueOf(240)));
  }

  private void assert240_46(I_EgcdResult r) {
    equals(BigInteger.valueOf(2), r.getResult());
    equals(BigInteger.valueOf(-9), r.getBca());
    equals(BigInteger.valueOf(47), r.getBcb());
  }
}
