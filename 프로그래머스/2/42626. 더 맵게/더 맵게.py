import heapq
def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville)  
    
    while len(scoville) >= 2 and scoville[0] < K:
        first_min = heapq.heappop(scoville)
        second_min = heapq.heappop(scoville)
        new_scoville = first_min + (second_min * 2)
        heapq.heappush(scoville, new_scoville)
        answer += 1
    
    if scoville[0] < K:
        return -1
    return answer