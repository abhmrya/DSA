#include<stdio.h>
int factorial(int n){
    if(n==1 || n==0) return 1;
    int D=n*factorial(n-1);
    return D;
}
int main(){
    int n;
    printf("Enter the value of n:");
    scanf("%d",&n);
    int r;
    printf("Enter the value of r");
    scanf("%d",&r);
    int A=factorial(n);
    int B=factorial(r);
    int C=factorial(n-r);
    int fact=fact=A/(B*C);
    printf("%d",fact);
    return 0;
}