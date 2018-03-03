use mysql;

-- 1° Drop anonymous user
DELETE FROM mysql.user WHERE User='';

CREATE DATABASE customers CHARACTER SET utf8 COLLATE utf8_general_ci;

alter user customers identified by PASSWORD('customers');

SET PASSWORD FOR 'customers'@'%' = PASSWORD('customers');

GRANT SELECT, INSERT ON customers.* TO 'root'@'%';

GRANT SELECT, INSERT ON customers.* TO 'customers'@'%';