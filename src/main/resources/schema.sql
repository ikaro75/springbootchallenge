CREATE TABLE IF NOT EXISTS RULES (
    ID INT NOT NULL,
    RULENAME VARCHAR(255)
);
INSERT INTO RULES (ID,RULENAME) VALUES(1,'Must be 5 characters');
INSERT INTO RULES (ID,RULENAME) VALUES(2,'Must not be used elsewhere');
INSERT INTO RULES (ID,RULENAME) VALUES(3,'Must be cool');