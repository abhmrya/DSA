#include<stdio.h>
void display(int arr[],int n){
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
}
int deletion(int arr[],int n,int index){
    for(int i=index;i<n;i++){
        arr[i]=arr[i+1];
    }
    return 1;
}
int main(){
    int n;
    printf("Enter the how many element:");
    scanf("%d\n",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d ",&arr[i]);
    }
    int index=3;
    deletion(arr,n,index);
    n=n-1;
    display(arr,n);
}