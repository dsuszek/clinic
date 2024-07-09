CREATE TABLE IF NOT EXISTS Patients (
id TINYINT PRIMARY KEY AUTO_INCREMENT,
name varchar(50),
lastName varchar(150)
);

CREATE TABLE IF NOT EXISTS Appointments (
id TINYINT PRIMARY KEY AUTO_INCREMENT,
visitDate varchar(30) UNIQUE,
FOREIGN KEY (patientId) REFERENCES Patients (id),
FOREIGN KEY (doctorId) REFERENCES Doctors(id)
);

