package com.read.crack.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveDupChars {
    public static void main(final String[] args) throws IOException {
        // Read the string
        char chars[] = new char[100];
        final BufferedReader br = new BufferedReader(new InputStreamReader(
                System.in));
        System.out.println("Please input the string");
        br.read(chars);
        br.close();
        int strLen = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '\r') {
                strLen = i;
                break;
            }
        }

        chars = rmDup(chars, strLen);

        System.out.println(chars);
    }

    public static char[] rmDup(final char[] string, final int len) {
        int strLen = len;
        if (len > 0) {
            for (int i = 0; i < strLen; i++) {
                for (int j = i + 1; j < strLen; j++) {
                    if (string[j] == string[i]) {
                        // remove this char at position j
                        // set string length -1
                        for (int k = j; k < strLen - 1; k++) {
                            string[k] = string[k + 1];
                        }
                        string[strLen - 1] = '\0';
                        strLen--;
                        j--;
                    }
                }
            }
            return string;
        } else {
            return string;
        }
    }
}