-- 사용자 생성
create user C##WEBDB IDENTIFIED by webdb;

-- COOECT, RESOURCE 권한 부여
grant connect, resource to c##WEBDB;

-- 테이블 스페이스 생성(12이상)
alter user c##WEBDB default tablespace users quota unlimited on users;

