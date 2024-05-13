# Firestore 배열 내용 수정하기
```swift
db.document("").collection("").document("").updateData(["": FieldValue.arrayUnion([""])])
db.document("").collection("").document("").updateData(["": FieldValue.arrayRemove([""])])
```
