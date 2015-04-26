package cn.jfinalbbs.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptionUtilTest {

    @Test
    public void testEncoderBase64() throws Exception {
        System.out.println(EncryptionUtil.encoderBase64("123123".getBytes()).equals("MTIzMTIz"));
    }

    @Test
    public void testDecoderBase64() throws Exception {
        System.out.println(EncryptionUtil.decoderBase64("MTIzMTIz".getBytes()));
    }
}