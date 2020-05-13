#使用插件flask-script
#使用指令 python manage1.py runserver
#參數使用
#   -d          是否開啟調試模式
#   -r          是否自動重新加載文件
#   -h, --host  指定主機
#   -p, --port  指定端口
#   -threaded   是否使用多線程
#   -?,--help   查看幫助
import uuid

from flask import Flask, render_template, url_for, request, make_response, json, Response
from flask_script import Manager
from werkzeug.exceptions import abort
from werkzeug.utils import redirect

app = Flask(__name__)
manager = Manager(app=app)

@app.route('/')
def hello_world():
    return 'Hello World!'

@app.route('/hello/')
def hello():
    return render_template('hello.html')

@app.route('/params/<hehe>/') #默認標示是尖括號<name>
def params(hehe):             #name需要和對應的視圖函數的參數名字保持一致
                              #參數允許有默認值，如果有默認值不傳參數也是ok
                              #如果沒有默認值，參數在路由中必須傳遞
                              #默認參數類型是字符串
                              #參數語法<converter:var>   #converter類型
    print(type(hehe))
    print(hehe)
    return '獲取參數'
#<converter:variable_name>
#converter   類型
#string      接收任何沒有斜槓('/')的文件(默認)
#int         接受整型
#float       接收浮點型
#path        接收路徑，可接受斜線('/')
#uuid        只接受uuid 字符串，唯一碼，一種生成規則
#any         可以同時指定多種路徑，進行限定


####string#######################################
#@app.route('/get/<string:name>/')
#def get(name):
#    print(name)
#    print(type(name))
#    return '獲取參數，string'

####int#######################################
#@app.route('/get/<int:name>/')   #Django都會轉成string，flask保持int，只能用數字
#def get(name):
#    print(name)
#    print(type(name))
#    return '獲取參數，int'

####float#######################################
#@app.route('/get/<float:name>/')
#def get(name):
#    print(name)
#    print(type(name))
#    return '獲取參數，float'

####path#######################################
#@app.route('/get/<path:name>/')  #會轉成 str    /98k/ok3/ (英文＋數字都會)
#def get(name):
#    print(name)
#    print(type(name))
#    return '獲取參數，path'


####uuid#######################################
#先/getuuid取得uuid後，再將uuid方到/get/uuid:name 取得到頁面
#@app.route('/get/<uuid:name>/')  #會轉成uuid的類型
#def get(name):
#    print(name)
#    print(type(name))
#    return '獲取參數，uuid'
#@app.route('/getuuid/')
#def get_uuid():
#    return str(uuid.uuid4())   #記得要importuuid

####any#######################################
#@app.route('/any/<any(c,d,e):an>/') #任意元祖列表中c,d,e 其他都不行，和枚舉一個意思
#def any(an):
#    print(an)
#    print(type(an))
#    return 'Any'

####GET POST都能拿到#######################################
#django 視圖post get 都能請求，flask 中不行 必須添加methods=['GET' ,'POST']  自己配置請求方法
#methods 指定請求方法
# GET
# POST
# HEAD
# PUT
# DELETE
#可以使用Postman 或httpie查看
@app.route('/get/<uuid:name>/')  #會轉成uuid的類型
def get(name):
    print(name)
    print(type(name))
    return '獲取參數，uuid'
@app.route('/getuuid/', methods=['GET', 'POST'])
def get_uuid():
    return str(uuid.uuid4())   #記得要importuuid
@app.route('/any/<any(c,d,e):an>/')
def any(an):
    print(an)
    print(type(an))
    return 'Any'



####url_for#######################################
#   反向解析，根據函數名字，獲取反向路徑
#   url_for('函數名',參數名=value)
#   endpoint就是函數名字
#@app.route('/get/<uuid:name>/')  #會轉成uuid的類型
#def get(name):
#    print(name)
#    print(type(name))
#    return '獲取參數，uuid'
#@app.route('/getuuid/', methods=['GET', 'POST']) #hello.html
#def get_uuid():
#    return str(uuid.uuid4())
#@app.route('/any/<any(c,d,e):an>/')
#def any(an):
#    print(an)
#    print(type(an))
#    return 'Any'

#@app.route('/url/')
#def url():
#    print(url_for('get_uuid')) #需import url_for  默認是函數的名字
#    print(url_for('any',an='d'))
#    print(url_for('any',an='h'))
#    return '反向解析'





####Request#######################################
#服務器在接收到客戶端請求後，會自動創建Request對象
#Flask框架創建，Request對象不可修改
#屬性
#url         完整請求地址
#base url    去掉GET參數的url
#host url    只有主機和端口號的url
#path        路由中的路徑
#method      請求方法
#remote addr 請求的客戶端地址
#args        GET請求參數
#form        POST請求參數
#files       文件上傳
#headers     請求頭
#cookies     請求中的cookie

