#include <iostream>
#include "Etudiant.h"
#include "Etudiant_en_Maitrise.h"

using namespace std;

int main() {
    Etudiant E1;
    E1.saisie();
    E1.affichage();
    cout << "Moyenne : " << E1.moyenne() << endl;
    cout << "Admis : " << E1.admis() << endl;

    Etudiant_en_Maitrise E2;
    E2.saisie();
    E2.affichage();
    cout << "Moyenne : " << E2.moyenne() << endl;
    cout << "Admis : " << E2.admis() << endl;

    cout << "Ex aequo : " << E1.exae_quo(E2) << endl;

    return 0;
}
