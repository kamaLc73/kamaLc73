#include<stdio.h>
#include<stdlib.h>

int main (){
   int N,nbdiviseur , i ;

for(N=2;N<=100;N++){
    nbdiviseur=0;
       for (i=2;i<=N/2;i++){
                   if(N%i==0)
                     nbdiviseur++;}

if(nbdiviseur==0)

printf("\n%d est premier !",N);
}
return 0;
}
