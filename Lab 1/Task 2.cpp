#include <iostream>
using namespace std;
float calculateGrossSalary(float basicSalary, float allowancePercentage) {
    return basicSalary + (basicSalary * allowancePercentage / 100);
}
float calculateNetSalary(float grossSalary, float deductionPercentage) {
    return grossSalary - (grossSalary * deductionPercentage / 100);
}
int main() {
    float basicSalary, allowancePercentage, deductionPercentage;
    cout << "Enter the basic salary: ";
    cin >> basicSalary;
    cout << "Enter the allowance percentage: ";
    cin >> allowancePercentage;
    cout << "Enter the deduction percentage: ";
    cin >> deductionPercentage;
    float grossSalary = calculateGrossSalary(basicSalary, allowancePercentage);
    float netSalary = calculateNetSalary(grossSalary, deductionPercentage);
    cout << "The final net salary is: " << netSalary << endl;

    return 0;
}
