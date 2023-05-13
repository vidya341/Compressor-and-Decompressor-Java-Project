/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp_decomp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author vidya
 */
public class Decompressor {
     public static void method(File file) throws IOException{
        //get parent directory of  a file
        String parentDir = file.getParent();
        //read the file using input stream
        FileInputStream fis = new FileInputStream(file);
        GZIPInputStream gzip = new GZIPInputStream(fis);
        //output the file using output stream
        FileOutputStream fos = new FileOutputStream(parentDir+"/decompressedfile");
       
        
        
        //create a byte array
        byte[] buffer = new byte[1024];
        int len;
        while((len=gzip.read(buffer))!=-1)
        {
            fos.write(buffer,0,len);
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
