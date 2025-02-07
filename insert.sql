-- [1] Users 테이블
INSERT INTO Users (userId, userPassword, userEmail, userName, userNickname, userSsn, userPhone, userAddress, userPostalCode, userRegistDate) VALUES
('user001', 'password123', 'user001@gmail.com', '김철수', '철수', '123456-1234567', '010-1234-5678', '서울특별시 강남구 테헤란로', 12345, NOW()),
('user002', 'password456', 'user002@gmail.com', '이영희', '영희', '987654-9876543', '010-9876-5432', '부산광역시 해운대구 해운대로', 54321, NOW()),
('user003', 'password789', 'user003@gmail.com', '박민수', '민수', '456789-4567890', '010-4567-8901', '대구광역시 수성구 신천대로', 67890, NOW());

-- [2] Companys 테이블
INSERT INTO Companys (companyId, companyPassword, companyName, companyEmail, businessRegistrationCertificate, companyAddress, companyPostalCode, companyTel, establishmentDate, webSite, ceo, employees, annualRevenue, companyRegistDate) VALUES
('comp001', 'compPass123', '삼성전자', 'contact@samsung.com', '123-45-67890', '서울특별시 서초구 서초대로', 12345, '02-1234-5678', '1969-01-13', 'https://www.samsung.com', '이재용', 100000, 1000000000, NOW()),
('comp002', 'compPass456', 'LG전자', 'contact@lg.com', '987-65-43210', '서울특별시 영등포구 여의대로', 54321, '02-9876-5432', '1958-01-15', 'https://www.lg.com', '구광모', 70000, 800000000, NOW()),
('comp003', 'compPass789', '네이버', 'contact@naver.com', '456-78-90123', '경기도 성남시 분당구 정자동', 13579, '031-4567-8901', '1999-06-02', 'https://www.naver.com', '최수연', 5000, 500000000, NOW());

-- [3] Certificates 테이블
INSERT INTO Certificates (certificateName, certificateBy) VALUES
('정보처리기사', '한국산업인력공단'),
('AWS Certified Solutions Architect', 'Amazon'),
('OCJP', 'Oracle');

-- [4] JobRoles 테이블
INSERT INTO JobRoles (roleName) VALUES
('프론트엔드 개발자'),
('백엔드 개발자'),
('데이터 엔지니어'),
('데이터 분석가'),
('프로덕트 매니저');

-- [5] TechStacks 테이블
INSERT INTO TechStacks (stackName) VALUES
('Java'),
('Python'),
('JavaScript'),
('React'),
('Spring');

