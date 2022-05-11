package wrappers;

import java.util.concurrent.Callable;

public class WrapperTest {

    public static void main(String[] args) {

        Character c1 = 'x';
        Character c2 = Character.valueOf('z');
        Character c3 = new Character((char) 88);

        Byte b1 = 10;
        Byte b2 = Byte.valueOf((byte) 11);
        Byte b3 = new Byte((byte) 12);
        Byte b4 = Byte.parseByte("13");

        Short s1 = 110;
        Short s2 = Short.valueOf((short) 111);
        Short s3 = new Short((short) 112);
        Short s4 = Short.parseShort("113");

        Integer i1 = 1111;
        Integer i2 = Integer.valueOf(1112);
        Integer i3 = new Integer(1113);
        Integer i4 = Integer.parseInt("1114");

        Long l1 = 11111L;
        Long l2 = Long.valueOf(11112L);
        Long l3 = new Long(11113L);
        Long l4 = Long.parseLong("11114");

        Float f1 = 1.1f;
        Float f2 = Float.valueOf(1.2f);
        Float f3 = new Float(1.3f);
        Float f4 = Float.parseFloat("1.4");

        Double d1 = 11.11;
        Double d2 = Double.valueOf(11.22);
        Double d3 = new Double(11.33);
        Double d4 = Double.parseDouble("11.44");

        Double d5 = 66.66;
        byte b5 = d5.byteValue();
        short s5 = d5.shortValue();
        int i5 = d5.intValue();
        long l5 = d5.longValue();
        float f5 = d5.floatValue();


        Double d6 = 88.88;
        Double d7 = 0.0;
        Double nanValue = d6 / d7;
        Double infinityValue = d7 / d7;
        System.out.println("nanValue = " + nanValue + "\ninfinityValue = " + infinityValue);
        if (nanValue.isNaN()) {
            System.out.println("Variable nanValue = NaN");
        } else if(nanValue.isInfinite()) {
            System.out.println("Variable nanValue = Infinity");
        }

        if (infinityValue.isNaN()) {
            System.out.println("Variable infinityValue = NaN");
        } else if(nanValue.isInfinite()) {
            System.out.println("Variable infinityValue = Infinity");
        }

        Long l6 = 120L;
        Long l7 = 120L;
        System.out.println(l6 == l7);
        l6 = 1200L;
        l7 = 1200L;
        System.out.println(l6 == l7);

    }
}
