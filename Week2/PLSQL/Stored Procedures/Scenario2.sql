CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
   bonous IN number,
   e_depar IN varchar2
) IS
BEGIN
    UPDATE Employees 
    SET salary = salary +(salary*bonous/100)
    WHERE Department = e_depar;
    DBMS_OUTPUT.PUT_LINE('Bonus applied');
    END;
    /
    
-- To execute the procedure

    BEGIN
  UpdateEmployeeBonus(10, 'IT');
END;
/
    
    
    