-- [6] Resumes 테이블
INSERT INTO `Resumes` (userId, resumeTitle, resumePhone, resumeContent, portfolioName, personalPhotoName, education, school, address, roleId, militaryService, createdDate, updatedDate) VALUES
('user001', '프론트엔드 이력서 1', '010-1234-5678', '신입', 'portfolio1_1.pdf', 'photo1.png', '대학교 졸업 (학사)', '서울대학교', '서울특별시 강남구', 1, 'Completed', NOW(), NOW()),
('user001', '백엔드 이력서 2', '010-1234-5678', '경력 1년', 'portfolio1_2.pdf', 'photo2.jpg', '대학교 졸업 (학사)', '고려대학교', '서울특별시 송파구', 2, 'Completed', NOW(), NOW()),
('user001', '데이터 분석가 이력서 3', '010-1234-5678', '경력 2년', 'portfolio1_3.pdf', 'photo1.png', '대학원 졸업 (석사)', '연세대학교', '서울특별시 관악구', 4, 'Completed', NOW(), NOW()),
('user001', '데이터 엔지니어 이력서 4', '010-1234-5678', '경력 3년', 'portfolio1_4.pdf', 'photo2.jpg', '대학교 졸업 (학사)', '서울대학교', '서울특별시 은평구', 3, 'Completed', NOW(), NOW()),
('user001', 'AI 엔지니어 이력서 5', '010-1234-5678', '경력 5년', 'portfolio1_5.pdf', 'photo1.png', '대학원 졸업 (석사)', 'KAIST', '서울특별시 중구', 3, 'Completed', NOW(), NOW()),
('user001', '풀스택 개발자 이력서 6', '010-1234-5678', '경력 2년', 'portfolio1_6.pdf', 'photo2.jpg', '대학교 졸업 (학사)', '성균관대학교', '서울특별시 종로구', 2, 'Completed', NOW(), NOW()),
('user001', '프로덕트 매니저 이력서 7', '010-1234-5678', '경력 1년', 'portfolio1_7.pdf', 'photo1.png', '대학교 졸업 (학사)', '서강대학교', '서울특별시 노원구', 5, 'Completed', NOW(), NOW()),
('user001', '프론트엔드 이력서 8', '010-1234-5678', '경력 4년', 'portfolio1_8.pdf', 'photo2.jpg', '대학교 졸업 (학사)', '한양대학교', '서울특별시 강동구', 1, 'Completed', NOW(), NOW()),
('user001', '백엔드 이력서 9', '010-1234-5678', '경력 3년', 'portfolio1_9.pdf', 'photo1.png', '대학교 졸업 (학사)', '부산대학교', '부산광역시 해운대구', 2, 'Completed', NOW(), NOW()),
('user001', '데이터 분석가 이력서 10', '010-1234-5678', '경력 5년', 'portfolio1_10.pdf', 'photo2.jpg', '대학원 졸업 (석사)', '포항공과대학교', '경상북도 포항시', 4, 'Completed', NOW(), NOW()),
('user001', 'AI 연구원 이력서 11', '010-1234-5678', '경력 6년', 'portfolio1_11.pdf', 'photo1.png', '대학원 졸업 (석사)', 'KAIST', '대전광역시 유성구', 3, 'Completed', NOW(), NOW()),
('user001', '데이터 사이언티스트 이력서 12', '010-1234-5678', '경력 7년', 'portfolio1_12.pdf', 'photo2.jpg', '대학원 졸업 (박사)', '서울대학교', '서울특별시 중구', 4, 'Completed', NOW(), NOW()),
('user001', '프론트엔드 엔지니어 이력서 13', '010-1234-5678', '경력 2년', 'portfolio1_13.pdf', 'photo1.png', '대학교 졸업 (학사)', '성균관대학교', '서울특별시 서대문구', 1, 'Completed', NOW(), NOW()),
('user001', '풀스택 엔지니어 이력서 14', '010-1234-5678', '경력 3년', 'portfolio1_14.pdf', 'photo2.jpg', '대학교 졸업 (학사)', '한양대학교', '서울특별시 관악구', 2, 'Completed', NOW(), NOW()),
('user001', '프로덕트 디자이너 이력서 15', '010-1234-5678', '경력 5년', 'portfolio1_15.pdf', 'photo1.png', '대학교 졸업 (학사)', '서울대학교', '서울특별시 은평구', 5, 'Completed', NOW(), NOW()),
('user001', '백엔드 엔지니어 이력서 16', '010-1234-5678', '경력 4년', 'portfolio1_16.pdf', 'photo2.jpg', '대학교 졸업 (학사)', '고려대학교', '서울특별시 종로구', 2, 'Completed', NOW(), NOW()),
('user001', '프론트엔드 디자이너 이력서 17', '010-1234-5678', '경력 1년', 'portfolio1_17.pdf', 'photo1.png', '대학교 졸업 (학사)', '이화여자대학교', '서울특별시 강서구', 1, 'Completed', NOW(), NOW()),
('user001', '데브옵스 엔지니어 이력서 18', '010-1234-5678', '경력 3년', 'portfolio1_18.pdf', 'photo2.jpg', '대학교 졸업 (학사)', '중앙대학교', '서울특별시 동작구', 3, 'Completed', NOW(), NOW()),
('user001', '소프트웨어 엔지니어 이력서 19', '010-1234-5678', '경력 6년', 'portfolio1_19.pdf', 'photo1.png', '대학교 졸업 (학사)', '홍익대학교', '서울특별시 송파구', 2, 'Completed', NOW(), NOW()),
('user001', 'UI/UX 디자이너 이력서 20', '010-1234-5678', '경력 4년', 'portfolio1_20.pdf', 'photo2.jpg', '대학교 졸업 (학사)', '서울과학기술대학교', '서울특별시 강남구', 5, 'Completed', NOW(), NOW());

