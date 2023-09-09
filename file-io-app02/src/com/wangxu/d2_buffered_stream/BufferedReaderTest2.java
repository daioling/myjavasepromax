package com.wangxu.d2_buffered_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReaderTest2 {
    public static void main(String[] args) {
        try (
                Reader fr = new FileReader("file-io-app02\\src\\wangxu02.txt");
                BufferedReader bfr = new BufferedReader(fr);

        ){
//            char[] buffer = new char[3];
//            int len;
//            while ((len = bfr.read(buffer)) != -1){
//                System.out.println(new String(buffer, 0, len));
//            }
            String lin;
            while ((lin = bfr.readLine()) != null){
                System.out.println(lin);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
