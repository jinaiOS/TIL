# Alamofire
## URLSession 기반으로 작동하며 URLSession을 Wrapping한 라이브러리
## Swift 기반 HTTP 네트워킹 라이브러리로 Apple의 Foundation networking 기반으로 인터페이스를 제공하여 일반적인 네트워킹 작업을 단순화

Session을 커스텀할 때 URLSessionConfiguration.af.default instance로 시작하는걸 추천한다. 이는 헤더에 기본값들을 설정되어있는데, 기본값 설정된 헤더는 Accept-Encoding, Accept-Language, User-Agent이다. 기본값 없이 URLSessionConfiguration을 사용하는 것도 물론 가능하다.
Authorization이나 Content-Type의 헤더는 URLSessionConfiguration에서 설정하는걸 추천하지 않는다. ParameterEncoders 혹은 ReqeustAdapter를 사용해서 Reqeust에 추가하길 바란다.