-- [7] Careers 테이블
INSERT INTO Careers (resumeNum, career, careerName) VALUES
(1, '6개월', '삼성전자');

-- [8] Internships 테이블
INSERT INTO Internships (resumeNum, internshipPeriod, internshipName, internshipDetails, startDate, endDate) VALUES
(1, '3개월', 'LG전자', '프론트엔드 개발 참여', '2021-01-01', '2021-03-31');

-- [9] UserCertificates 테이블
INSERT INTO UserCertificates (resumeNum, certificateNum, certificateDate) VALUES
(1, 1, '2020-12-01');

-- [10] UserTechStacks 테이블
INSERT INTO UserTechStacks (resumeNum, techStackNum) VALUES
(1, 3);

-- [11] Applications 테이블
INSERT INTO Applications (applicationName, companyId, createdDate, deadlineDate, fileName, career, education, salary, workingArea, employmentType, roleId) VALUES
('프론트엔드 개발자 모집', 'comp001', NOW(), DATE_ADD(NOW(), INTERVAL 30 DAY), 'frontend.pdf', '6개월', '학사', '4000만 이하', '서울', '정규직', 1),
('백엔드 개발자 모집', 'comp002', NOW(), DATE_ADD(NOW(), INTERVAL 20 DAY), 'backend.pdf', '1년', '석사', '6000만 이하', '부산', '정규직', 2);

-- [12] CompanyTechStacks 테이블
INSERT INTO CompanyTechStacks (applicationNum, techStackNum) VALUES
(1, 3),
(2, 2);

-- [13] UserToCompanyBookmarks 테이블
INSERT INTO UserToCompanyBookmarks (userId, companyId, bookmarkDate) VALUES
('user001', 'comp001', NOW());

-- [14] UserToApplicationBookmarks 테이블
INSERT INTO UserToApplicationBookmarks (userId, applicationNum, bookmarkDate) VALUES
('user001', 1, NOW());

-- [15] ApplicationToResumeBookmarks 테이블
INSERT INTO ApplicationToResumeBookmarks (applicationNum, resumeNum, bookmarkDate) VALUES
(1, 1, NOW());

-- [16] CompanyToResumeBookmarks 테이블
INSERT INTO CompanyToResumeBookmarks (companyId, resumeNum, bookmarkDate) VALUES
('comp001', 1, NOW());

-- [17] ResumeApplyStatus 테이블
INSERT INTO ResumeApplyStatus (applicationNum, resumeNum, applyDate, applyStatus) VALUES
(1, 1, NOW(), 'Progress');

-- [18] Ratings 테이블
INSERT INTO Ratings (companyId, userId, rating, review, createdDate) VALUES
('comp001', 'user001', 5, '좋은 회사입니다.', NOW());

-- [19] EmploymentHistory 테이블
INSERT INTO EmploymentHistory (userId, companyId, startDate, endDate) VALUES
('user001', 'comp001', '2020-01-01', '2022-12-31');

-- [20] Boards 테이블
INSERT INTO Boards (boardTitle, boardContent, boardWriter, fileName, views, createdDate, modifyDate) VALUES
('공지사항', '공지사항 내용입니다.', 'user001', 'notice.pdf', 100, NOW(), NOW());

