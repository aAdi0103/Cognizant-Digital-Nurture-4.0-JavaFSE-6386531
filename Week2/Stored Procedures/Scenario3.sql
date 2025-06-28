CREATE OR REPLACE PROCEDURE TransferFunds (
    amount IN number,
    from_acc IN number,
    to_acc IN number
) IS
   curr_bal number;
BEGIN  
 SELECT Balance INTO curr_bal  FROM ACCOUNTS
  WHERE AccountID = from_acc 
  FOR update;
  IF amount > curr_bal THEN
     raise_application_error(-20001,'Insufficient fund');
     END IF;
   
   UPDATE ACCOUNTS 
   SET BALANCE = BALANCE + amount,
   lastModified = sysdate
   WHERE AccountID = to_acc;
   
   UPDATE ACCOUNTS 
   SET BALANCE = BALANCE - amount,
   lastModified = sysdate
   WHERE AccountID = from_acc;
   
   END;
   /
   

-- To execute the procedure

   SET SERVEROUTPUT ON;
   DECLARE 
   from_account number :=1;
   to_account number :=2;
   amt number :=500;
   BEGIN
     TransferFunds(amt,from_account,to_account);
     dbms_output.put_line('Transfer succesfull');
     END;
     /
  
   
  