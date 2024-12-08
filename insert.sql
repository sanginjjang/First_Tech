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




-- [6] Resumes 테이블
-- [6] Resumes 테이블
INSERT INTO `Resumes` (userId, resumeTitle, resumePhone, resumeContent, portfolioName, personalPhotoName, education, school, address, roleId, militaryService, createdDate, updatedDate) VALUES
('user001', '프론트엔드 이력서 1', '010-1234-5678', '신입', 'portfolio1_1.pdf', 'photo1_1.jpg', '대학교 졸업 (학사)', '서울대학교', '서울특별시 강남구', 1, 'Completed', NOW(), NOW()),
('user001', '백엔드 이력서 2', '010-1234-5678', '경력 1년', 'portfolio1_2.pdf', 'photo1_2.jpg', '대학교 졸업 (학사)', '고려대학교', '서울특별시 송파구', 2, 'Completed', NOW(), NOW()),
('user001', '데이터 분석가 이력서 3', '010-1234-5678', '경력 2년', 'portfolio1_3.pdf', 'photo1_3.jpg', '대학원 졸업 (석사)', '연세대학교', '서울특별시 관악구', 4, 'Completed', NOW(), NOW()),
('user001', '데이터 엔지니어 이력서 4', '010-1234-5678', '경력 3년', 'portfolio1_4.pdf', 'photo1_4.jpg', '대학교 졸업 (학사)', '서울대학교', '서울특별시 은평구', 3, 'Completed', NOW(), NOW()),
('user001', 'AI 엔지니어 이력서 5', '010-1234-5678', '경력 5년', 'portfolio1_5.pdf', 'photo1_5.jpg', '대학원 졸업 (석사)', 'KAIST', '서울특별시 중구', 3, 'Completed', NOW(), NOW()),
('user001', '풀스택 개발자 이력서 6', '010-1234-5678', '경력 2년', 'portfolio1_6.pdf', 'photo1_6.jpg', '대학교 졸업 (학사)', '성균관대학교', '서울특별시 종로구', 2, 'Completed', NOW(), NOW()),
('user001', '프로덕트 매니저 이력서 7', '010-1234-5678', '경력 1년', 'portfolio1_7.pdf', 'photo1_7.jpg', '대학교 졸업 (학사)', '서강대학교', '서울특별시 노원구', 5, 'Completed', NOW(), NOW()),
('user001', '프론트엔드 이력서 8', '010-1234-5678', '경력 4년', 'portfolio1_8.pdf', 'photo1_8.jpg', '대학교 졸업 (학사)', '한양대학교', '서울특별시 강동구', 1, 'Completed', NOW(), NOW()),
('user001', '백엔드 이력서 9', '010-1234-5678', '경력 3년', 'portfolio1_9.pdf', 'photo1_9.jpg', '대학교 졸업 (학사)', '부산대학교', '부산광역시 해운대구', 2, 'Completed', NOW(), NOW()),
('user001', '데이터 분석가 이력서 10', '010-1234-5678', '경력 5년', 'portfolio1_10.pdf', 'photo1_10.jpg', '대학원 졸업 (석사)', '포항공과대학교', '경상북도 포항시', 4, 'Completed', NOW(), NOW());
