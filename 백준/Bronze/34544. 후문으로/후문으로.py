def calculate_floor_difference(from_floor, to_floor):
    """
    한국식 층수 체계에서 두 층 사이의 차이를 계산
    0층이 존재하지 않으므로 -1층과 1층 사이는 1층 차이
    """
    diff = to_floor - from_floor
    
    # 0층을 지나가는 경우 보정
    if from_floor < 0 < to_floor:
        # 지하에서 지상으로: 0층이 없으므로 1을 빼줌
        diff -= 1
    elif from_floor > 0 > to_floor:
        # 지상에서 지하로: 0층이 없으므로 1을 더해줌
        diff += 1
    
    return diff


def add_to_relative_floor(current_floor, change):
    """
    상대적 층수에 변화량을 더함 (한국식 층수 체계 적용)
    """
    result = current_floor + change
    
    # 상대적 층수도 0층이 없으므로 보정
    if current_floor > 0 and result <= 0:
        result -= 1
    elif current_floor < 0 and result >= 0:
        result += 1
    
    return result


# 입력 받기
N = int(input())

# 정문에서 시작 (상대적 1층)
current_floor = 1

# N개의 건물 방문
for _ in range(N):
    A, B = map(int, input().split())
    # A층에서 B층으로 이동한 만큼 상대적 층수 변화
    floor_change = calculate_floor_difference(A, B)
    current_floor = add_to_relative_floor(current_floor, floor_change)

# 결과 출력
print(current_floor)