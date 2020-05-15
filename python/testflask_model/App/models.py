from flask_sqlalchemy import SQLAlchemy

#db = SQLAlchemy(app=app) #但是這樣又把App導回來
                            #程序路口就是manage又把app倒回來這樣不行
#db初始化有兩種方式第一種直接把app傳到這
#第二種使用對象去init app
db = SQLAlchemy()

def init_db(app): #不會掉這行代碼，只要不掉這個代碼，app就沒有綁定見了
    db.init_app(app)  #初始化app 
#但上面代碼必須在manage.py調用

class Person(db.Model):
    p_id = db.Column(db.Integer,primary_key=True,autoincrement=True)
    p_name = db.Column(db.String(16))
