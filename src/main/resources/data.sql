-- TODO 1 data.sql w katalogu resources informuje Spring o potrzebie zapełnienia bazy danymi
-- plik do tworzenia schematu nazywa się schema.sql
-- w naszym przypadku schemat tworzony jest przez hibernate (możemy to wyłączyć spring.jpa.hibernate.ddl-auto)
-- Hibernate przy tworzeniu schematu korzysta z nazw klas i pól i odpowiednio je mapuje na tabele / kolumny

insert into hobbit ( first_name, last_name) values ('Penelope','Tuk');
insert into hobbit ( first_name, last_name) values ('Billbo','Tuk');
insert into hobbit ( first_name, last_name) values ('X','Tuk');