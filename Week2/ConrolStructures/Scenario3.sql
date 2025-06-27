BEGIN
  FOR res IN (
    SELECT c.name, l.loanId, l.endDate
    FROM loans l
    JOIN customers c ON l.customerId = c.customerId
    WHERE l.endDate BETWEEN SYSDATE AND SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Dear' || res.name || 
                         ',your loan (ID: ' || res.loanId || 
                         ') is due on ' || TO_CHAR(res.endDate, 'DD-Mon-YYYY') || '.');
  END LOOP;
END;
/
