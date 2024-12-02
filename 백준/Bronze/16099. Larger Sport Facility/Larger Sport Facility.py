for _ in range(int(input())) :
    lt, wt, le, we = map(int, input().split())
    if (lt * wt == le *we) : print("Tie")
    elif (lt * wt > le *we) : print("TelecomParisTech")
    else : print("Eurecom")