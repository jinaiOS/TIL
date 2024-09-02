# ARKit 증강현실
- 카메라를 통해 라이브뷰에 2D 또는 3D 요소를 추가하여 실제 세계에 있는 것처럼 보이게 하는 사용자 경험
- 현실 세계에서 가상의 물체를 집어넣어 마치 현실과 가상현실이 병합하게 만드는 것

## RealityKit (3D 기반)

- 다중 스레드 렌더링 수행

## SceneKit (3D 기반)

- 3D 애니메이션 장면 및 효과를 만드는데 도움이 되는 고급 3D 그래픽 프레임워크
- 3D assets의 가져오기, 조작 및 렌더링을 위한 설명 API와 고성능 렌더링 엔진 결합

## SpriteKit (2D 기반)

- 고성능의 배터리 효율적인 2D 게임을 쉽게 만들 수 있음

## Metal

- ARKit의 모든 프레임워크인 RealityKit, SceneKit, SpriteKit은 Metal을 base로 하여 만들어져 있음
- CoreML, Vision, AVFoundation 등에서도 사용됨
- 단 하나의 API로 OpenGL 및 OpenCL과 유사한 기능 (GPU 가속 그래픽 API)
- 하드웨어를 한계까지 끌어올려 게임이나 그래픽 작동을 완벽하게 제어
- 대규모 데이터 세트를 분석하고 처리하는 과학 연구 앱 등에서 사용
