#include <iostream>
#include <string>

int main() {
    std::string str;
    std::getline(std::cin, str);

    for (int i = 0; i < str.length(); i++) {
        for (int j = 0; j < str.length(); j++) {
            if (j < i) {
                std::cout << str[i];
            } else {
                std::cout << str[j];
            }
        }
        std::cout << std::endl;
    }
    return 0;
}