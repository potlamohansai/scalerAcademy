public static boolean solve(int arr[]) {
    // Complete the function here
    int len = arr.length;
    for(int i=0; i<len-1; i++){
        if(arr[i] == arr[i+1]) return true;
    }
    return false;
}
