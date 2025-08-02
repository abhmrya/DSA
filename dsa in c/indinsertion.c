#include<stdio.h>
void display(int arr[],int n){
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
}
int indnsertion(int arr[],int n,int element,int index){
    for(int i=n-1;i>=index;i--){
        arr[i+1]=arr[i];
    }
    arr[index]=element;
    return 1;
}

int main(){
    int n;
    printf("how mant element of array\n");
    scanf("%d ",&n);
    printf("%d",n);
    int arr[n];
    printf("\n");
    for(int i=0;i<n;i++){
        scanf("%d ",&arr[i]);
    }
    int index=2;
    int element=54;
    indnsertion(arr, n, element, index);
    n+=1;
    display(arr,n);
    return 0;
    return 0;
}