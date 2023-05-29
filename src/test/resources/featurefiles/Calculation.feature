Feature: Verifying Salary Calculation functionality

Scenario Outline: Calculating netsalary functionality 
Given User Should Navigate to Calculation page
When User Enter grossalary "<GrosSalary>" 
And User enter "<IncomeTax>" and "<PF>" and "<ProfessionalTax>"
Then User should get NetSalary information "<NetSalary>"





Examples:
| GrosSalary | IncomeTax | PF | ProfessionalTax | NetSalary |
| 480000|0|30000|6000|444000|
| 600000|40000|30000|6000|524000|