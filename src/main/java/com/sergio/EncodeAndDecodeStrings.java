package com.sergio;

public class EncodeAndDecodeStrings {
    private static final String SEPARATOR = "-";

    public String encode(String[] s) {
        StringBuilder builder = new StringBuilder();
        for(String word : s) {
            builder.append(word).append(SEPARATOR);
        }
        return builder.toString();
    }

    public String[] decode(String s) {
        return s.split(SEPARATOR);
    }
}
