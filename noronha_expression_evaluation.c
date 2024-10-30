#include <stdio.h>
#include <stdbool.h>

int main() {
    int a = 5, b = 10, c = 9, d = 6, e = 4;

    int exprA = ((a * b) - 1) + c;
    printf("Expression a: %d\n", exprA);
    
    int exprB = ((a * (b - 1)) / c) % d;
    printf("Expression b: %d\n", exprB);
    
    int exprC = ((a - b) / c) & ((d * e / a) - 3);
    printf("Expression c: %d\n", exprC);
    
    bool exprD = (-a != 0) || ((c == d) && (e != 0));
    printf("Expression d: %d\n", exprD);
    
    bool exprE = ((a > b) ^ (c != 0)) || (d <= 17);
    printf("Expression e: %d\n", exprE);
    
    int exprF = (-a) + b;
    printf("Expression f: %d\n", exprF);
    
    return 0;
}
