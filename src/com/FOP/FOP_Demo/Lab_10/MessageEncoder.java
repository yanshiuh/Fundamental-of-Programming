package com.FOP.FOP_Demo.Lab_10;

public interface MessageEncoder {
    public String encode(String plainText);

    public String decode(String cipherText);
}
