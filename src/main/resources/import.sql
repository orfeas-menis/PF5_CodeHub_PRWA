INSERT INTO MEMBERS (city,email,firstname,lastname,password,phone_number,postal_code,property_type,street,street_number,vat) VALUES ('Athens','a@bla.com','Kostas','Anagnostou','12345k-','210330000','10234','MONO','Mpenaki','20','956750909');
INSERT INTO MEMBERS (city,email,firstname,lastname,password,phone_number,postal_code,property_type,street,street_number,vat) VALUES ('Thessaloniki','b@bla.com','Giannis','Theodorou','seo+1','2107700000','13634','POLY','Aiolou','25','234852784');
INSERT INTO MEMBERS (city,email,firstname,lastname,password,phone_number,postal_code,property_type,street,street_number,vat) VALUES ('Larissa','c@bla.com','Lampros','Alimpertis','password+1','2108100000','17214','MEZO','Akadimias','31','234735409');
INSERT INTO MEMBERS (city,email,firstname,lastname,password,phone_number,postal_code,property_type,street,street_number,vat) VALUES ('Irakleio','d@bla.com','Christos','Apostolopoulos','s+01234','6990000002','18924','MEZO','Ermou','56','903850909');
INSERT INTO MEMBERS (city,email,firstname,lastname,password,phone_number,postal_code,property_type,street,street_number,vat) VALUES ('Volos','e@bla.com','Vasiliki','Kitsiou','1990gen-','6940000000','19924','POLY','Stadiou','67','648900909');
INSERT INTO MEMBERS (city,email,firstname,lastname,password,phone_number,postal_code,property_type,street,street_number,vat) VALUES ('Patra','f@bla.com','Orfeas','Mitropoulos','mitro+13','6930000000','10654','MONO','Tsaldari','42','2348204967');
INSERT INTO MEMBERS (city,email,firstname,lastname,password,phone_number,postal_code,property_type,street,street_number,vat) VALUES ('Komotini','g@bla.com','Dimitra','Alexandrou','alex#3','6990000004','17945','MEZO','Panepistimiou','97','8921359087');


INSERT INTO ROLES (name) VALUES ('ADMIN');
INSERT INTO ROLES (name) VALUES ('USER');

INSERT INTO ROLE_USER(user_id,role_id) VALUES('1','1');
INSERT INTO ROLE_USER(user_id,role_id) VALUES('1','2');


INSERT INTO REPAIR (category, city, cost, date_time, description, postal_code, status, street, street_number, user_id) VALUES ('PAINT', 'Athens', 30, CURRENT_TIMESTAMP,'Beautiful Design','15770','INPROGRESS','Panepistimiou','16','3');
INSERT INTO REPAIR (category, city, cost, date_time, description, postal_code, status, street, street_number, user_id) VALUES ('PLUMP', 'Thessaloniki', 50, CURRENT_TIMESTAMP,'Good Job','12340','COMPLETED','Aiolou','51','5');
INSERT INTO REPAIR (category, city, cost, date_time, description, postal_code, status, street, street_number, user_id) VALUES ('ELECTR', 'Larissa', 30, CURRENT_TIMESTAMP,'Im Waiting','43212','PENDIND','Mpenaki','18','1');
INSERT INTO REPAIR (category, city, cost, date_time, description, postal_code, status, street, street_number, user_id) VALUES ('CHAMBRANLE', 'Volos', 20, CURRENT_TIMESTAMP,'Almost Done','29865','INPROGRESS','Stadiou','20','2');


