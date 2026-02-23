#include <iostream>

using namespace std;

int main(){
    const int HOUR = 3600;
    const int MIN = 60;
    const int SEC_DAY = 24 * HOUR;

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int a, b, c, d;
    cin >> a >> b >> c >> d;

    int total = a * HOUR + b * MIN + c;
    total += d;
    total %= SEC_DAY;

    a = total / HOUR;
    b = (total % HOUR) / MIN;
    c = total % MIN;


    cout << a << " " << b << " " << c;

    return 0;
}