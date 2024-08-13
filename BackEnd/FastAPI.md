# FastAPI
- 파이썬 프레임워크

[FastAPI - FastAPI](https://fastapi.tiangolo.com/ko/)

- 빠르고 간편
- 비동기 지원
- 문서화 자동으로 해줌

# 적용 방법

```python
from fastapi import FastAPI

app = FastAPI()

@app.get("/hello")
def sayHello():
    return {"message": "안녕하세요!"}
```

```python
pip install uvicorn[standard]

uvicorn main:pop --reload
```

- [localhost](http://localhost) 주소 뒤에 docs 를 붙이면 문서화된 swagger가 나옴
