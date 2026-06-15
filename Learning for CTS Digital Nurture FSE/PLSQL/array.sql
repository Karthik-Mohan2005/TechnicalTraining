DECLARE
type namesarray is varray(5) of varchar2(10);
type marksarray is varray(5) of integer;
names namesarray;
marks marksarray;
BEGIN
    names:=namesarray('Karthik','Mohan','Latha','Bhuvana','Rudhvi');
    marks:=marksarray(100,99,98,97,80);
    for i in 1..5 loop
        dbms_output.PUT_LINE(names(i)||' '||marks(i));
    end loop;
end;