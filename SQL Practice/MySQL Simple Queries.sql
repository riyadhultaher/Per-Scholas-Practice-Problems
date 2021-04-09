/* Question 1 */
SELECT productName AS `Name`, productLine AS `Product Line`, buyPrice AS `Buy Price` FROM products
ORDER BY `Buy Price` DESC

/* Question 2 */
SELECT contactFirstName AS `First Name`, contactLastName AS `Last Name`, city AS `City` FROM customers
WHERE country IN ('Germany')

/* Question 3 */
SELECT DISTINCT STATUS AS `Status` FROM orders
ORDER BY `Status` ASC

/* Question 4 */
 SELECT * FROM payments 
 WHERE paymentDate >= 20050101
 ORDER BY paymentDate ASC
 
 /* Question 5 */
 SELECT lastName AS `Last Name`, firstName AS `First Name`, email AS `Email`, jobTitle AS `Job Title` FROM employees
 WHERE officeCode IN (1)
 ORDER BY `Last Name` ASC
 
 /* Question 6 */
 SELECT productName AS `Product Name`, productLine AS `Product Line`, productScale AS `Product Scale`, productVendor AS `Product Vendor` FROM products
 WHERE productLine IN ('Vintage Cars', 'Classic Cars')
 ORDER BY `Product Line` DESC, `Product Name` ASC