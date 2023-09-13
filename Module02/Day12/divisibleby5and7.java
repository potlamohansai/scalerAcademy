public static ArrayList<Integer> solve(ArrayList<Integer> arr) {
    // Complete function template here
    ArrayList<Integer> ans = new ArrayList<Integer>();
    for(int i=0; i<arr.size(); i++){
        int n =arr.get(i);
        if(n%5 ==0 && n%7==0){
            ans.add(n);
        }
    }
    return ans;
}
