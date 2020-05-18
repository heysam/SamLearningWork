def func():              #普通函數
    return 0
type(func)   #function
#----------------------------------------------------------------------------
class ClassB(object):     #通過類名調用類內的非靜態函數

                          #非靜態https://kknews.cc/zh-tw/code/vy9v992.html
                          #https://www.ycc.idv.tw/introduction-object-oriented-programming_2.html
                          #(object)表示該類從哪個類繼承來
                          #object類是所有類都會繼承的類
    def func():
        return 'Hello'
print(type(ClassB()))       #__main__.ClassB
print(type(ClassB))         #type
print(type(ClassB.func))    #function
print(type(ClassB.func()))  #str
print(type(ClassB().func))  #methon
print(type(ClassB().func()))#TypeError: func() takes 0 positional arguments but 1 was given
ClassB().func              #<bound method ClassB.func of <__main__.ClassB object at 0x10fbb3a20>>
#----------------------------------------------------------------------------
#方法是存儲在類屬性中的函數
class ClassB(object):
    def funcB(self):
        return 1
type(ClassB.funcB)     #function  通過類    直接訪問funcB
type(ClassB().funcB)   #methon    通過類實例    訪問funcB
ClassB.funcB()         #Traceback (most recent call last):
ClassB.funcB(None)     #1  #function类型，不用创建实例，直接调用
ClassB.funcB(ClassB()) #1  #function类型，实例在参数中传入
ClassB().funcB()       #1  #method类型，创建实例，然后调用
ClassB.funcB()         #funcB() missing 1 required positional argument: 'self'
#----------------------------------------------------------------------------
def aa(d, na=None, *kasd, **kassd):  #一個*是tuple型態
                                     #兩個**是dict型態，呼叫時需要用等號設定數值
    pass
class A(object):
    def f(self):
        return 1
a = A()
print("######各自方法描述######")
print("##函式     %s" % aa)
print("##類方法   %s" % A.f)
print("##例項方法 %s" % a.f)

#----------------------------------------------------------------------------
#   ClassB直接調用funcB()   ClassB.funcB()         funcB=>function
#   ClassB實例調用funcB()   ClassB().funcB()       funcB=>method
#Function 是包含一個函式(def)頭和一個函式體，同樣支援0到n個
#Method   是在function的基礎上, 多了一層類的關係, 正因為這一層類, 
#         所以區分了 function 和 method.而這個過程是通過 PyMethod_New實現的
#----------------------------------------------------------------------------
#https://blog.csdn.net/u013553529/article/details/79244083
#https://codertw.com/%E7%A8%8B%E5%BC%8F%E8%AA%9E%E8%A8%80/118089/


#############################################################################
#self 用法
#############################################################################
class ClassB(object):
    pass
ClassBinstance = ClassB()           #實例化
print(type(ClassBinstance))         #__main__.ClassB
#---------------------------------------------------------------------------
'''
__init__()
是作為建構式 (constructor)，
在初始化 (initialize) class 的實例 (instance) 時被呼叫
也稱 建構子，就是在建立 物件實體(instance)的時候執行的方法  
http://blog.castman.net/%E6%95%99%E5%AD%B8/2018/05/08/python-special-names-1.html
'''
#可以在創建實例時，把屬性強制填寫進去，使用內置函數__init__
class Student(object):
    def __init__(self,name1,score1): #1.第一參數永遠是self，表示創建類實體本身，
                                     #  就可以把各種屬性綁訂到self，
                                     #  self就指向創建的實例本身 
                                     #2.創建實例時，不能傳入空的參數，
                                     #  self不須傳入，會自己把實例便量傳入
                                     #  self指Student類本身
        self.names=name1  #self.name=>Student類的屬性變量，是Student類所有
                          #name是外部傳來的參數，不是Student所自帶的，
                          #self.name=name1 意思為，把外部傳來的參數name1的值
                          #給Student類自己的屬性便量self.names
        self.scores=score1
students = Student("Sam",99)
print(students.names)           #Sam
print(students.scores)           #99

#----------------------------------------------------------------------------
#類的方法
class Student(object):
    def __init__(self,name1,score1):
        self.name=name1
        self.score=score1
    def show_score(self):
        print("名字:%s ,分數:%s" % (self.name,self.score))
student = Student("Sam",99)
student.show_score()       #名字:Sam ,分數:99
#----------------------------------------------------------------------------
