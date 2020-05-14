import blue as temp_blue
from flask import Flask
from flask_script import Manager
from App.views import blue as temp_blue #從App中的views.py導入blue叫temp_blue



app = Flask(__name__)
app.register_blueprint(blueprint=temp_blue)

manager = Manager(app=app)

if __name__ == '__main__':
    manager.run()
#----------------------------------------#
#模板是呈現給用戶的介面
#在MVT中為T，實現VT的解耦，開發中VT有這N:M的關係，
#一個V可以調用任意T，一個T可以被任意V調用

#模板處理分為量個過程
#1.加載
#2.渲染

#模板代碼包含兩個部分
#1.靜態HTML
#2.動態插入的代碼段
#----------------------------------------#


