# TIL
## Today I Learned!

## 데이터 베이스
[Firebase Cloud FireStore](https://www.notion.so/Firebase-Cloud-FireStore-250bbc178fdb4f5ebf788a2aaa1dadf0?pvs=21)

[API](https://www.notion.so/API-b13a9f6d89a54d92908af6326bcd8a0c?pvs=21)

![스크린샷 2023-08-22 오후 4.59.49.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e9d76b96-aed7-4ba6-971f-be06e8fc6a95/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7_2023-08-22_%EC%98%A4%ED%9B%84_4.59.49.png)

데이터의 관리에 특화된 프로그램들

- 중복 제어: 동일한 데이터가 여러 위치에 중복 저장되는 현상을 방지한다. 데이터가 중복되면, 저장 공간이 낭비되고 데이터의 일관성이 깨질 수 있다.
- 접근 통제: DBMS는 사용자마다 다양한 권한을 부여할 수 있으며, 권한에 따라 데이터에 대한 접근을 제어할 수 있다.
- 인터페이스 제공 : DBMS는 사용자에게 SQL 및 CLI, GUI 등 다양한 인터페이스를 제공한다.
- 관계 표현: 서로 다른 데이터간의 다양한 관계를 표현할 수 있는 기능을 제공한다.
    - 샤딩/파티셔닝: 구조 최적화를 위해 작은 단위로 쪼개는 기능을 제공한다.
- 무결성 제약 조건: 무결성에 관한 제약 조건을 정의/검사하는 기능을 제공한다. 데이터베이스는 반드시 무결성 제약조건을 통과한 데이터만을 저장하고 있어야 한다.
- 백업

• **SQL(Structured Query Language)란?** 구조화된 질의 언어라는 뜻으로 관계형 데이터베이스에서 사용되는 언어. 표준 SQL을 배우면 대부분의 DBMS를 사용할 수 있음.

![스크린샷 2023-08-22 오후 4.59.27.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bcaf13c1-1f67-4f1e-a401-0a720e6abad0/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7_2023-08-22_%EC%98%A4%ED%9B%84_4.59.27.png)

**데이터베이스(DataBase)**

데이터베이스는 전자적으로 저장되고 사용되는 **관련있는 데이터**들의 **조직화된 집합**입니다.

하나 하나 알아보자!

**관련 있는 데이터**란 sns 상에서 사진을 올리고 댓글을 달고 또, 로그인을 위해 개인 정보를 입력하는 등의 데이터를 말합니다.

**조직화된 집합**이란 엄청나게 책이 무작위로 많이 쌓여 있으면 찾고 싶은 책을 찾기 힘들겠죠? 이를 조직화하여 원하는 걸 꺼낼 수 있게 되는 것을 말합니다.

이 데이터를 관리하는 시스템들을 DBMS(database management systems) 이라고 합니다.

대표적인 예로는 PostqreSQL, MySQL, Oragcle DataBase, Microsoft SQL Server 등이 있습니다.

데이터베이스를 사용하다 보면 추가적인 데이터가 생길 수 있는데 이를 metadata이라고 합니다. catalog라고도 부릅니다.

예를 들어 사진의 해상도, 날짜 등이 있습니다.

Metadata 또한 DBMS를 통해 저장/관리됩니다.

Database system는 database + DBMS + 연관된 applications, 줄여서 database라고도 말하기에 문맥으로 구분해야 합니다.

Data models 데이터 베이스를 추상화해서 표현할 수 있는 수단을 제공합니다.

Conceptual data models 일반 사용자들이 쉽게 이해할 수 있는 개념들로 이루어진 모델, 추상화 수준이 가장 높음, 비즈니스 요구 사항을 추상화하여 기술할 때 사용합니다.

대표적으로 entity-relationship model

Logical data models 이해하기 어렵지 않으면서도 디테일하게 DB를 구조화 할 수 있는 개념들을 제공합니다. 데이터가 컴퓨터에 저장될 때의 구조와 크게 다르지 않게 DB 구조화를 가능하게 합니다. 특정 DBMS나 storage에 종속되지 않는 수준에서 DB를 구조화할 수 있는 모델입니다.

대표적으로 relation data model - 유명한 dbms는 거의 사용

Physical data models 컴퓨터에 데이터가 어떻게 파일 형태로 저장되는지를 기술할 수 있는 수단을 제공합니다. Data format, data orderings, access path 등등

Access path: 데이터 검색을 빠르게 하기 위한 구조체

Database schema data model을 바탕으로 database의 구조를기술(description)한 것

schema는 database를 설계할 때 정해지며 한 번 정해진 후에는 자주 바뀌지 않는다

Database state 특정 시점에 database에 있는 데이터를 database state 혹은 snapshot이라고도 합니다.

혹은 데이터베이스에 있는 현재 인스턴스의 집합이라고도 합니다.

Three-schema architecture database system을 구축하는 architecture 중 하나, user application으로부터 물리적인 데이터베이스를 분리시키는 목적, 세 가지 level이 존재하며 각각의 level 마다 schema가 정의되어 있습니다.

External schemas at external level

Conceptual schemas at conceptual level

Internal schemas at internal level

Internal chema

물리적으로 데이터가 어떻게 저장되는지 physical data model을 통해 표현합니다. Data storage, data structure, access path 등등 실체가 있는 내용을 기술합니다.

External schema = external views, user views

특정 유저들이 필요로 하는 데이터만 표현

그 외 알려줄 필요가 없는 데이터는 숨김

Logical data model을 통해 표현

Conceptual schema

전체 database에 대한 구조를 기술

물리적인 저장 구조에 관한 내용은 숨김

Entities, data types, relationships, user operations, constraints에 집중

Logical data model을 통해 기술

Data definition language(DDL)

Conceptual schema를 정의하기 위해 사용되는 언어

Storage definition language(SDL)

파라미터 등의 설정을 통해 대체됨

View definition language(VDL)

DDL이 VDL 역할까지 수행

Data manipulation language(DML)

통합된 언어로 존재 - relation database language: SQL
