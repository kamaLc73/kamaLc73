#include <iostream>

using namespace std;

class pt{
    int x; int y;
public:
    pt(int,int);
    void afficher();
    pt operator +(pt); //c'est un peut la meme chose que l'on fait avec sum
    pt operator - (pt);
    bool operator==(pt);
    pt operator =(pt);
};
pt:: pt(int a, int b){
    x=a; y=b;
}
void pt :: afficher(){
    cout<<"les coordonnees sont: ("<<x<<","<<y<<")"<<endl;
}
pt pt :: operator+(pt p1){
    p1.x=x+p1.x;
    p1.y=y+p1.y;
    return p1;
}
pt pt :: operator-(pt p1){
    p1.x=x-p1.x;
    p1.y=y-p1.y;
    return p1;
}
bool pt :: operator==(pt p1){
    if (x==p1.x && y==p1.y) return true;
        else return false;
}
pt pt :: operator=(pt p1){
    x=p1.x;
    y=p1.y;
    return p1;
}
int main()
{
    pt p1(1, 1);
    pt p2(1, 1);
    pt p3 = p1 + p2;
    p1 = p2;
    pt p4 = p1 - p2;
    bool b = (p1 == p2);
    cout<< b <<endl;
    p4.afficher();
    p3.afficher();
    p1.afficher();

}