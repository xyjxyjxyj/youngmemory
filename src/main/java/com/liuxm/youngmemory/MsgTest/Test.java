package com.liuxm.youngmemory.MsgTest;

import java.io.UnsupportedEncodingException;

public class Test {

    /**
     * @param args
     * @throws Exception 
     * @throws UnsupportedEncodingException 
     */
    public static void main(String[] args) throws UnsupportedEncodingException, Exception {
        TestHead head = new  TestHead();
        head.setName("name");
        head.setAmt(12.121);
        head.setSex(false);
        head.setURL("http://asdsaaaaaaaaaaaaaaaaaaaaaaa");
        head.setUAge(111);
        
        TestBody body = new TestBody();
        body.setContent("content");
        
        TestPackage packagee = new TestPackage();
        packagee.setT1(head);
        packagee.setT2(body);
        
        System.out.println(new String(packagee.pack("GBK"), "GBK"));
        
        TestPackage packagee2 = new TestPackage();
        String str = "name      000000true0000000111http://asd000012.121content             ";
        packagee2.unPack(str.getBytes("GBK"), "GBK");
        System.out.println(packagee2.getT1().isSex());
    }

}