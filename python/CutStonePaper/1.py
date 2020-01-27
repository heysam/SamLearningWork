import random

def C_keyin():
    keyin=random.choice(['剪刀','石頭','布'])
    return keyin
def P_keyin():
    P_list = ("剪刀","石頭","布")
    x=0
    while (x==0):
        people_keyin = input("請輸入‘剪刀’ ’石頭’或 ‘布‘:")
        if (people_keyin in P_list):
            x=1
            return people_keyin
        else:
            print("別亂")
    
def game():
    # print("因為這個每次呼叫出來的都不一樣，所以我先讓他成為一個變數",
    #         C_keyin())
    # print("                                               ",C_keyin())
    c_keyin=C_keyin()#所以先變成一個變數
    p_keyin=P_keyin()
    #print("1",p_keyin)
    if (p_keyin==c_keyin):
        print("你出'%s' 電腦出'%s' 沒輸沒贏喔" % (p_keyin,c_keyin))
    elif ((p_keyin=="剪刀" and c_keyin=="布") or 
        (p_keyin=="石頭" and c_keyin=="剪刀") or 
        (p_keyin=="布" and c_keyin=="石頭")):
        print("你出'%s' 電腦出'%s' 你贏" % (p_keyin,c_keyin))
    else:
        print("你出'%s' 電腦出'%s' 你輸" % (p_keyin,c_keyin)) 
        #本來要再寫一次判斷，可是都判斷完了，就直接else
game()
