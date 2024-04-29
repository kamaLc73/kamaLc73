#include <stdio.h>

int main() 
{
    int x = 1;
    int z = 3;
    int y = 5;
    x++; y--;
    printf("x = %d, y = %d \n", x, y);
    printf("x = %d, z = %d\n", x++,--z);
    y = ++x;
    printf("x = %d, y = %d\n", x,y);
    x+=z;
    printf("x = %d\n", x);
    z = x % y++ ;
    printf("z = %d\n", z);
    x*= (++ y);
    printf("x = %d\n", x);
    return 0 ;
}
