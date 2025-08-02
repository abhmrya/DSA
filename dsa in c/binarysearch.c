#include<stdio.h>
// void display(int arr[],int size){
//     printf("array is : ");
//     for(int i=0;i<11;i++){
//     printf("%d ",arr[i]);
//     }
//     printf("\n");
// }
int binary(int arr[],int size,int element){
    int low,mid,high;
    low=0;
    high=size-1;
    while(low<=mid){
        mid=(low+high)/2;
        if(arr[mid]==element){
           return  mid;
        }
        if(arr[mid]<element){
            low=mid+1;
        }
        else
        {
          high=mid-1;
        }
    }
    return -1;
}
int main(){
    int arr[]={4,8 ,13,18,29,48,58,73,95,97,123};
    int size = sizeof(arr) / sizeof(int);
    //display(arr,size);
    int element=18;
    int searchindex=binary(arr,size,element);
    //display(arr,size);
    printf("the element %d was found at index %d \n",element,searchindex);
    return 0;
}