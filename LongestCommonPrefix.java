// Source code is decompiled from a .class file using FernFlower decompiler.
public class LongestCommonPrefix {
    public LongestCommonPrefix() {
    }
 
    public static String longestCommonPrefix(String[] var0) {
       if (var0.length == 0) {
          return "";
       } else {
          String var1 = var0[0];
 
          for(int var2 = 1; var2 < var0.length; ++var2) {
             while(var0[var2].indexOf(var1) != 0) {
                var1 = var1.substring(0, var1.length() - 1);
                if (var1.isEmpty()) {
                   return "";
                }
             }
          }
 
          return var1;
       }
    }
 
    public static void main(String[] var0) {
       String[] var1 = new String[]{"flower", "flow", "flight"};
       System.out.println(longestCommonPrefix(var1));
    }
 }
 
