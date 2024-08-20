# SQL문 기초
https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_all

실습 사이트

# SELECT * FROM {테이블명}

- 테이블에서 가져온다! *는 모든 것
<img width="1034" alt="스크린샷 2024-08-18 오후 6 44 49" src="https://github.com/user-attachments/assets/d1a9a2a6-52a4-4b12-83e1-996892110062">
<img width="1043" alt="스크린샷 2024-08-18 오후 6 45 09" src="https://github.com/user-attachments/assets/621551f1-5eae-4531-8786-0e0ecbe52cec">

# JOIN {테이블명1} ON {테이블1.id = 테이블2.id}

- 두 가지 테이블을 합친다
    
    <img width="1043" alt="스크린샷 2024-08-18 오후 6 57 36" src="https://github.com/user-attachments/assets/0c516e47-b48e-4233-aca9-c33bc2967817">


# WHERE {조건문}

- 가져오는 풀 자체를 좁힌다

# GROUP BY

- 특정 컬럼(열)을 기준으로 그룹화
- 함께 쓰면 좋은 구문
    - HAVING: 특정 조건 적용
    - COUNT: 개수

# ORDER BY

- 특정 컬럼(열)을 기준으로 정렬
- 정렬 기준
    - ASC: 오름 차순
    - DESC: 내림 차순

# LIMIT BY {제한할 개수}

- 데이터의 결과 수를 제한
