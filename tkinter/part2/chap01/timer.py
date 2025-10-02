import time

count = 10

while True:
    print(count)
    count = count - 1
    time.sleep(1)
    if count < 0:break