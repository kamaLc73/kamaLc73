#include <stdio.h>

int main() {
    FILE *input_file = fopen("texte.txt", "r");
    if (input_file == NULL) {
        printf("Erreur lors de l'ouverture du fichier\n");
        return 1;
    }

    FILE *output_file = fopen("texte_modifie.txt", "w");
    if (output_file == NULL) {
        printf("Erreur lors de la creation du fichier modifie\n");
        fclose(input_file);
        return 1;
    }

    int character;
    int is_start_of_line = 1;
    while ((character = fgetc(input_file)) != EOF) {
        if (is_start_of_line && character == 'o') {
            character = '-';
        }
        fputc(character, output_file);

        if (character == '\n') {
            is_start_of_line = 1;
        } else {
            is_start_of_line = 0;
        }
    }

    fclose(input_file);
    fclose(output_file);

    remove("texte.txt");
    rename("texte.txt", "texte_modifie.txt");

    return 0;
}