#@app.route('/request/')
#def req():
#    print(request)              #import request
#    print(type(request))        #<class 'werkzeug.local.LocalProxy'>類
#    print(request.method)       #GET
#    print(request.data)         #b''
#    print(request.args)         #argument 參數 get請求參數   ImmutableMultiDict([('password', '123')])
#    print(request.form)         #post相關請求數據            ImmutableMultiDict([])
#    print(request.files)        #                          ImmutableMultiDict([])
#    print(request.cookies)      #ImmutableMultiDict([('csrftoken', 'dqWv1C0l9QT1VqLY5wf9fd8l5F0rQvzW55dh7QyZeFte7xjAT4xf7OpSk4dZgIAi')])
#    print(request.remote_addr)  #127.0.0.1
#    print(request.user_agent)   #瀏覽器身份Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_4) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.1 Safari/605.1.15
#    print(request.url)          #http://127.0.0.1:5000/request/?password=123
#    return '請求，Request'

####Request GET#######################################
#@app.route('/request/' , methods=['GET', 'POST'])
#def req():
#    print(request)
#    print(type(request))
#    print(request.method)   #ImmutableMultiDict([('password', '123'), ('password', '456')])
#    print(request.data)
#    print(request.args)
#    print(request.form)
#    print(request.files)
#    print(request.cookies)
#    print(request.remote_addr)
#    print(request.user_agent)
#    print(request.url)      #http://127.0.0.1:5000/request/?password=123&password=456
#    return '請求，Request GET'

####Request POST#######################################
#使用POSTMAN   用POST  BODY 然後 Key輸入name，value輸入post
#也可以使用POSTMAN 使用文件上傳
#@app.route('/request/' , methods=['GET', 'POST'])
#def req():
#    print(request)
#    print(type(request))
#    print(request.method)   #ImmutableMultiDict([('password', '123'), ('password', '456')])
#    print(request.data)     #ImmutableMultiDict([('name', 'post')])
#    print(request.args)
#    print(request.form)
#    print(request.files)
#    print(request.cookies)
#    print(request.remote_addr)
#    print(request.user_agent)
#    print(request.url)      #http://127.0.0.1:5000/request/?password=123&password=456
#    return '請求，Request POST'



####Request get args#######################################
#網址使用 http://127.0.0.1:5000/request/?password=123&password=456&name=sam
#但是有個缺點是若沒有包含name會報錯誤

#@app.route('/request/' , methods=['GET', 'POST'])
#def req():
#    print(request.args['name'])  #sam
#所以使用request.args.get('name') 就會正常留空
#使用http://127.0.0.1:5000/request/?password=123&password=456
@app.route('/request/', methods=['GET', 'POST'])
def req():
    print(request.args.get('name'))  #None
    print(request.args.get('password')) # 有兩個password 默認會獲取最前面那一個
    print(request.args.getlist('password')) #可以列出
    return '請求，Request args'

#ImmutableMultiDict
#類似字典的數據結構
#與字典的區別，可以存在相同的鍵
#args和form都是ImmutableMultiDict的對象
#ImmutableMultiDict中數據獲取方式
#dict['uname']或dict.get('uname')
#獲取指定Key對應的所有值
#dict.getlist('uname')


####Response#######################################
#服務器返回會給客戶端的數據
#由程序員創建返回response對象
#1.直接返回Response對象
#2.通過make response (data,code)
#    -data返回數據內容
#    -code狀態碼
#3.返回文本內容、狀態碼
#4.返回模板(本質和3一樣)
#重定向 (發請求來，不一定會回響應)
#redirect()
#url_for('函數名',參數=value)
@app.route('/response/')
def resp():
    result = render_template('hello.html')
#    print(result)
#    print(type(result))
    response = make_response('<h2>test</h2>', 400) #打包 import make_response ，請求碼就變400了
    print(response)  #<Response 13 bytes [200 OK]>
    print(type(response)) #<class 'flask.wrappers.Response'>
    return response

####Redirect#######################################
#重定向
#@app.route('/redirect/')
#def redir():
#    return redirect(url_for('hello')) #反向解析
####Redirect response#######################################
@app.route('/redirect/')
def redir():
    response = redirect(url_for('hello'))
    print(response)
    print(type(response)) #<class 'werkzeug.wrappers.response.Response'>
    return response

####abort#######################################
#Method Not Allowed
@app.route('/abort/')
def ab():
    abort(405)


####Json Respose#######################################
@app.route('/json/')
def json_F():
    #result = json.jsonify({'name': 'value'})
    #result = json.jsonify(name='sam', age=28)
    result = json.dumps({'name':'sam','age':28})
    print(result)
    print(type(result)) #<class 'flask.wrappers.Response'>
    return result
#jsonify將數據格式化為json格式，同時設置返回類型為application/json
#json.dumps將數據格式化為json格式，沒有設置返回的數據類型，默認類型是text/html
#json格式只是一個字符串，可以用response修改

@app.route('/json1/')
def json_Response():
    result = '{"name":"Sam"}'
    response = Response(response=result,content_type='application/json')
    return response






if __name__ == '__main__':
    manager.run()