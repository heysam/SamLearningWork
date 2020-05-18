#定義類別、規劃物件
#物件的屬性(attribute)及方法(method)都要在類別中定義
class Demo:
    pass
d = Demo()  #d建立Demo形態的實體物件
            #d為Demo類別的建構子
            #利用建構子建立的物件稱為實體物件
print(type(d))


#init方法為Demo類別的建構子
############################################
class Demo():
    def __init__(self, name):  #實體方法，self表示實體自己
        self.name = name       #實體屬性，需用self存取
    def hello(self):
        print("Hello", self.name,"!")
d = Demo("Mary")               #實體物件Demo，使用變數Mary
d.hello()
d.name = "Tom"
d.hello()
#classmethod###########################################
class Demo:
    name = "Mary"           #類別屬性

    @classmethod            #裝飾子
    def hello(cls):         #類別方法
        print("Hello", cls.name, "!")
Demo.hello()                #類方法    Hello Mary!
Demo.name = "Sam"           #類屬性
Demo.hello()                #         Hello Sam !
#__init__()###########################################
class Demo:
    def __init__(self): #實體方法
        self.i = 9527   #實體屬性i 以9527當參數

    def hello(self):
        print("Hello", self.i)
d = Demo()
d.hello()
###########################################
class Demo2:
    def __init__(self, i):     #實體方法
        self.i = i             #實體屬性

    def hello(self):
        print("Hello", self.i)
d = Demo2(9528)                 #建立實體物件d，並代參數9528
d.hello()
###########################################
class Demo3:
    def __init__(self, i):                          #實體方法
        self.i = i                                  #實體屬性i
        self.data = ["9529", "9530", "9531", "9532"]#實體屬性data串列
    def hello(self):
        i = 0
        while i < self.i:
            print("Hello", self.data[i])
            i += 1
d = Demo3(3)                #建立實體物件d,並帶入參數3
d.hello()                   
###########################################
class Demo4:
    def __init__(self, i=2):                         #實體方法， i 預設為整數2
        self.i = i                                   #實體屬性i
        self.data = ["9533", "9534", "9535", "9536"] #實體屬性data
    def hello(self):
        i = 0
        while i < self.i:
            print("Hello", self.data[i])
            i += 1
d = Demo4()               #建立實體物件d
d.hello()

###########################################
類別屬性 = 專屬於類別物件的屬性
實體屬性 = 專屬於實體物件的屬性

類別屬性 用   類別方法     設定和存取
實體屬性 用 實體物件的方法  設定和存取
###########################################
class Demo:
    i = 0                       #類別屬性
    def __init__(self, i):      #實體方法
        self.i = i              #實體屬性
        Demo.i += 1             #方法存取或設定類別屬性必須連帶使用類別名稱Demo

d1 = Demo(9527)
print(d1.i)     #9527
print(Demo.i)   #1=0+1

d2 = Demo(9528)
print(d2.i)     #9528
print(Demo.i)   #2=1+1
###########################################

class Demo2:
    i = 0                   #類別屬性i
    def __init__(self, j):  #實體方法
        self.j = j          #實體屬性j
        Demo2.i += 1        #方法存取Demo2類別屬性i
d1 = Demo2(9529) 
print(d1.j)         #9529
print(d1.i)         #1    d1.i -> Demo2.i -> 0+1=1
print(Demo2.i)      #1=0+1
d2 = Demo2(9530)    
print(d2.j)         #9530
print(d2.i)         #2
print(Demo2.i)      #2=1+1

###########################################
class Demo3:
    i = 0                   #類別屬性

    def __init__(self, i):  #實體方法
        self.i = i          #實體屬性i
        Demo3.addi()

    @classmethod            #類別方法 可以取得類別屬性i
    def addi(cls):
        cls.i += 1          #存取類別屬性i
print(Demo3.i)    #0
d = Demo3(9531)
print(Demo3.i)    #1
print(d.i)         #9531   self.i = 9531 ->然後又執行Demo3.addi() 故cls.i為1了
print(Demo3.i)    #1
Demo3.addi()       #執行類別方法addi() ，
print(Demo3.i)    #2

###########################################
類別屬性  無法  存取或修改  實體屬性值
實體物件 已經是從 類別 創建出來的 個別實體
實體物件 和 類別物件 只有在 類別屬性 及 類別方法 有連結
類別方法可以回傳 同類別的 實體物件
class Demo4:
    i = 0                   #類別屬性

    def __init__(self, j):  #實體方法
        self.j = j          #實體屬性 j
        Demo4.i += 1

    @classmethod        
    def addi(cls, p):       #類別方法
        cls.i += 1
        return Demo4(p)    #回傳全新的Demo4建構子的參數

print(Demo4.i)          #0

d1 = Demo4(9532)        #建立實體物件 並有參數9532，並將Demo4.i 加1
print(d1.i)             #1
print(Demo4.i)          #1
print(d1.j)             #9532

d2 = Demo4.addi(9533)   # Demo4的addi並有參數 9533 並將cls.i 先加1為2了 ，又回傳全新的Demo4(p) 
                        #Demo4(2)
print(d2.j)             #9533
print(Demo4.j)          #AttributeError: type object 'Demo4' has no attribute 'j'
print(Demo4.i)          #3      因為有類別方法classmethod回傳新的參數Demo4(2)  2+1
print(d2.i)             #3


d3 = Demo4.addi(9534)   # Demo4的addi並有參數 9533 並將cls.i 先加1為4了 ，又回傳全新的Demo4(p)
print(d3.j)             #9534
print(Demo4.i)          #5      因為有類別方法classmethod故會
print(d3.i)             #5


