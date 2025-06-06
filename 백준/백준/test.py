import matplotlib.pyplot as plt
import matplotlib.font_manager as fm
import numpy as np
import os

# ✅ 한글 폰트 자동 검색 (macOS용)
def find_font(name='AppleGothic'):
    # macOS의 기본 폰트 경로들
    font_paths = [
        '/Library/Fonts',
        '/System/Library/Fonts',
        '/System/Library/Fonts/Supplemental',
        os.path.expanduser('~/Library/Fonts')
    ]
    
    for path in font_paths:
        if os.path.exists(path):
            for font_file in os.listdir(path):
                if name in font_file:
                    return os.path.join(path, font_file)
    
    # 폰트를 찾지 못한 경우 시스템 기본 폰트 사용
    return '/System/Library/Fonts/Supplemental/AppleGothic.ttf'

# 🔎 AppleGothic 폰트 로딩
font_path = find_font('AppleGothic')
font_prop = fm.FontProperties(fname=font_path)

# 💌 고백 메시지 대상
target = "현정!!!"

# 💗 하트 좌표 계산
t = np.linspace(0, 2 * np.pi, 1000)
x = 16 * np.sin(t)**3
y = 13 * np.cos(t) - 5 * np.cos(2*t) - 2 * np.cos(3*t) - np.cos(4*t)

# 🎨 그래프 그리기
plt.figure(figsize=(8, 6))
plt.plot(x, y, color='red', linewidth=2)
plt.fill(x, y, color='pink', alpha=0.6)
plt.axis('equal')
plt.axis('off')

# 💬 고백 메시지
plt.text(0, -2, f"{target} 사랑해!!", fontsize=20, color='darkred', ha='center', fontproperties=font_prop)
plt.text(0, -4, "내 마음 받아줘!", fontsize=16, color='black', ha='center', fontproperties=font_prop)
plt.title("사랑의 하트", fontsize=18, pad=20, fontproperties=font_prop)

plt.show()
