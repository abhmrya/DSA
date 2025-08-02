#include<stdio.h>
void display(int arr[],int n){
    printf("The element of array are:\n");
    for(int i=0;i<n;i++){
        printf("%d\n",arr[i]);
    }
    int negative=0, positive=0, zero=0;
    for(int i=0;i<n;i++){
        if(arr[i]>0){
            positive++;
        }
        if(arr[i]<0){
            negative++;
        }
        if(arr[i]==0){
            zero++;  
        }
    }
    printf("positive %d ",positive);
    printf("zero %d",zero);
    printf(" negative%d ",negative);
}
int main(){
    int n;
    printf("Enter thr number of element in the aray: ");
    scanf("%d",&n);
    printf("%d",n);
    int arr[n];
    printf("The %d element :\n",n);
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("\n");
    display(arr,n);
    return 0;
}