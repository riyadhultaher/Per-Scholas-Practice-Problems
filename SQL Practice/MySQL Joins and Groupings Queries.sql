/* Question 1 */
SELECT c.customerName AS `Customer Name`, CONCAT(e.lastName, ', ', e.firstName) AS `Employee Name`
FROM customers c 
INNER JOIN employees e ON c.salesRepEmployeeNumber = e.employeeNumber
ORDER BY c.customerName

/* Question 2 */
SELECT p.productName AS `Product Name`, SUM(od.quantityOrdered) AS `Total # Ordered`, SUM(quantityOrdered * od.priceEach) AS `Total Sale` 
FROM orderdetails od
LEFT JOIN products p ON p.productCode = od.productCode
GROUP BY `Product Name`
ORDER BY `Total Sale` DESC

/* Question 3 */
SELECT o.status AS `Order Status`, COUNT(od.quantityOrdered) AS `# Orders`
FROM orders o
INNER JOIN orderdetails od
GROUP BY `Order Status`
ORDER BY `Order Status`

/* Question 4 */
SELECT p.productLine AS `Product Line`, COUNT(od.quantityOrdered) AS `# Sold`
FROM products p
INNER JOIN orderdetails od ON p.productCode = od.productCode
GROUP BY `Product Line`
ORDER BY `# Sold` DESC

/* Question 5 */
SELECT CONCAT(e.lastName, ', ', e.firstName) AS `Sales Rep`, COUNT(od.quantityOrdered) AS `# Orders`,
CASE
	WHEN od.quantityOrdered IS NULL
		THEN 0.00
	WHEN od.quantityOrdered = 0
		THEN 0.00
	WHEN od.quantityOrdered > 0
		THEN SUM(od.quantityOrdered * od.priceEach)
END AS `Total Sales`
FROM customers c
RIGHT JOIN ( 
	SELECT employeeNumber, lastName, firstName, jobTitle 
	FROM employees
	WHERE jobTitle = 'Sales Rep'
)
AS e ON (c.salesRepEmployeeNumber = e.employeeNumber)
LEFT JOIN orders o ON (c.customerNumber = o.customerNumber)
LEFT JOIN orderdetails od ON (o.orderNumber = od.orderNumber)
GROUP BY `Sales Rep`
ORDER BY `Total Sales` DESC

/* Question 6 */
