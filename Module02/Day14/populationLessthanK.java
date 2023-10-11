public static int population(HashMap<String, Integer> H, int K){
    int count=0;
    for(String country : H.keySet()){
        if(H.get(country)<K) count++;
    }
    return count;
}
