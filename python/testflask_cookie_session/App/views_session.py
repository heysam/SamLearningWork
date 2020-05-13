from flask import Blueprint, url_for, render_template, request, Response, session
from werkzeug.utils import redirect

blue = Blueprint('blue_session',__name__)

@blue.route('/')
def hello_world():
    return 'Hello World!'

@blue.route('/home_session/')
def home_session():

    username = session.get('user')

    return render_template('home_session.html', username=username)

@blue.route('/login_session/', methods=['GET', 'POST']) #需要加上methods 不然會有錯誤Method Not Allowed

def login():
    if request.method == "GET":
        return render_template('login_session.html')
    elif request.method == "POST":
        username =request.form.get('username')
        print(username)
        #開始使用cookie技術
        resp = Response(response='登入成功!  %s' %username)

        #如果用session如下
        session['user'] = username

        return resp
        #這樣登入成功後，返回home頁面 cookies 就會紀錄manage.py的SECRET_KEY，session=TestSession123
        #但session默認應該在數據庫或是內存中，但是不同的框架有不同的處理
        #ex:django 序列化到數據庫中，flask存取到redis中性能較高
        #flak的cookies支持中文，會自動轉碼，讀取的時候再解碼


@blue.route('/logout/')
def logout(): #退出把cookies刪了
    resp = redirect(url_for('blue_session.home'))
    resp.delete_cookie('user') #到home.html配置
    return resp
#cookie###############
#cookie本身由瀏覽器保存，通過Response將cookie寫到瀏覽器上，
#下一次訪問，瀏覽器會根據不同的規則攜帶cookie過來
#    response.set_cookie(key,value[,max_age=None,exprise=None)]
#    request.cookie.get(key)
#cookie 不能跨域名
#cookie不能跨瀏覽器

#跨越請求傳遞數據Ex：上一次拿回來的數據，這一次我要用
#web開發中使用的短連結
#cookie
#   客戶端會話技術
#   數據都是儲存在瀏覽器中
#   支持過期
#   不能跨域名
#       frame標籤
#       可以直接加載整個網頁
#   不能跨瀏覽器
#   flask中的對cookies可以支持中文
#       flask對cookies中的內容做了編碼
#session
#   服務端技術
#   對數據進行安全操作
#   默認在內存中
#       不容易管理
#       容易丟失
#       不能多台電腦寫作
#flask-session默認有效期為31天

#token

#######cookie

