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
