package com.encryptionTool;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import java.security.GeneralSecurityException;

import static javax.crypto.Cipher.DECRYPT_MODE;
import static javax.crypto.Cipher.ENCRYPT_MODE;

public class AESCipher {

    private final String AES_PADDING_ALGORITHM = "AES/CBC/PKCS5Padding";
    private final Cipher encryptCipher;
    private final Cipher decryptCipher;

    public AESCipher(String key) {
        encryptCipher = initCipher(key, ENCRYPT_MODE);
        decryptCipher = initCipher(key, DECRYPT_MODE);
    }

    private Cipher initCipher(String key, int mode) {

        SecretKeySpec secretKey = new SecretKeySpec(Base64.decodeBase64(key), "AES");

        try {
            Cipher cipher = Cipher.getInstance(AES_PADDING_ALGORITHM);
            byte[] iv = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            cipher.init(mode, secretKey, new IvParameterSpec(iv));
            return cipher;
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(e);
        }
    }

    public String encrypt(String input) {
        try {
            return Base64.encodeBase64URLSafeString(encryptCipher.doFinal(input.getBytes()));
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(e);
        }
    }

    public String decrypt(String input) {
        try {
            return new String(decryptCipher.doFinal(Base64.decodeBase64(input)));
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(e);
        }
    }
}
