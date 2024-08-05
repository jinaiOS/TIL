# 'execute(Params...)' is deprecated
# execute()

- AsyncTask를 실행함

# AsyncTask

- 비동기적인 작업을 손쉽게 해줌, 편리함
- 단점
    - 재사용 불가
    - 종료를 직접해주지 않으면 메모리 누수 발생
    - 항상 UI 쓰레드 상에서 호출해야 함
    - 메모리 릭
    - 순차 실행 → 속도 저하
    - Fragment에서 실행할 경우
        - 뒤로가기 키를 통해 액티비티를 종료하면 Fragment와 Activity가 분리되면 getContext(), getActivity() 등이 null 반환하게 되어 onPostExecute()에서 NullPointerException 발생
    - 취소 메소드만 있고, 예외처리 메소드 없음

# 대체 방법

# RxJava

# Corountine
