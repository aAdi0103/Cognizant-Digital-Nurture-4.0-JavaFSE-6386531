CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  UPDATE Accounts
  SET 
    Balance = Balance + (Balance * 0.01),
    LastModified = SYSDATE
  WHERE 
    AccountType = 'Savings';
  DBMS_OUTPUT.PUT_LINE('Monthly interest applied to all Savings account');
END;
/

-- To execute the procedure
BEGIN
  ProcessMonthlyInterest;
END;
/