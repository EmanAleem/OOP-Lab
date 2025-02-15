#include <iostream>
#include <string>
using namespace std;
struct Employee {
    string name;
    int id;
    float salary;
};
    void InputEmployeeData(Employee &emp) {
    cout << "Enter employee name: ";
    cin.ignore(); 
    getline(cin, emp.name);
    cout << "Enter employee ID: ";
    cin >> emp.id;
    cout << "Enter employee salary: ";
    cin >> emp.salary;
}
void DisplayEmployeeData(Employee emp[], int numEmployees) {
    cout << "\nEmployee Records:\n";
    for (int i = 0; i < numEmployees; i++) {
        cout << "Employee ID: " << emp[i].id << endl;
        cout << "Employee Name: " << emp[i].name << endl;
        cout << "Employee Salary: " << emp[i].salary << endl;
        cout << "---------------------------\n";
    }
}
void FindHighestSalary(Employee emp[], int numEmployees) {
    if (numEmployees == 0) {
        cout << "No employee records available.\n";
        return;
    }
    Employee highestSalaryEmployee = emp[0];
    for (int i = 1; i < numEmployees; i++) {
        if (emp[i].salary > highestSalaryEmployee.salary) {
            highestSalaryEmployee = emp[i];
        }
    }
    cout << "\nEmployee with the highest salary:\n";
    cout << "Employee ID: " << highestSalaryEmployee.id << endl;
    cout << "Employee Name: " << highestSalaryEmployee.name << endl;
    cout << "Employee Salary: " << highestSalaryEmployee.salary << endl;
}
int main() {
    int numEmployees;
    cout << "Enter the number of employees: ";
    cin >> numEmployees;
    Employee employees[numEmployees];
    for (int i = 0; i < numEmployees; i++) {
        cout << "\nEnter details for Employee " << i + 1 << ":\n";
        InputEmployeeData(employees[i]);
    }
    DisplayEmployeeData(employees, numEmployees);
    FindHighestSalary(employees, numEmployees);
    return 0;
}
