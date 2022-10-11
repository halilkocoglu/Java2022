--Select
--ANSI
Select ContactName,CompanyName, City from Customers

Select * from Customers where City = 'London'

-- Case insensitive
Select * from Products where CategoryID = 1 or CategoryID = 3

select * from Products where CategoryID = 1 and UnitPrice > 10
--Listing
select * from Products order by CategoryID,ProductName 

select * from Products order by UnitPrice asc --ascending (default value)

select * from Products order by UnitPrice desc -- descending

select * from Products where CategoryID=1 order by UnitPrice desc 

select count(*) from Products  -- count all lines

select count(*) Amount from Products where CategoryID = 2

Select CategoryID,count(*) from Products group by CategoryID -- amount of products with Category id

select count(*) Amount from Products group by CategoryID --only amount of products

Select CategoryID,count(*) from Products group by CategoryID having count(*)<10

Select CategoryID,count(*) from Products where UnitPrice>20 group by CategoryID having count(*)<10

select Products.ProductID, Products.ProductName,Products.UnitPrice,Categories.CategoryName
from Products inner join Categories  --products and categories both. ( join = concatenate)
on Products.CategoryID = Categories.CategoryID --  on = condition       if product's  category id and Categori'es category id are equal, concatenate both.
where Products.UnitPrice>10
--DTO Data Transformation Object 
--If there is a space in the name, you've to write in square brackets.
select * from Products p inner join  [Order Details] od
on p.ProductID = od.ProductID
inner join Orders o
on o.OrderID = od.OrderID

select * from Customers c left join Orders o
on c.CustomerID = o.CustomerID
where o.CustomerID is null




