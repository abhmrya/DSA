
void find(int ar[],int n,int item){
   ar[n];
   for(int i=0;i<n;i++){
    if(item==ar[i]){
    return i;
    }
   }
   return -1;
}
#include <stdio.h>
int main(){
    
 int arr[8];
 printf("enter array items:\n");
 for(int i=0;i<8;i++){
  scanf("%d",&arr[i]);
 }
 printf("the index is:%d",find(arr,8,55));
   
 

    return 0;
}