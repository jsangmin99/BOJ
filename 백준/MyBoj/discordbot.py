import discord
import asyncio
from datetime import datetime, time

# 디스코드 클라이언트 인스턴스 생성
client = discord.Client()

# 봇이 준비되었을 때 실행할 이벤트 핸들러
@client.event
async def on_ready():
    print(f'We have logged in as {client.user}')
    client.loop.create_task(send_message_at_times())

# 특정 요일과 시간에 메시지를 보내는 비동기 함수
async def send_message_at_times():
    channel_id =   # 메시지를 보낼 채널의 ID
    weekday_times = [time(hour, 50, 0) for hour in range(9, 18)] 
    wednesday_extra_time = time(9, 21, 0)  # 수요일 추가 시간
    channel = client.get_channel(channel_id)

    while True:
        now = datetime.now()
        current_time = now.time()
        current_day = now.weekday()

        # 월화수목금 (0-4)에 대한 시간 체크
        if current_day in range(5):
            for target_time in weekday_times:
                if current_time.hour == target_time.hour and current_time.minute == target_time.minute:
                    await channel.send(f"지정된 시간 {target_time}이(가) 되었습니다!")
                    await asyncio.sleep(60)  # 1분 대기 후 다시 확인

        # 수요일(2)에 대한 추가 시간 체크
        if current_day == 4 and current_time.hour == wednesday_extra_time.hour and current_time.minute == wednesday_extra_time.minute:
            await channel.send(f"지정된 시간 {wednesday_extra_time}이(가) 되었습니다!")
            await asyncio.sleep(60)  # 1분 대기 후 다시 확인

        await asyncio.sleep(30)  # 30초 대기 후 다시 확인

# 봇 실행
client.run('[토큰 값]')
