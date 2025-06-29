--As in given excercise there were no any user having balance greater than 10000, so I have added a user with balance greater than 10000 to demonstrate the scenario

--Also, there was no any isVIP column in the Customer table so i have inserted a column named isVIP in the Customer table and applied a constraint on it 'Default' and set it to 'false'

INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
VALUES (6, 'Alan Doe',TO_DATE('1988-05-15', 'YYYY-MM-DD'),11000,SYSDATE);

ALTER TABLE customers ADD isVIP VARCHAR2(6) DEFAULT 'false';

BEGIN
  FOR res IN (
    SELECT customerID 
    FROM customers 
    WHERE balance>10000
  ) LOOP
    UPDATE customers 
    SET isVIP='true' 
    WHERE customerID =res.customerID;
  END LOOP;

  COMMIT;
END;
/

