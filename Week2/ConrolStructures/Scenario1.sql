--As in given excercise there were no any user having age greater than 60, so I have added a user with age greater than 60 to demonstrate the scenario

INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
VALUES (5, 'Jonny Root', TO_DATE('1955-15-05', 'YYYY-MM-DD'), 1000, SYSDATE);



BEGIN
  FOR res IN (
    SELECT c.customerID,l.loanId,l.interestRate 
    FROM loans l 
    JOIN customers c ON l.customerid = c.customerid 
    WHERE TRUNC(MONTHS_BETWEEN(SYSDATE,c.dob)/12)>60
  ) LOOP
    UPDATE loans
    SET interestRate=interestRate-(interestRate *0.01)
    WHERE loanId =res.loanId;
  END LOOP;
  COMMIT; 
END;
/


