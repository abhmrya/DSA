#include <stdio.h>
void screen(int arr[],int size){
    for(int i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
}
int main(){
    int arr[100];
    int size=5;
    printf("enter array items:");
    for(int i=0;i<5;i++){
        scanf("%d ",&arr[i]);
    }
    screen(arr,size);
    return 0;
}