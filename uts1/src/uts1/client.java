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

public class client {
     public static void main(String[] args) throws Exception{
         
        Socket sr = new Socket("localhost",888);
        
        InputStream is = sr.getInputStream();
        byte[] b = new byte[50000];
        FileOutputStream fir = new FileOutputStream("F:\\Hasil.txt");
        is.read(b, 0, b.length);
        fir.write(b, 0, b.length);
    }
    
}
