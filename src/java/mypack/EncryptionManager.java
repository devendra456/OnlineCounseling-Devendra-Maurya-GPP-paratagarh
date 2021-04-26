/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

/**
 *
 * @author nadir
 */
public class EncryptionManager {
    String encryptText="";
 public String encryptData(String password)
 {
 for(int i=0;i<password.length();i++)
 {
 char ch=password.charAt(i);
 int n=ch;
 char newchar;
 //65-90=A-Z,97-122=a-z,48-58=0-9
 if(n>=65&&n<=90)
 {
 n=65-n+122;
 }
 else if(n>=97&&n<=122)
 {
n=97-n+90;
 }
 else if(n>=48&&n<=57)
 {
  n=48-n+57;
 }
 newchar=(char)n;
 encryptText=encryptText+newchar;
 }
 return encryptText;
 }
}
