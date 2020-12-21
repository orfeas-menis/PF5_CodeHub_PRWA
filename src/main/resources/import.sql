INSERT INTO MEMBERS (city,email,firstname,lastname,password,phone_number,postal_code,property_type,street,street_number,vat,user_role) VALUES ('Athens','a@bla.com','Kostas','Anagnostou','$2a$10$aLmmAESZEX61.QxO4zFwvus19RoW4lIy1Rx7TDdg7EcQ0P9n9ZcGu','210330000','10234','MONO','Mpenaki','20','956750909','OWNER');
INSERT INTO MEMBERS (city,email,firstname,lastname,password,phone_number,postal_code,property_type,street,street_number,vat,user_role) VALUES ('Thessaloniki','b@bla.com','Giannis','Theodorou','$2a$10$aLmmAESZEX61.QxO4zFwvus19RoW4lIy1Rx7TDdg7EcQ0P9n9ZcGu','2107700000','13634','POLY','Aiolou','25','234852784','OWNER');
INSERT INTO MEMBERS (city,email,firstname,lastname,password,phone_number,postal_code,property_type,street,street_number,vat,user_role) VALUES ('Larissa','c@bla.com','Lampros','Alimpertis','$2a$10$aLmmAESZEX61.QxO4zFwvus19RoW4lIy1Rx7TDdg7EcQ0P9n9ZcGu','2108100000','17214','MEZO','Akadimias','31','234735409','OWNER');
INSERT INTO MEMBERS (city,email,firstname,lastname,password,phone_number,postal_code,property_type,street,street_number,vat,user_role) VALUES ('Irakleio','d@bla.com','Christos','Apostolopoulos','$2a$10$aLmmAESZEX61.QxO4zFwvus19RoW4lIy1Rx7TDdg7EcQ0P9n9ZcGu','6990000002','18924','MEZO','Ermou','56','903850909','OWNER');
INSERT INTO MEMBERS (city,email,firstname,lastname,password,phone_number,postal_code,property_type,street,street_number,vat,user_role) VALUES ('Volos','e@bla.com','Vasiliki','Kitsiou','$2a$10$aLmmAESZEX61.QxO4zFwvus19RoW4lIy1Rx7TDdg7EcQ0P9n9ZcGu','6940000000','19924','POLY','Stadiou','67','648900909','OWNER');
INSERT INTO MEMBERS (city,email,firstname,lastname,password,phone_number,postal_code,property_type,street,street_number,vat,user_role) VALUES ('Patra','f@bla.com','Orfeas','Mitropoulos','$2a$10$aLmmAESZEX61.QxO4zFwvus19RoW4lIy1Rx7TDdg7EcQ0P9n9ZcGu','6930000000','10654','MONO','Tsaldari','42','234820496','ADMIN');
INSERT INTO MEMBERS (city,email,firstname,lastname,password,phone_number,postal_code,property_type,street,street_number,vat,user_role) VALUES ('Komotini','g@bla.com','Dimitra','Alexandrou','$2a$10$aLmmAESZEX61.QxO4zFwvus19RoW4lIy1Rx7TDdg7EcQ0P9n9ZcGu','6990000004','17945','MEZO','Panepistimiou','97','892135908','OWNER');
INSERT INTO MEMBERS (city,email,firstname,lastname,password,phone_number,postal_code,property_type,street,street_number,vat,user_role) VALUES ('Chios','h@bla.com','Giorgos','Peristeris','$2a$10$aLmmAESZEX61.QxO4zFwvus19RoW4lIy1Rx7TDdg7EcQ0P9n9ZcGu','6991111004','82131','POLY','Venizelou','22','123987456','OWNER');
INSERT INTO MEMBERS (city,email,firstname,lastname,password,phone_number,postal_code,property_type,street,street_number,vat,user_role) VALUES ('Athens','menisorfeas@gmail.com','Orfeas','Menis','$2a$10$aLmmAESZEX61.QxO4zFwvus19RoW4lIy1Rx7TDdg7EcQ0P9n9ZcGu','6956628555','16121','MEZO','Panioniou','22','897564231','ADMIN');
INSERT INTO MEMBERS (city,email,firstname,lastname,password,phone_number,postal_code,property_type,street,street_number,vat,user_role) VALUES ('Salonika','mitsos@gmail.com','Dimitris','Polyzos','$2a$10$aLmmAESZEX61.QxO4zFwvus19RoW4lIy1Rx7TDdg7EcQ0P9n9ZcGu','6999999923','89997','MEZO','Agathoupoleos','5','111111111','OWNER');
INSERT INTO MEMBERS (city,email,firstname,lastname,password,phone_number,postal_code,property_type,street,street_number,vat,user_role) VALUES ('Atlantis','atlas@gmail.com','Tzon','Bontzovis','$2a$10$aLmmAESZEX61.QxO4zFwvus19RoW4lIy1Rx7TDdg7EcQ0P9n9ZcGu','2102323235','12345','MONO','Akadimias','69','666666666','OWNER');


