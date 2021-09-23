# 시작 전 정리하기
msa가 무엇이고 msa 구축을 위해 spring cloud와 kubernates가 왜 필요할까? <br>
모놀리식 아키텍처는 빠르고 다양하게 변하는 고객들의 요구조건에 맞추어 확정성 및 성능을 위한 신속한 대처가 어렵다. 보다 유연하고 작고 독립적으로 분산된 서비스들로 나눠야할 필요성이 증가했고 이를 위해 msa가 도입되었다. 
msa를 도입했을 때의 장점
1. 특정 서비스만 집중할 수 있고, 코드 규모가 작아 효율적인 유지보수가 가능
2. 독립적인 서비스 단위 확장 (scale-out)을 지원하기 떄문에 효울적인 시스템 자원 활용이 가능
3. 기술 부채의 빠른 청산 가능
4. 폴리글랏 프로그래밍 (ploy glot)

msa를 적용한 시스템이 커지면 마이크로서비스의 인스턴스 수가 증가함에 따라 시스템 런타임 복잡성 문제가 발생한다. 보안, 로드 밸런싱, 모니터링 과 같은 동적으로 수많은 마이크로서비스의 인스턴스간 통신이
유발하는 관심사들을 내부 네트워크에서 안정적으로 다루기 위해 새로운 기능들이 필요하다. 전체 서비스를 관리하기 위한 이러한 outer architecture를 <b>Service Mesh</b>라 한다. <br>
Service Mesh의 주요 기능
* Configuration Management
* Load Balancing
* API Gateway
* Resilience & Fault Tolerance
등이 있다.

