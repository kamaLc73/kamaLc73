#ifndef ETUDIANT_H
#define ETUDIANT_H

#include <iostream>
#include <string>

using namespace std;

class Etudiant {
    string nom;
    string prenom;
    int tabnotes[3]; 
public:
    void saisie();
    void affichage();
    float moyenne();
    int admis();
    int exae_quo(Etudiant E);
};

#endif /* ETUDIANT_H */
