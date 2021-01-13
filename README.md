# Banking System API

* This repository contains the implementation for a REST API for a banking system.

# REST APIs:
Using postman use authorization as basic auth.

1. ADMIN Role:

    1. Get all employees:
    GET http://localhost:8080/emp/allEmployees

    2. Add an employee
    POST http://localhost:8080/emp/addEmployee

    3. Delete an employee
    Delete http://localhost:8080/emp/deleteEmployee/{id}


2. USER Role:
    Using postman use authorization as basic auth

    Customer :
    
    1. Get all customers
    GET http://localhost:8080/cust/customers

    2. Get a customer
    GET http://localhost:8080/cust/customer/{id}

    3. add a customer
    POST http://localhost:8080/cust/addCustomer
    body: {
      "cid": 9,
      "name": "vikas",
      "accountid":2
    }

    4. delete a customer
    DELETE http://localhost:8080/cust/customer/{id}


    Account :

    1. add account
    POST http://localhost:8080/acc/addAccount
    body : {
      "accountid":2,
      "type": "savings",
      "balance": 90900
    }

    2. get account details
    GET http://localhost:8080/acc/account/{id}

    3. get account balance
    GET http://localhost:8080/acc/accountbalnce/{id}

    4. withdraw money with amount
    http://localhost:8080/acc/withdrawAmount?accountid=1&amount=100

    5. deposit money with amount
    PUT http://localhost:8080/acc/depositAmount?accountid=1&amount=80000

    6. update account balance with 3.5 %
    PUT http://localhost:8080/acc/updtaeAccountWithIntrest/1

    7. transfer funds
    PUT http://localhost:8080/acc/transferFunds?accountidfrom=1&accountidto=2&amount=1000


