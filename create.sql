CREATE TABLE Users (
    userId VARCHAR(50) PRIMARY KEY,
    userPassword VARCHAR(255) NOT NULL,
    userEmail VARCHAR(100) UNIQUE NOT NULL,
    userName VARCHAR(50) NOT NULL,
    userNickname VARCHAR(50),
    userSsn VARCHAR(20) UNIQUE NOT NULL,
    userPhone VARCHAR(20) NOT NULL,
    userAddress TEXT,
    userPostalCode INT,
    userRegistDate DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE Companys (
    companyId VARCHAR(50) PRIMARY KEY,
    companyPassword VARCHAR(255) NOT NULL,
    companyName VARCHAR(100) NOT NULL,
    companyEmail VARCHAR(100) UNIQUE NOT NULL,
    businessRegistrationCertificate VARCHAR(20) UNIQUE NOT NULL,
    companyAddress TEXT,
    companyPostalCode INT,
    companyTel VARCHAR(20),
    establishmentDate DATE,
    webSite VARCHAR(255),
    ceo VARCHAR(50),
    employees INT,
    annualRevenue BIGINT,
    companyRegistDate DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE Certificates (
    certificateNum INT AUTO_INCREMENT PRIMARY KEY,
    certificateName VARCHAR(100) NOT NULL,
    certificateBy VARCHAR(100) NOT NULL
);

CREATE TABLE JobRoles (
    roleId INT AUTO_INCREMENT PRIMARY KEY,
    roleName VARCHAR(100) NOT NULL
);

CREATE TABLE TechStacks (
    techStackNum INT AUTO_INCREMENT PRIMARY KEY,
    stackName VARCHAR(100) NOT NULL
);

CREATE TABLE Resumes (
    resumeNum INT AUTO_INCREMENT PRIMARY KEY,
    userId VARCHAR(50) NOT NULL,
    resumeTitle VARCHAR(255) NOT NULL,
    resumePhone VARCHAR(20) NOT NULL,
    resumeContent TEXT,
    portfolioName VARCHAR(255),
    personalPhotoName VARCHAR(255),
    education VARCHAR(255),
    school VARCHAR(100),
    address TEXT,
    roleId INT,
    militaryService VARCHAR(50),
    createdDate DATETIME DEFAULT CURRENT_TIMESTAMP,
    updatedDate DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE Careers (
    careerNum INT AUTO_INCREMENT PRIMARY KEY,
    resumeNum INT NOT NULL,
    career VARCHAR(50),
    careerName VARCHAR(100)
);

CREATE TABLE Internships (
    internshipNum INT AUTO_INCREMENT PRIMARY KEY,
    resumeNum INT NOT NULL,
    internshipPeriod VARCHAR(50),
    internshipName VARCHAR(100),
    internshipDetails TEXT,
    startDate DATE,
    endDate DATE
);

CREATE TABLE UserCertificates (
    userCertificateNum INT AUTO_INCREMENT PRIMARY KEY,
    resumeNum INT NOT NULL,
    certificateNum INT NOT NULL,
    certificateDate DATE
);

CREATE TABLE UserTechStacks (
    userTechStackNum INT AUTO_INCREMENT PRIMARY KEY,
    resumeNum INT NOT NULL,
    techStackNum INT NOT NULL
);

CREATE TABLE Applications (
    applicationNum INT AUTO_INCREMENT PRIMARY KEY,
    applicationName VARCHAR(255) NOT NULL,
    companyId VARCHAR(50) NOT NULL,
    createdDate DATETIME DEFAULT CURRENT_TIMESTAMP,
    deadlineDate DATE NOT NULL,
    fileName VARCHAR(255),
    career VARCHAR(50),
    education VARCHAR(50),
    salary VARCHAR(50),
    workingArea VARCHAR(100),
    employmentType VARCHAR(50),
    roleId INT
);

CREATE TABLE CompanyTechStacks (
    companyTechStackNum INT AUTO_INCREMENT PRIMARY KEY,
    applicationNum INT NOT NULL,
    techStackNum INT NOT NULL
);

CREATE TABLE UserToCompanyBookmarks (
    bookmarkNum INT AUTO_INCREMENT PRIMARY KEY,
    userId VARCHAR(50) NOT NULL,
    companyId VARCHAR(50) NOT NULL,
    bookmarkDate DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE UserToApplicationBookmarks (
    bookmarkNum INT AUTO_INCREMENT PRIMARY KEY,
    userId VARCHAR(50) NOT NULL,
    applicationNum INT NOT NULL,
    bookmarkDate DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE ApplicationToResumeBookmarks (
    bookmarkNum INT AUTO_INCREMENT PRIMARY KEY,
    applicationNum INT NOT NULL,
    resumeNum INT NOT NULL,
    bookmarkDate DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE CompanyToResumeBookmarks (
    bookmarkNum INT AUTO_INCREMENT PRIMARY KEY,
    companyId VARCHAR(50) NOT NULL,
    resumeNum INT NOT NULL,
    bookmarkDate DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE ResumeApplyStatus (
    applyNum INT AUTO_INCREMENT PRIMARY KEY,
    applicationNum INT NOT NULL,
    resumeNum INT NOT NULL,
    applyDate DATETIME DEFAULT CURRENT_TIMESTAMP,
    applyStatus VARCHAR(50) NOT NULL
);

CREATE TABLE Ratings (
    ratingNum INT AUTO_INCREMENT PRIMARY KEY,
    companyId VARCHAR(50) NOT NULL,
    userId VARCHAR(50) NOT NULL,
    rating INT CHECK (rating BETWEEN 1 AND 5),
    review TEXT,
    createdDate DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE EmploymentHistory (
    historyNum INT AUTO_INCREMENT PRIMARY KEY,
    userId VARCHAR(50) NOT NULL,
    companyId VARCHAR(50) NOT NULL,
    startDate DATE NOT NULL,
    endDate DATE
);

CREATE TABLE Boards (
    boardNum INT AUTO_INCREMENT PRIMARY KEY,
    boardTitle VARCHAR(255) NOT NULL,
    boardContent TEXT NOT NULL,
    boardWriter VARCHAR(50) NOT NULL,
    fileName VARCHAR(255),
    views INT DEFAULT 0,
    createdDate DATETIME DEFAULT CURRENT_TIMESTAMP,
    modifyDate DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE Comments (
    commentNum INT AUTO_INCREMENT PRIMARY KEY,
    boardNum INT NOT NULL,
    commentContent TEXT NOT NULL,
    commentWriter VARCHAR(50) NOT NULL,
    createdDate DATETIME DEFAULT CURRENT_TIMESTAMP,
    modifyDate DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