-- [21] Comments 테이블
INSERT INTO Comments (boardNum, commentContent, commentWriter, createdDate, modifyDate) VALUES
(1, '공지 잘 읽었습니다.', 'user002', NOW(), NOW());


INSERT INTO Companys (companyId, companyPassword, companyName, companyEmail, businessRegistrationCertificate, companyAddress, companyPostalCode, companyTel, establishmentDate, webSite, ceo, employees, annualRevenue, companyRegistDate) VALUES
('comp004', 'compPass789', '카카오', 'contact@kakao.com', '654-78-91234', '제주특별자치도 제주시 첨단로', 78912, '064-1234-5678', '2010-01-20', 'https://www.kakao.com', '홍은택', 15000, 400000000, NOW()),
('comp005', 'compPass234', '현대자동차', 'contact@hyundai.com', '234-56-78901', '울산광역시 남구 두왕로', 89012, '052-1234-5678', '1967-01-20', 'https://www.hyundai.com', '정의선', 50000, 1000000000, NOW());

INSERT INTO Applications (applicationName, companyId, createdDate, deadlineDate, fileName, career, education, salary, workingArea, employmentType, roleId) VALUES
-- 삼성전자 공고
('프론트엔드 개발자 모집', 'comp001', NOW(), DATE_ADD(NOW(), INTERVAL 30 DAY), 'frontend1.pdf', '6개월', '학사', '4000만 이하', '서울', '정규직', 1),
('백엔드 개발자 모집', 'comp001', NOW(), DATE_ADD(NOW(), INTERVAL 45 DAY), 'backend1.pdf', '2년', '석사', '6000만 이하', '서울', '정규직', 2),
('풀스택 개발자 모집', 'comp001', NOW(), DATE_ADD(NOW(), INTERVAL 25 DAY), 'fullstack1.pdf', '3년', '학사', '8000만 이하', '경기', '정규직', 2),

-- LG전자 공고
('데이터 엔지니어 모집', 'comp002', NOW(), DATE_ADD(NOW(), INTERVAL 20 DAY), 'dataeng1.pdf', '1년', '학사', '5000만 이하', '부산', '정규직', 3),
('데이터 분석가 모집', 'comp002', NOW(), DATE_ADD(NOW(), INTERVAL 30 DAY), 'dataanalyst1.pdf', '4년', '학사', '6000만 이하', '부산', '정규직', 4),
('AI 엔지니어 모집', 'comp002', NOW(), DATE_ADD(NOW(), INTERVAL 35 DAY), 'ai1.pdf', '5년 이상', '석사', '7000만 이하', '서울', '정규직', 3),

-- 네이버 공고
('프론트엔드 엔지니어 모집', 'comp003', NOW(), DATE_ADD(NOW(), INTERVAL 40 DAY), 'frontend2.pdf', '1년', '학사', '4800만 이하', '경기', '정규직', 1),
('백엔드 엔지니어 모집', 'comp003', NOW(), DATE_ADD(NOW(), INTERVAL 20 DAY), 'backend2.pdf', '2년', '석사', '5500만 이하', '서울', '정규직', 2),
('데이터 과학자 모집', 'comp003', NOW(), DATE_ADD(NOW(), INTERVAL 50 DAY), 'datascientist1.pdf', '5년 이상', '박사', '9000만 이하', '부산', '정규직', 4),

-- 카카오 공고
('클라우드 엔지니어 모집', 'comp004', NOW(), DATE_ADD(NOW(), INTERVAL 15 DAY), 'cloud1.pdf', '2년', '석사', '8000만 이하', '서울', '정규직', 3),
('UI/UX 디자이너 모집', 'comp004', NOW(), DATE_ADD(NOW(), INTERVAL 20 DAY), 'uiux1.pdf', '1년', '준학사', '3500만 이하', '제주', '계약직', 5),
('모바일 앱 개발자 모집', 'comp004', NOW(), DATE_ADD(NOW(), INTERVAL 25 DAY), 'mobile1.pdf', '3년', '학사', '5000만 이하', '대구', '정규직', 1),

