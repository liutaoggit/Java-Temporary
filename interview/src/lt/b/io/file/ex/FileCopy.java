package lt.b.io.file.ex;

import java.io.*;  
  
public class FileCopy {  
  /**
   * FileOutputStream
   * FileInputStream也支持缓存
   * 
   * in.read(byte[])
   * @param args
   */
 public static void main(String[] args) {  
    // TODO自动生成的方法存根  
    byte[] buffer=new byte[512];   //一次取出的字节数大小,缓冲区大小  
    int numberRead=0;  
    FileInputStream input=null;  
    FileOutputStream out =null;  
    try {  
       input=new FileInputStream("/home/liutao/fileOp/Mutt.java");  
       out=new FileOutputStream("/home/liutao/fileOp/Mutt1.txt"); //如果文件不存在会自动创建  
       while ((numberRead=input.read(buffer))!=-1) {  //numberRead的目的在于防止最后一次读取的字节小于buffer长度，  
          out.write(buffer, 0, numberRead);       //否则会自动被填充0  
       }  
    } catch (final IOException e) {  
       // TODO自动生成的 catch 块  
       e.printStackTrace();  
    }finally{  
       try {  
          input.close();  
          out.close();  
       } catch (IOException e) {  
          // TODO自动生成的 catch 块  
          e.printStackTrace();  
       }  
        
    }  
 }  
  
} 