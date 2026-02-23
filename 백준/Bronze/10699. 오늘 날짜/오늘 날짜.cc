#include <ctime>
#include <iostream>

int main(){
    time_t timer = time(NULL);
    struct tm* t = localtime(&timer);

    std::cout << t -> tm_year + 1900 << "-";
    std::cout.width(2);
    std::cout.fill('0'); // 빈 공간 0
    std::cout << t -> tm_mon + 1 << "-" << t -> tm_mday << "\n";

    
    return 0;
}