-- 현대자동차 공고
('자동차 소프트웨어 개발자 모집', 'comp005', NOW(), DATE_ADD(NOW(), INTERVAL 30 DAY), 'autosw1.pdf', '4년', '학사', '6500만 이하', '울산', '정규직', 2),
('임베디드 소프트웨어 엔지니어 모집', 'comp005', NOW(), DATE_ADD(NOW(), INTERVAL 20 DAY), 'embedded1.pdf', '2년', '석사', '7000만 이하', '서울', '정규직', 3),
('자율주행 소프트웨어 엔지니어 모집', 'comp005', NOW(), DATE_ADD(NOW(), INTERVAL 40 DAY), 'autonomous1.pdf', '5년 이상', '박사', '10000만 이하', '부산', '정규직', 4),

-- 추가 공고
('DevOps 엔지니어 모집', 'comp002', NOW(), DATE_ADD(NOW(), INTERVAL 20 DAY), 'devops1.pdf', '3년', '학사', '7500만 이하', '서울', '정규직', 3),
('게임 개발자 모집', 'comp003', NOW(), DATE_ADD(NOW(), INTERVAL 15 DAY), 'gamedev1.pdf', '5년 이상', '석사', '8500만 이하', '경기', '정규직', 5),
('로봇 소프트웨어 엔지니어 모집', 'comp001', NOW(), DATE_ADD(NOW(), INTERVAL 30 DAY), 'robot1.pdf', '1년', '학사', '5000만 이하', '대구', '정규직', 3),
('QA 엔지니어 모집', 'comp005', NOW(), DATE_ADD(NOW(), INTERVAL 10 DAY), 'qa1.pdf', '6개월', '학사', '4000만 이하', '경남', '정규직', 4),
('프론트엔드 엔지니어 (React) 모집', 'comp004', NOW(), DATE_ADD(NOW(), INTERVAL 15 DAY), 'reactfrontend1.pdf', '2년', '학사', '5500만 이하', '인천', '정규직', 1);

