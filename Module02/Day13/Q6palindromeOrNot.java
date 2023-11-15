/*Problem Description:

Write a program to check whether the given string is a palindrome or not. Return True if it is palindrome else return False.

Note: A string is said to be a palindrome if the reverse of the string is the same as the string itself.
    */


public static boolean isPalin(String s) {
    // complete the function template
    int len = s.length();
    String rev = new String();

    for(int i =len-1; i>=0; i--){
        char ch = s.charAt(i);
        rev += ch;
    }
    if(s.equals(rev) ) return true;
    return false;
}
