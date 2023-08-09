package foundation.week3.day2;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Homework1_MergeStringsAlternately {
	
	
 @Test
 public void test2() {
  Assert.assertEquals("apbqrs", MergeredString("ab","pqrs"));
 }
	
 public String MergeredString(String str1,String str2)
 {
  int total_length= str1.length()+str2.length();
  //System.out.println(total_length);
  char[] str1array = str1.toCharArray();
  char[] str2array = str2.toCharArray();
  String buff="";
  
  char[] outputarray = new char[total_length];
    
  
  for(int j=0;j<total_length-2;)
  {
   for(int i=0;i<=str1.length()-1;i++)
   {
   outputarray[j]=str1array[i];
   j=j+2;
   }
  }
  
  for(int j=1;j<total_length-2;)
  {
   for(int i=0;i<=str1.length()-1;i++)
   {
   outputarray[j]=str2array[i];
   j=j+2;
   }
  } 
  
  
  
  String newstr = String.valueOf(outputarray); //apbq
  
  
  if(str2array.length>str1array.length)
  {
   buff = str2.substring(str1.length()); //rs
   System.out.println(buff);
   
   
   String finalstr = newstr.concat(buff); // String s3=s1.concat(s2);  
   
   System.out.println(finalstr);
  }
  
  
  return newstr;
  
 }
 
}

/*PROBLEM STATEMENT - 
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. 
 * If a string is longer than the other, append the additional letters onto the end of the merged string.
    Return the merged string.
    Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1: a b c
word2: p q r
merged: a p b q c r

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1: a b 
word2: p q r s
merged: a p b q r s

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1: a b c d
word2: p q 
merged: a p b q c d


 * 
 * 
 * */