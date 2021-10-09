# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 구현할 기능 목록
- car : { 이름, 이동 거리 }
  - 이름 길이 검증
  - 이동
- car factory
  - 이름 리스트를 주면 자동차 리스트 반환
- winning cars
  - 자동차 중 이동 거리 최대값 구하기
  - 특정 이동 거리를 갖는 자동차 리스트
  - 우승차 이름 리스트
- racing
  - 자동차별 움직임
  - 시도 횟수만큼 자동차들을 움직여 winning cars 반환
- view
  - input
    - 자동차 이름 리스트 (','구분, 5자 이하)
    - 시도 횟수
  - output
    - 전진하는 자동차
    - 우승차 이름 리스트 (','구분)
    - 오류
- game 
  - 게임 시작
  - 입력 실패 시 재시도

