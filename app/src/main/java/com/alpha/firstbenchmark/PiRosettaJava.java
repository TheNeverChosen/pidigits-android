package com.alpha.firstbenchmark;

import java.math.BigInteger ;

public class PiRosettaJava {
    final BigInteger TWO = BigInteger.valueOf(2) ;
    final BigInteger THREE = BigInteger.valueOf(3) ;
    final BigInteger FOUR = BigInteger.valueOf(4) ;
    final BigInteger SEVEN = BigInteger.valueOf(7) ;

    BigInteger q = BigInteger.ONE ;
    BigInteger r = BigInteger.ZERO ;
    BigInteger t = BigInteger.ONE ;
    BigInteger k = BigInteger.ONE ;
    BigInteger n = BigInteger.valueOf(3) ;
    BigInteger l = BigInteger.valueOf(3) ;

    public PiRosettaJava(){}

    public long calcPiDigits(int qtDigits){
        BigInteger nn, nr ;
//        boolean first = true;
        long startTime = System.nanoTime();
        while(qtDigits>0){
            if(FOUR.multiply(q).add(r).subtract(t).compareTo(n.multiply(t)) == -1){
//                System.out.print(n) ;
//                if(first){System.out.print(".") ; first = false ;}
                nr = BigInteger.TEN.multiply(r.subtract(n.multiply(t))) ;
                n = BigInteger.TEN.multiply(THREE.multiply(q).add(r)).divide(t).subtract(BigInteger.TEN.multiply(n)) ;
                q = q.multiply(BigInteger.TEN) ;
                r = nr ;
//                System.out.flush() ;
                qtDigits--;
            }else{
                nr = TWO.multiply(q).add(r).multiply(l) ;
                nn = q.multiply((SEVEN.multiply(k))).add(TWO).add(r.multiply(l)).divide(t.multiply(l)) ;
                q = q.multiply(k) ;
                t = t.multiply(l) ;
                l = l.add(TWO) ;
                k = k.add(BigInteger.ONE) ;
                n = nn ;
                r = nr ;
            }
        }
        long endTime = System.nanoTime();
        long durationMs = (endTime - startTime)/1000000;  //divide by 1000000 to get milliseconds.

        return durationMs;
    }
}