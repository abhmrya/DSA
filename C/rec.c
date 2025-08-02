#include <stdio.h>

int factorial(int n) {
    if (n == 0 || n == 1) return 1; 
    return n * factorial(n - 1);
}

int main() {
    int n, r;
    printf("Enter the value of n: ");
    scanf("%d", &n);
    printf("Enter the value of r: ");
    scanf("%d", &r);
    // if (n < r || r < 0) {
    //     printf("Invalid input! Ensure that n >= r >= 0.\n");
    //     return 1;
    // }
    int A = factorial(n);
    int B = factorial(r);
    int C = factorial(n - r);
    int fact = A / (B * C);
    printf("C(%d, %d) = %d\n", n, r, fact);
    return 0;
}