#ifndef ETUDIANT_EN_MAITRISE_H
#define ETUDIANT_EN_MAITRISE_H

#include "Etudiant.h"

class Etudiant_en_Maitrise : public Etudiant {
private:
    int note_memoire;
public:
    void saisie();
    void affichage();
    float moyenne();
    int admis();
};

#endif /* ETUDIANT_EN_MAITRISE_H */
