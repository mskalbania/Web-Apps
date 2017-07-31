package com.encryptionTool;

public class Demo {

    public static void main(String[] args) {
        AESCipher aesCipher = new AESCipher("xuwAMrtGPhG5xkf6-T6aBQ");

        String message = "Hello from encrypt and decrypt world";
        String encrypted = aesCipher.encrypt(message);

        System.out.println(encrypted);
        System.out.println(aesCipher.decrypt(encrypted));

    }


}
