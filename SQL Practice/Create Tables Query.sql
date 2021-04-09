CREATE DATABASE Ecommerce_website;

CREATE TABLE `department` (
DepartmentID int(10) PRIMARY KEY AUTO_INCREMENT,
DepartmentName varchar(50) NOT NULL,
DepartmentManager	varchar(50) DEFAULT NULL,
DepartmentSize	VARCHAR(10) DEFAULT NULL,
Departmentinformation	varchar(50) DEFAULT NULL,
DepartmentCreationDate	DATE,
DepartmentExtensionNumber 	INT(10) DEFAULT NULL,
`officeCode` varchar(10) UNIQUE NOT NULL,
 `city` varchar(50) NOT NULL,
  `phone` 	INT(10) DEFAULT NULL,
  `addressLine1` varchar(50) NOT NULL,
  `addressLine2` varchar(50) DEFAULT NULL,
  `state` varchar(50) DEFAULT NULL,
  `country` varchar(50)  DEFAULT NULL,
  `postalCode` varchar(15)  DEFAULT NULL,
  `territory` varchar(10)  DEFAULT NULL
) ;

CREATE TABLE `payment` (
PaymentID INT PRIMARY KEY AUTO_INCREMENT,
PaymentAmount DOUBLE (1) CHECK (PaymentAmount >= 1),
PaymentMerchant VARCHAR (50) DEFAULT NULL,
PaymentMethod VARCHAR (50) NOT NULL,
PaymentDate DATE,
PaymentStatus VARCHAR (50) DEFAULT 'None',
PaymentOccurency VARCHAR (50) DEFAULT 'N/A',
PaymentCurrency VARCHAR (50) NOT NULL,
PaymentHistory VARCHAR (50) DEFAULT NULL,
FK_PaymentInvoice VARCHAR (50) NOT NULL,
FOREIGN KEY (FK_PaymentInvoice) REFERENCES invoice (InvoiceID),
PaymentCode VARCHAR (50) NOT NULL
);

CREATE TABLE `shipping` (
ShippingID INT PRIMARY KEY AUTO_INCREMENT,
ShippingCompanyName VARCHAR (50) DEFAULT 'None',
ShippingMethod VARCHAR (50) NOT NULL,
ShippingDate DATE,
ShippingStatus VARCHAR (50) DEFAULT 'None',
ShippingPriority VARCHAR (50) DEFAULT 'Standard',
ShippingCost DOUBLE (1) DEFAULT 'Free Shipping',
CONSTRAINT ShippingTracking INT UNIQUE,
ShippingDestination VARCHAR (50) NOT NULL,
ShippingZipCode VARCHAR (5) NOT NULL
FOREIGN KEY (FK_ShippingOrder) REFERENCES ordertable (OrderID)
);

CREATE TABLE `ordertable` (
OrderID INT PRIMARY KEY AUTO_INCREMENT,
OrderItems VARCHAR (50) NOT NULL,
FOREIGN KEY (OrderDate) REFERENCES payment (PaymentDate),


DESCRIBE department;

SHOW DATABASES;