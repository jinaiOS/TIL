# PyMongo
Python에서 MongoDB 데이터베이스와 상호작용할 수 있도록 도와주는 라이브러리

# 주요 기능

1. 데이터베이스 연결
2. CRUD 작업
3. 쿼리
4. 인덱스 관리
5. 데이터 모델링

```bash
pip install pymongo
```

```python
from pymongo import MongoClient

# MongoDB 서버에 연결
client = MongoClient('mongodb://localhost:27017/')

# 데이터베이스 선택
db = client['mydatabase']

# 컬렉션 선택
collection = db['mycollection']

# 데이터 삽입
data = {"name": "Alice", "age": 25}
collection.insert_one(data)

# 데이터 조회
result = collection.find_one({"name": "Alice"})
print(result)

# 데이터 업데이트
collection.update_one({"name": "Alice"}, {"$set": {"age": 26}})

# 데이터 삭제
collection.delete_one({"name": "Alice"})
```
