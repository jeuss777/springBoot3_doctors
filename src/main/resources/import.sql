INSERT INTO doctor (id,first_name,last_name, specialization,contact_number,email,office_address)
VALUES (1,'Paul','Ceballos','Pediatrician','+93 123 456 7890','paul@yahoo.com','Oriente');
INSERT INTO doctor (id,first_name,last_name, specialization,contact_number,email,office_address)
VALUES (2,'Fabricio','Ceballos','Cardiologist','+93 123 456 7777','fabricio@yahoo.com','Oriente');
INSERT INTO doctor (id,first_name,last_name, specialization,contact_number,email,office_address)
VALUES (3,'Mariana','Venegas','Generalist MD','+901 123 456 7890','mariana@yahoo.com','Medicos');

INSERT INTO patient (id,first_name,last_name, date_of_birth,gender,contact_number,email,address,city,state, zip_code,doctor_id)
VALUES (1,'Jesus Octavio','Arana Munoz','2022-09-05','M','901 691-0175','octavio@yahoo.com','320 Summerfield Ln','Cordova','TN','38018',1);

INSERT INTO patient (id,first_name,last_name, date_of_birth,gender,contact_number,email,address,city,state, zip_code,doctor_id)
VALUES (2,'Emmy Isabela','Cacuango Munoz','2015-08-03','F','901 691-0175','emmy@yahoo.com','320 Summerfield Ln','Cordova','TN','38018',2);