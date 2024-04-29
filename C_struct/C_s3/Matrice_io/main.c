#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

typedef int matrice[5][5]; // Define a 5x5 matrix type

int main() {
    matrice A, B, C;
    int i, j, Rows, Columns;

    printf("Enter the number of rows (<=5): ");
    scanf("%d", &Rows);
    printf("Enter the number of columns (<=5): ");
    scanf("%d", &Columns);

    // Input for matrix A
    printf("Enter elements for matrix A:\n");
    for (i = 0; i < Rows; i++) {
        for (j = 0; j < Columns; j++) {
            printf("A[%d][%d]: ", i, j);
            scanf("%d", &A[i][j]);
        }
    }

    // Input for matrix B
    printf("Enter elements for matrix B:\n");
    for (i = 0; i < Rows; i++) {
        for (j = 0; j < Columns; j++) {
            printf("B[%d][%d]: ", i, j);
            scanf("%d", &B[i][j]);
        }
    }

    // Printing matrices A and B
    printf("\nMatrix A:\n");
    for (i = 0; i < Rows; i++) {
        for (j = 0; j < Columns; j++) {
            printf("%d\t", A[i][j]);
        }
        printf("\n");
    }

    printf("\nMatrix B:\n");
    for (i = 0; i < Rows; i++) {
        for (j = 0; j < Columns; j++) {
            printf("%d\t", B[i][j]);
        }
        printf("\n");
    }

    getch(); // Wait for a key press

    return 0;
}
