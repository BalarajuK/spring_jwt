package com.meghasys.learning.security;

import io.jsonwebtoken.Jwts;
import jakarta.xml.bind.DatatypeConverter;
import org.junit.jupiter.api.Test;

import javax.crypto.SecretKey;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

public class JWTSecretGeneratorTest {

    @Test
    public void generateSecretKey(){
        SecretKey key = Jwts.SIG.HS512.key().build();
        String encodedKey = DatatypeConverter.printHexBinary(key.getEncoded());
        System.out.println(encodedKey);
    }

    @Test
    public void generateRSASecretKey(){
        KeyPair keyPair = Jwts.SIG.RS512.keyPair().build();
        PrivateKey privateKey = keyPair.getPrivate();
        PublicKey publicKey = keyPair.getPublic();
        System.out.println("Private Key:"+DatatypeConverter.printHexBinary(privateKey.getEncoded()));
        System.out.println("Public Key:"+DatatypeConverter.printHexBinary(publicKey.getEncoded()));
    }
}
