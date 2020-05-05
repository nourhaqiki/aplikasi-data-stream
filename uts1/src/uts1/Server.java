/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nhaqiki
 */
package uts1;

import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception{

     ServerSocket s = new ServerSocket(888);
        Socket sr = s.accept();
        
        FileInputStream fir = new FileInputStream("F:\\KAMPUS\\semester 6\\pemrograman jaringan\\uts\\file uts tcp\\kirim\\file kirim.txt");
        byte[] b = new byte[50000];
        fir.read(b, 0, b.length);
        OutputStream os = sr.getOutputStream();
        os.write(b, 0, b.length);
    }
}