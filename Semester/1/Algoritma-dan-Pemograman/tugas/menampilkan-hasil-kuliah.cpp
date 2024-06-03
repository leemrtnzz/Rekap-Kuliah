#include <iostream>
#include <iomanip>
using namespace std;
int main() {
    string namaMhs, namaMk;
    int sks, presensi, tugas, uts, uas;
    long long nim;
    char grade, opsi;
    do {
        cout << "Masukan Nim: "; cin >> nim;
        cout << "Masukan Nama: "; getline(cin >> ws, namaMhs);
        cout << "Masukan Nama MK: "; getline(cin >> ws, namaMk);
        cout << "Masukan SKS: "; cin >> sks;
        cout << "Masukan Presensi: "; cin >> presensi;
        cout << "Masukan Tugas: "; cin >> tugas;
        cout << "Masukan UTS: "; cin >> uts;
        cout << "Masukan UAS: "; cin >> uas;
        if (presensi == 0 || tugas == 0 || uts == 0 || uas == 0) {
            grade = 'E';
        } else {
            float t_presensi = presensi * 0.1;
            float t_tugas = tugas * 0.2;
            float t_uts = uts * 0.3;
            float t_uas = uas * 0.4;
            float total = t_presensi + t_tugas + t_uts + t_uas;
            if (total >= 90) {
                grade = 'A';
            } else if (total >= 80) {
                grade = 'B';
            } else if (total >= 70) {
                grade = 'C';
            } else {
                grade = 'D';
            }
            cout << "\n\nNama Mata Kuliah: " << namaMk << "\nSKS: " << sks << "\n\n";
            cout << "--------------------------------------------------------------------\n";
            cout << left << setw(15) << "NIM" << setw(25) << "Nama" << setw(15) << "Presensi" << setw(8) << "Tugas" << setw(8) << "UTS" << setw(8) << "UAS" << setw(8) << "Grade" << endl;
            cout << left << setw(15) << nim << setw(25) << namaMhs << setw(15) << presensi << setw(8) << tugas << setw(8) << uts << setw(8) << uas << setw(8) << grade << endl;
            cout << "--------------------------------------------------------------------\n\n";

        }
        cout << "Apakah ingin mengulangi? (Y/N): "; cin >> opsi;
    } while (opsi == 'Y' || opsi == 'y');
    cout << "Terima Kasih :)";
    return 0;
}

