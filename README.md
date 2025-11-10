Inventrack – MVP Inventory System (README)
--

Goal: Build a small inventory app that is easy to run and extend.
--
Scope (MVP): Catalog, purchases, and sales with real-time stock update, plus basic admin and simple reports for daily work.



1) Tech & Architecture

Stack

*Java 21, Spring Boot 3.x
*Spring Web, Spring Data JPA, Validation, Security (JWT with JJWT)
*PostgreSQL (Supabase)
*OpenAPI (Swagger) for API docs
*Lombok

Package layout
-

<img width="550" height="325" alt="image" src="https://github.com/user-attachments/assets/a8f2c3f3-a9da-4a11-b3b8-ac5f71664a80" />


2) MVP Features
   -

Categories Management
Covers: US 1, 2, 3

Create / edit (activate–deactivate) / delete.

Do not allow delete if the category has products.

Products Management
Covers: US 6, 7

Create products (unique SKU, minStock, price).

List with search by name/SKU and filter by category.

Purchases with stock update
Covers: US 14, 15

Save purchases with items (product, quantity, cost).

Create IN movements and show purchase detail/total.

Sales with stock update
Covers: US 16

Save sales with items (product, quantity, price).

Validate stock and create OUT movements.

Suppliers & Customers (basic)
Covers: US 8, 9, 10

Keep a simple, solid base of partners for buy/sell.

Operating Expenses
Covers: US 11

Register company expenses (transport, loading, etc.) separated from stock.

PDF Quotes
Covers: US 12

Generate and download product quotes.

Bulk Import (CSV/Excel)
Covers: US 13

Import catalog fast.

Profit Indicators
Covers: US 4

Profit by category and total.

Capital / Investment 
Covers: US 5

Record capital entries separated from inventory.

3) User Stories 

ADMIN – As an ADMIN, I want to create categories with a unique name so that I can organize the catalog, use filters/search, and keep products ordered.

ADMIN – As an ADMIN, I want to edit a category to mark it active/inactive so that I keep the catalog up to date without losing history and control which categories are visible.

ADMIN – As an ADMIN, I want to delete categories so that I remove old categories and avoid confusion when creating products. (Do not delete if it has products.)

ADMIN – As an ADMIN, I want to know profit by category and total catalog so that I can make buy/price decisions based on profitability.

ADMIN – As an ADMIN, I want to register extra money added to products (investment) so that I control company capital separate from inventory.

ADMIN/OPERATOR – As ADMIN/OPERATOR, I want to create products with SKU, name, category, price, and min stock so that I register items and enable stock control.

ADMIN/OPERATOR – As ADMIN/OPERATOR, I want to list products with search by name/SKU and filter by category so that I can find products fast and work better on purchases/sales.

ADMIN/OPERATOR – As ADMIN/OPERATOR, I want to add customers and suppliers with real data so that I have a solid database for buying and selling.

ADMIN/OPERATOR – As ADMIN/OPERATOR, I want to list customers with the products sold so that I can analyze customer consumption and find opportunities.

ADMIN/OPERATOR – As ADMIN/OPERATOR, I want to list suppliers with the products bought so that I can audit recent purchases and validate stock vs. entries.

ADMIN/OPERATOR – As ADMIN/OPERATOR, I want to register company expenses (transport, food, loading/unloading, etc.) so that I separate operating costs from product cost and stock.

ADMIN/OPERATOR – As ADMIN/OPERATOR, I want to generate product quotes as PDF so that I can send quick information to clients.

ADMIN/OPERATOR – As ADMIN/OPERATOR, I want to bulk import products from Excel/CSV so that I fill the catalog fast without creating one by one.

OPERATOR – As an OPERATOR, I want to create a purchase with supplier and items (product, quantity, cost) so that I add stock and update inventory in a transaction.

OPERATOR – As an OPERATOR, I want to see the purchase with its items and totals so that I can audit costs and check what entered.

OPERATOR – As an OPERATOR, I want to create a sale with client and items (product, quantity, price) so that I decrease stock and register outputs that affect inventory.




<img width="1558" height="972" alt="image" src="https://github.com/user-attachments/assets/7d38a39e-8179-4746-99e4-ff7227575eae" />


<img width="985" height="689" alt="image" src="https://github.com/user-attachments/assets/73d923a2-3b55-41cf-8553-aaecf58296d7" />