INSERT INTO Companys (companyId, companyPassword, companyName, companyEmail, businessRegistrationCertificate, companyAddress, companyPostalCode, companyTel, establishmentDate, webSite, ceo, employees, annualRevenue, companyRegistDate) 
VALUES
('comp006', 'compPass001', 'SK텔레콤', 'contact@skt.com', '345-67-89012', '서울특별시 중구 을지로', 12346, '02-1234-5444', '1984-03-29', 'https://www.sktelecom.com', '유영상', 5000, 1700000000, NOW()),
('comp007', 'compPass002', '두산중공업', 'contact@doosan.com', '789-01-23456', '경상남도 창원시 성산구 두산볼보로', 67890, '055-3456-7890', '1962-09-20', 'https://www.doosan.com', '박지원', 7000, 950000000, NOW()),
('comp008', 'compPass003', '한화솔루션', 'contact@hanwha.com', '123-45-67891', '서울특별시 중구 청계천로', 04520, '02-729-1144', '1965-01-09', 'https://www.hanwha.com', '김동관', 12000, 180000000, NOW()),
('comp009', 'compPass004', 'GS칼텍스', 'contact@gscaltex.com', '234-56-78902', '서울특별시 강남구 논현로', 06211, '02-1899-5144', '1967-05-19', 'https://www.gscaltex.com', '허세홍', 3000, 750000000, NOW()),
('comp010', 'compPass005', '현대모비스', 'contact@mobis.co.kr', '345-67-89013', '서울특별시 강남구 테헤란로', 06141, '02-2018-5114', '1977-07-01', 'https://www.mobis.co.kr', '조성환', 30000, 500000000, NOW()),
('comp011', 'compPass006', '셀트리온', 'contact@celltrion.com', '456-78-90124', '인천광역시 연수구 송도미래로', 21987, '032-850-5000', '2002-02-01', 'https://www.celltrion.com', '기우성', 2500, 200000000, NOW()),
('comp012', 'compPass007', '아모레퍼시픽', 'contact@amorepacific.com', '567-89-01234', '서울특별시 용산구 한강대로', 04386, '02-709-5114', '1945-09-05', 'https://www.amorepacific.com', '서경배', 3500, 550000000, NOW()),
('comp013', 'compPass008', '코웨이', 'contact@coway.com', '678-90-12345', '서울특별시 구로구 디지털로', 08380, '02-1588-5200', '1989-05-02', 'https://www.coway.co.kr', '서장원', 2000, 320000000, NOW()),
('comp014', 'compPass009', '한국전력공사', 'contact@kepco.co.kr', '789-01-23457', '전라남도 나주시 빛가람로', 58217, '061-345-0114', '1961-07-01', 'https://www.kepco.co.kr', '정승일', 23000, 600000000, NOW()),
('comp015', 'compPass010', 'S-OIL', 'contact@s-oil.com', '890-12-34568', '서울특별시 마포구 공덕동', 04146, '02-3772-5100', '1976-01-31', 'https://www.s-oil.com', '안와르 알-헤즈', 3000, 730000000, NOW()),
('comp016', 'compPass011', '삼성물산', 'contact@samsungcnt.com', '901-23-45678', '서울특별시 강동구 올림픽로', 05510, '02-2145-2114', '1938-12-01', 'https://www.samsungcnt.com', '오세철', 13000, 900000000, NOW()),
('comp017', 'compPass012', '현대건설', 'contact@hdec.co.kr', '012-34-56789', '서울특별시 종로구 율곡로', 03182, '02-746-1114', '1947-05-25', 'https://www.hdec.co.kr', '윤영준', 11000, 670000000, NOW()),
('comp018', 'compPass013', 'KT', 'contact@kt.com', '123-45-67892', '서울특별시 종로구 광화문로', 03154, '02-1588-8448', '1981-12-10', 'https://www.kt.com', '김영섭', 23000, 1500000000, NOW()),
('comp019', 'compPass014', '빙그레', 'contact@bing.co.kr', '234-56-78903', '경기도 남양주시 경춘로', 12205, '031-510-5114', '1967-11-15', 'https://www.bing.co.kr', '이장훈', 1500, 160000000, NOW()),
('comp020', 'compPass015', '오뚜기', 'contact@ottogi.co.kr', '345-67-89014', '경기도 안양시 동안구 평촌대로', 14030, '031-460-5000', '1969-05-03', 'https://www.ottogi.co.kr', '함영준', 2800, 300000000, NOW());


