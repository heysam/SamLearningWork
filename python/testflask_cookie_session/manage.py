# -*- coding: utf-8 -*
from flask import Flask
from flask_script import Manager
from flask_session import Session

from App.views import blue
from App.views2 import blue as blue2
from App.views_cookie import blue as BlueCookie
from App.views_session import blue as BlueSession
app = Flask(__name__)

app.config['SECRET_KEY'] = 'TestSession123' #使用session需要secret_key
#使用flask-session套件
app.config['SESSION_TYPE'] = 'redis' #redis要先啟動不然會有錯誤redis.exceptions.ConnectionError
                                     #redis-server
                                     #redis-cli登入查詢 輸入key * 會有key 可以用key
                                     #輸入指令get session= 會有數據安全的編碼
                                     #可以輸入 ttl session  查看默認時間是秒 會暫存31天

Session(app=app)


app.register_blueprint(blueprint=BlueCookie)
app.register_blueprint(blueprint=BlueSession)
app.register_blueprint(blueprint=blue) #註冊藍圖
app.register_blueprint(blueprint=blue2) #註冊views2，要先引入App裡的views2

manager = Manager(app=app)


#以下這段放到views.py裡面
#@app.route('/')
#def hello_world():
#    return 'Hello World!'
#但manage.py 和views.py需交互使用故需使用“藍圖”
#flask用來解決文件問題
#將請求從主文件中拆分到多個文件中
#安裝插件 pip install flask-blueprint
#初始化藍圖
#   創建一個類，構造藍圖
#   blue = Blueprint('blue', __name__)
#   在app 中註冊app.register_blueprint(blue)
#使用
#   @blue.route('/rule/')
#   def hello():
#       return 'Hello World

if __name__ == '__main__':
    manager.run()