/*Problem Description
You are given a Hashmap<String, int> H and an integer K as a function input.

The hashmap stores the name of some countries and the corresponding population.

Return the number of countries with a population less than K.


Problem Constraints
1 <= Length of H <= 105
    */


public static int population(HashMap<String, Integer> H, int K){
    int count=0;
    for(String country : H.keySet()){
        if(H.get(country)<K) count++;
    }
    return count;
}