INSERT INTO REPAIR (category, city, cost, date_time, description, postal_code, status, street, street_number, user_id) VALUES ('PAINT', 'Athens', 30, CAST( GETDATE() AS Date ) ,'Beautiful Design','15770','INPROGRESS','Panepistimiou','16','3');
INSERT INTO REPAIR (category, city, cost, date_time, description, postal_code, status, street, street_number, user_id) VALUES ('PLUMP', 'Athens', 100.50, CAST( GETDATE() AS Date ) ,'Beautiful Design','15770','INPROGRESS','Panepistimiou','16','3');
INSERT INTO REPAIR (category, city, cost, date_time, description, postal_code, status, street, street_number, user_id) VALUES ('ELECTR', 'Athens', 80, CAST( GETDATE() AS Date ) ,'Beautiful Design','15770','INPROGRESS','Panepistimiou','16','3');
INSERT INTO REPAIR (category, city, cost, date_time, description, postal_code, status, street, street_number, user_id) VALUES ('CHAMBRANLE', 'Athens', 260.70, CAST( GETDATE() AS Date ) ,'Beautiful Design','15770','INPROGRESS','Panepistimiou','16','3');

INSERT INTO REPAIR (category, city, cost, date_time, description, postal_code, status, street, street_number, user_id) VALUES ('ELECTR', 'Volos', 26, CAST( GETDATE() - 1 AS Date ),'Yesterday Repair','16121','INPROGRESS','Stadiou','20','6');
INSERT INTO REPAIR (category, city, cost, date_time, description, postal_code, status, street, street_number, user_id) VALUES ('CHAMBRANLE', 'Volos', 140, CAST( GETDATE() - 1 AS Date ),'Yesterday Repair','16121','INPROGRESS','Stadiou','20','6');
INSERT INTO REPAIR (category, city, cost, date_time, description, postal_code, status, street, street_number, user_id) VALUES ('PLUMP', 'Volos', 60, CAST( GETDATE() - 3 AS Date ),'3 days before Repair','16121','INPROGRESS','Stadiou','20','6');
INSERT INTO REPAIR (category, city, cost, date_time, description, postal_code, status, street, street_number, user_id) VALUES ('PAINT', 'Volos', 26.88, CAST( GETDATE() - 3 AS Date ),'3 days before Repair','16121','INPROGRESS','Stadiou','20','6');

INSERT INTO REPAIR (category, city, cost, date_time, description, postal_code, status, street, street_number, user_id) VALUES ('PLUMP', 'Thessaloniki', 50, CAST( GETDATE() AS Date ),'Good Job','12340','COMPLETED','Aiolou','51','5');
INSERT INTO REPAIR (category, city, cost, date_time, description, postal_code, status, street, street_number, user_id) VALUES ('ELECTR', 'Thessaloniki', 42.98, CAST( GETDATE() AS Date ),'Good Job','12340','INPROGRESS','Aiolou','51','5');

INSERT INTO REPAIR (category, city, cost, date_time, description, postal_code, status, street, street_number, user_id) VALUES ('ELECTR', 'Larissa', 100, CAST( GETDATE() AS Date ),'Im Waiting','43212','PENDING','Mpenaki','18','1');
INSERT INTO REPAIR (category, city, cost, date_time, description, postal_code, status, street, street_number, user_id) VALUES ('CHAMBRANLE', 'Larissa', 1000, CAST( GETDATE() AS Date ),'Im Waiting','43212','INPROGRESS','Mpenaki','18','1');
INSERT INTO REPAIR (category, city, cost, date_time, description, postal_code, status, street, street_number, user_id) VALUES ('PLUMP', 'Larissa', 45.90, CAST( GETDATE() AS Date ),'Im Waiting','43212','INPROGRESS','Mpenaki','18','1');
INSERT INTO REPAIR (category, city, cost, date_time, description, postal_code, status, street, street_number, user_id) VALUES ('PAINT', 'Larissa', 30, CAST( GETDATE() AS Date ),'Im Waiting','43212','INPROGRESS','Mpenaki','18','1');

INSERT INTO REPAIR (category, city, cost, date_time, description, postal_code, status, street, street_number, user_id) VALUES ('CHAMBRANLE', 'Volos', 20, CAST( GETDATE() AS Date ),'Almost Done','29865','INPROGRESS','Stadiou','20','2');
INSERT INTO REPAIR (category, city, cost, date_time, description, postal_code, status, street, street_number, user_id) VALUES ('ELECTR', 'Volos', 90, CAST( GETDATE() AS Date ),'Almost Done','29865','INPROGRESS','Stadiou','20','2');
INSERT INTO REPAIR (category, city, cost, date_time, description, postal_code, status, street, street_number, user_id) VALUES ('PLUMP', 'Volos', 70, CAST( GETDATE() AS Date ),'Almost Done','29865','INPROGRESS','Stadiou','20','2');





