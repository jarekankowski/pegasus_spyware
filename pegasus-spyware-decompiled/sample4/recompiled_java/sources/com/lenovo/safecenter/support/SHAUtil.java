package com.lenovo.safecenter.support;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHAUtil {
    protected static char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    protected static MessageDigest messagedigest;

    static {
        messagedigest = null;
        try {
            messagedigest = MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException nsaex) {
            System.err.println(SHAUtil.class.getName() + "初始化失败，MessageDigest不支持SHA1。");
            nsaex.printStackTrace();
        }
    }

    public static String getSHAString(File file) throws IOException {
        FileInputStream in = new FileInputStream(file);
        messagedigest.update(in.getChannel().map(FileChannel.MapMode.READ_ONLY, 0, file.length()));
        in.close();
        return a(messagedigest.digest());
    }

    public static String getSHAString(String s) {
        return getSHAString(s.getBytes());
    }

    public static String getSHAString(byte[] bytes) {
        messagedigest.update(bytes);
        return a(messagedigest.digest());
    }

    private static String a(byte[] bytes) {
        int length = bytes.length;
        StringBuffer stringBuffer = new StringBuffer(length * 2);
        int i = length + 0;
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bytes[i2];
            char c = hexDigits[(b & 240) >> 4];
            char c2 = hexDigits[b & 15];
            stringBuffer.append(c);
            stringBuffer.append(c2);
        }
        return stringBuffer.toString();
    }
}
