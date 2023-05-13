/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp_decomp;

import java.io.*;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author vidya
 */
public class Compressor {
    public static void method(File file) throws IOException{
        //get parent directory of  a file
        String parentDir = file.getParent();
        //read the file using input stream
        FileInputStream fis = new FileInputStream(file);
        //output the file using output stream
        FileOutputStream fos = new FileOutputStream(parentDir+"/compressedfile.gz");
        //zip the output file
        GZIPOutputStream gzip = new GZIPOutputStream(fos);
        
        //create a byte array
        byte[] buffer = new byte[1024];
        int len;
        while((len=fis.read(buffer))!=-1)
        {
            gzip.write(buffer,0,len);
        }
        gzip.close();
        fos.close();
        fis.close();
        
    }
    public static void main(String[] args) throws IOException{
        File path = new File("");
        method(path);
        
    }
    
}
