// package Recursion;

// public class SieveofEratosthens {
//     public static void main(String[] args) {
//         boolean [] arr;
//         sieve(20, arr);
//     }

//     static void sieve(int n, boolean [] prime){
//         for(int i = 2; i * i <= n; i++){
//             if(!prime[i]){
//                 for(int j = i * 2; j <= n; j += i){
//                     prime[j] = true;
//                 }
//             }
//         }

//         for(int i = 2; i <= n; i++){
//             if(!prime[i]){
//                 System.out.println(i + " ");
//             }
//         }
//     }
// }
