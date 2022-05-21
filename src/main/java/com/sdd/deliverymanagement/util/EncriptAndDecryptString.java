package com.sdd.deliverymanagement.util;

import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

@Component
public class EncriptAndDecryptString {

    private static final String encryptionType = "AES";
    private static final String UNICODE_FORMAT = "UTF-8";

    public static SecretKey generateKey(){
        try{
            KeyGenerator keyGenerator = KeyGenerator.getInstance(encryptionType);
            SecretKey myKey = keyGenerator.generateKey();
            return myKey;
        }
        catch (Exception e){
            return null;
        }
    }

    public static String encryptString(String dataToEncrypt){

        try {
            Cipher cipher;
            cipher = Cipher.getInstance(encryptionType);
            byte[] text = dataToEncrypt.getBytes(UNICODE_FORMAT);
            cipher.init(Cipher.ENCRYPT_MODE,generateKey());
            byte[] textEncrypted = cipher.doFinal(text);
            return textEncrypted.toString();

        }
        catch (Exception e) {
            return null;
        }
    }

    public static String decryptString(String dataToDecrypt){

        try {
            Cipher cipher;
            cipher = Cipher.getInstance(encryptionType);
            byte[] text = dataToDecrypt.getBytes(UNICODE_FORMAT);
            cipher.init(Cipher.DECRYPT_MODE,generateKey());
            byte[] textDecrypted = cipher.doFinal(text);
            return textDecrypted.toString();

        }
        catch (Exception e) {
            return null;
        }
    }

}
