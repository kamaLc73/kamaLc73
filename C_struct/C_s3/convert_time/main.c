#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
    if (argc != 2) {
        printf("Usage : ./main {time_in_seconds}\n");
        return 1; 
    }

    int seconds = atoi(argv[1]); // convert string to integer or strtod
    /*
    atof --> float
    
    */

    int h , m , s , r ;
    h = seconds / 3600 ;
    r = seconds % 3600 ;
    m = r / 60 ;
    s = r % 60 ;

    printf("Result : %dh %dmin %ds\n", h, m, s);
    return 0;
}