INSERT INTO Boards (boardTitle, boardContent, boardWriter, fileName, views, createdDate, modifyDate) VALUES
('공지사항 1', '공지사항 내용입니다. 첫 번째 게시글입니다.', 'user001', 'notice1.pdf', 100, NOW(), NOW()),
('공지사항 2', '공지사항 내용입니다. 두 번째 게시글입니다.', 'user002', 'notice2.pdf', 150, NOW(), NOW()),
('공지사항 3', '공지사항 내용입니다. 세 번째 게시글입니다.', 'user003', 'notice3.pdf', 120, NOW(), NOW()),
('공지사항 4', '공지사항 내용입니다. 네 번째 게시글입니다.', 'user004', 'notice4.pdf', 200, NOW(), NOW()),
('공지사항 5', '공지사항 내용입니다. 다섯 번째 게시글입니다.', 'user005', 'notice5.pdf', 130, NOW(), NOW()),
('공지사항 6', '공지사항 내용입니다. 여섯 번째 게시글입니다.', 'user006', 'notice6.pdf', 110, NOW(), NOW()),
('공지사항 7', '공지사항 내용입니다. 일곱 번째 게시글입니다.', 'user007', 'notice7.pdf', 160, NOW(), NOW()),
('공지사항 8', '공지사항 내용입니다. 여덟 번째 게시글입니다.', 'user008', 'notice8.pdf', 170, NOW(), NOW()),
('공지사항 9', '공지사항 내용입니다. 아홉 번째 게시글입니다.', 'user009', 'notice9.pdf', 90, NOW(), NOW()),
('공지사항 10', '공지사항 내용입니다. 열 번째 게시글입니다.', 'user010', 'notice10.pdf', 180, NOW(), NOW()),
('공지사항 11', '공지사항 내용입니다. 열한 번째 게시글입니다.', 'user011', 'notice11.pdf', 140, NOW(), NOW()),
('공지사항 12', '공지사항 내용입니다. 열두 번째 게시글입니다.', 'user012', 'notice12.pdf', 150, NOW(), NOW()),
('공지사항 13', '공지사항 내용입니다. 열세 번째 게시글입니다.', 'user013', 'notice13.pdf', 110, NOW(), NOW()),
('공지사항 14', '공지사항 내용입니다. 열네 번째 게시글입니다.', 'user014', 'notice14.pdf', 100, NOW(), NOW()),
('공지사항 15', '공지사항 내용입니다. 열다섯 번째 게시글입니다.', 'user015', 'notice15.pdf', 130, NOW(), NOW()),
('공지사항 16', '공지사항 내용입니다. 열여섯 번째 게시글입니다.', 'user016', 'notice16.pdf', 160, NOW(), NOW()),
('공지사항 17', '공지사항 내용입니다. 열일곱 번째 게시글입니다.', 'user017', 'notice17.pdf', 170, NOW(), NOW()),
('공지사항 18', '공지사항 내용입니다. 열여덟 번째 게시글입니다.', 'user018', 'notice18.pdf', 180, NOW(), NOW()),
('공지사항 19', '공지사항 내용입니다. 열아홉 번째 게시글입니다.', 'user019', 'notice19.pdf', 200, NOW(), NOW()),
('공지사항 20', '공지사항 내용입니다. 스무 번째 게시글입니다.', 'user020', 'notice20.pdf', 220, NOW(), NOW()),
('공지사항 21', '공지사항 내용입니다. 스물 한 번째 게시글입니다.', 'user021', 'notice21.pdf', 230, NOW(), NOW()),
('공지사항 22', '공지사항 내용입니다. 스물 두 번째 게시글입니다.', 'user022', 'notice22.pdf', 240, NOW(), NOW()),
('공지사항 23', '공지사항 내용입니다. 스물 세 번째 게시글입니다.', 'user023', 'notice23.pdf', 250, NOW(), NOW()),
('공지사항 24', '공지사항 내용입니다. 스물 네 번째 게시글입니다.', 'user024', 'notice24.pdf', 260, NOW(), NOW()),
('공지사항 25', '공지사항 내용입니다. 스물 다섯 번째 게시글입니다.', 'user025', 'notice25.pdf', 270, NOW(), NOW()),
('공지사항 26', '공지사항 내용입니다. 스물 여섯 번째 게시글입니다.', 'user026', 'notice26.pdf', 280, NOW(), NOW()),
('공지사항 27', '공지사항 내용입니다. 스물 일곱 번째 게시글입니다.', 'user027', 'notice27.pdf', 290, NOW(), NOW()),
('공지사항 28', '공지사항 내용입니다. 스물 여덟 번째 게시글입니다.', 'user028', 'notice28.pdf', 300, NOW(), NOW()),
('공지사항 29', '공지사항 내용입니다. 스물 아홉 번째 게시글입니다.', 'user029', 'notice29.pdf', 310, NOW(), NOW()),
('공지사항 30', '공지사항 내용입니다. 서른 번째 게시글입니다.', 'user030', 'notice30.pdf', 320, NOW(), NOW());





