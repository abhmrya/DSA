#include<stdio.h>
void display(int arr[],int n){
    // int arr[];
for (int i=0;i<n;i++){
    printf("%d ",arr[i]);
}
}
int main(){
int arr[100]={4,6,5,4,6,4,6,3,6,4};
display(arr,10);
return 0;
}

//#include <stdio.h>

// Function to display array elements
// void display(int arr[], int n) {
//     for (int i = 0; i < n; i++) {
//         printf("%d ", arr[i]);  // Added a space for better readability
//     }
//     printf("\n");  // Newline for clean output
// }

// int main() {
//     int arr[100] = {4, 6, 5, 4, 6, 4, 6, 3, 6, 4}; // Initialize array with 10 elements
//     display(arr, 10);  // Call display function with the array and its size
//     return 0;
// }
