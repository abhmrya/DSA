#include<stdio.h>
void display(int arr[],int size){
    printf("array is : ");
    for(int i=0;i<11;i++){
    printf("%d ",arr[i]);
    }
    printf("\n");
}
void linear(int arr[],int size,int element){
    for(int i=0;i<size-1;i++){
        if(element==arr[i]){
            printf("index is %d",i);
        }
    }

}
int main(){
    int arr[]={4,8 ,13,18,29,48,58,73,95,97,123};
    int size = sizeof(arr) / sizeof(int);
    display(arr,size);
    int element=58;
    linear(arr,size,element);
    return 0;
}