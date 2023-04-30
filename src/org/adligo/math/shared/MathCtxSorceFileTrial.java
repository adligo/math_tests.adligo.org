package org.adligo.math.shared;

import java.math.BigInteger;

import org.adligo.i_math.shared.I_EgcdResult;
import org.adligo.tests4j4jj.JjSourceFileTrial;
import org.junit.jupiter.api.Test;

public class MathCtxSorceFileTrial extends JjSourceFileTrial {

  @Test
  public void testEgcd() {
    MathCtx ctx = new MathCtx();
    
    I_EgcdResult r = ctx.egcd(BigInteger.valueOf(240),BigInteger.valueOf(46));
    equals(BigInteger.valueOf(2), r.getResult());
    equals(BigInteger.valueOf(-9), r.getBca());
    equals(BigInteger.valueOf(47), r.getBcb());
  }
}
