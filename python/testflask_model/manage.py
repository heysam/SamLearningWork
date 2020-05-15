from flask import Flask
from flask_script import Manager
from App.views import blue as blue1
from App.models import init_db
app = Flask(__name__)
app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///sqlite3.db' #連接DB
app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] =False #更好的兼容性，不然會有警告
app.register_blueprint(blueprint=blue1)

#db = SQLAlchemy(app=app)#app創建一個SQLalchemy 
                        #但是這樣導入DB會造成循環導入有錯誤
                        #故直接在model.py導入
init_db(app) #調用modeel.py的init_db把app傳過去   #記得要import

manager = Manager(app=app)

if __name__ == '__main__':
    manager.run()  

