#include <stdio.h>

int fib(int N){
    if(N<2)
        return N ;
    else
        return fib(N-1)+fib(N-2);

}
int main()
{   int N , i;
    printf(" Veulliez saisir un nombre : ");
    scanf("%d",&N);
    printf(" Les termes de la suite de Fibonacci sont :\n ");
    for(i=0;i<=N;i++)
        printf("\t Fib[%d] = %d\n\n",i,fib(i));

    return 0;
}
